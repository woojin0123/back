/*
    INSERT INTO 테이블 [(컬럼1, 컬럼2, ...)] VALUES
    (값1, 값2, ...),
    (값1, 값2, ...),
    ...
    (값1, 값2, ...);

        - 컬럼 갯수와 값 갯수는 일치해야함
        - 컬럼을 생략하면 모든 컬럼에 대한 값을 지정
*/
INSERT INTO board VALUES
(1,'공지사항','admin',100,'2024-01-01');

INSERT INTO product VALUES
(1,'노트북',150000,10,'전자제품');

INSERT INTO orders VALUES
(1,1,120000,'주문완료','2025-01-01');


-- 1. member 테이블에 새로운 회원을 1명 추가하시오.
INSERT INTO member (gender) VALUES ('M');

INSERT INTO member VALUES
(4, '이기자', 20, 'F', 20, 'SILVER', '2026-01-01');

/*
    날짜/시간 함수
        CURDATE():  현재 날짜           (YYYY-MM-DD)
        NOW():      현재 날짜와 시간    (YYYY-MM-DD HH:MM:SS)
*/

-- 2. 이름, 나이, 성별만 지정하여 회원을 추가하시오.
INSERT INTO member (name, age, gender)
VALUES ('홍만호', 25, 'M');

-- 3. 회원 번호는 자동 증가로 두고 회원을 추가하시오.
INSERT INTO member (name, age, gender, point, grade, regdate)
VALUES ('김철수', 40, 'M', 300, 'GOLD', CURDATE());

-- 4. 회원 2명을 한 번에 추가하시오.
INSERT INTO member VALUES
(7, '정우성', 43, 'M', 50, 'VIP', '2023-01-01'),
(8, '이정재', 45, 'F', 30, 'GOLD', '2022-01-01');

-- 5. 카테고리가 없는 상품을 추가하시오.
INSERT * FROM product;
INSERT INTO product (product_name, price, stock, category)
VALUES ('USB케이블',8000,15,'');

SELECT * FROM product;
-- 데이터 수정
UPDATE product 
SET price = 8000, stock = 15, category = NULL
WHERE product_name = 'USB케이블';

-- 6. 조회수 기본값을 사용하여 게시글을 추가하시오.
SELECT * FROM board;
INSERT INTO board (title, writer, regdate)
VALUES ('새 글', 'cha', CURDATE());
ALTER TABLE board 
MODIFY view_cnt INT DEFAULT 0;
DELETE FROM board
WHERE board_no = 10;

-- 7. 오늘 날짜로 주문 정보를 추가하시오.
SELECT * FROM orders;
INSERT INTO orders
VALUES (2, 1, 150000, '주문완료', CURTIME());
DELETE FROM orders
WHERE order_id = 1;

-- 8. VIP 회원의 ID를 사용하여 주문을 추가하시오.
SELECT * FROM orders;

INSERT INTO orders (member_id, total_price, status, order_date)
SELECT member_id, 200000, 'VIP주문', CURDATE()
FROM member 
WHERE grade='VIP';

/*
    특수한 INSERT문
        INSERT IGNORE INTO 테이블 [(컬럼1, 컬럼2, ...)]
        VALUES (값1, 값2, ...)
        ON DUPLICATE KEY UPDATE 컬럼1=값1, 컬럼2=값2,...
*/
-- 9. 중복 키 오류가 발생해도 무시하고 회원을 추가하시오.
SELECT * FROM member;
INSERT IGNORE INTO member (member_id, name, age, gender)
VALUES (7, '중복회원', 40, 'M')
ON DUPLICATE KEY UPDATE name='중복회원', age=40, gender='M';

/*
    서브쿼리
        - 쿼리 안의 쿼리
        - 단일행 서브쿼리: 하나의 값(행, 열) 반환
        - 다중행 서브쿼리: 여러행 반환

        INSERT INTO 테이블a (컬럼, ...)
        SELECT 컬럼, ...
        FROM 테이블b
        [WHERE 조건]

        INSERT INTO 테이블 (컬럼, ...)
        VALUES (
            (SELECT 컬럼, ...
            FROM 테이블
            WHERE 조건),
            값, ...
        );
*/
-- 10. 회원이 없으면 추가하고, 있으면 포인트를 100 증가시키시오.
INSERT INTO member (member_id, name, age, gender, point) 
VALUES (17, '김중복', 35, 'F', 200)
ON DUPLICATE KEY UPDATE name = '김종복', age=35, gender='F', point = point + 100;
SELECT * FROM member;

INSERT INTO member (member_id, name, point)
VALUES (1,'홍길동',100)
ON DUPLICATE KEY UPDATE point=point+100;

-- 11. board 테이블의 데이터를 복사하여 새 게시글로 추가하시오.
INSERT INTO board (title, writer, regdate) 
SELECT title, writer, CURDATE()
FROM board
WHERE board_no < 5;

SELECT * FROM board;

-- 12. 주문 금액이 100000 이상인 주문만 새로운 주문으로 복사하시오.
INSERT INTO orders (member_id, total_price, status, order_date) 
SELECT member_id, total_price, status, order_date
FROM orders
WHERE total_price >= 100000;

SELECT * FROM orders;

-- 13. 모든 필수 컬럼을 포함하여 상품을 추가하시오.
SELECT * FROM product;

INSERT INTO product (product_name, price, stock, category)
VALUES ('스마트폰', 800000, 20, '전자제품');

/*

*/
-- 14. 트랜잭션을 사용하여 회원을 추가하시오.
START TRANSACTION;
INSERT INTO member (member_id, name, age, gender, point)
VALUES (NULL, '박지만', 25, 'F', 500);
COMMIT;
ROLLBACK;

START TRANSACTION;
INSERT INTO member (name, age, gender) 
VALUES ('트랜잭션회원',33,'M');
ROLLBACK;

-- 15. member 테이블의 데이터를 백업 테이블에 저장하시오.

INSERT INTO member_backup
SELECT * FROM member;

SELECT * FROM member_backup;