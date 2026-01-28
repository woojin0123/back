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
-- 6. 조회수 기본값을 사용하여 게시글을 추가하시오.
-- 7. 오늘 날짜로 주문 정보를 추가하시오.
-- 8. VIP 회원의 ID를 사용하여 주문을 추가하시오.
-- 9. 중복 키 오류가 발생해도 무시하고 회원을 추가하시오.
-- 10. 회원이 없으면 추가하고, 있으면 포인트를 100 증가시키시오.
-- 11. board 테이블의 데이터를 복사하여 새 게시글로 추가하시오.
-- 12. 주문 금액이 100000 이상인 주문만 새로운 주문으로 복사하시오.
-- 13. 모든 필수 컬럼을 포함하여 상품을 추가하시오.
-- 14. 트랜잭션을 사용하여 회원을 추가하시오.
-- 15. member 테이블의 데이터를 백업 테이블에 저장하시오.