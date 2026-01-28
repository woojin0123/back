/*
    SQL
        1. DDL
            - DB(스키마) 생성, 삭제
            - 테이블 생성, 삭제, 변경
        2. DML
            - insert    Create
            - select    Read
            - update    Update
            - delete    Delete
        3. DCL+TCL
*/
/*
    DELETE FROM 테이블
    WHERE 조건
*/

-- 1. member_id가 3인 회원을 삭제하시오.
DELETE FROM member
WHERE member_id = 3;

-- 2. 이름이 '중복회원'인 회원을 삭제하시오.
DELETE FROM member
WHERE name = '중복회원';

-- 3. 나이가 25 미만인 회원을 삭제하시오.
DELETE FROM member
WHERE age < 25;

-- 4. 성별이 F이고 등급이 SILVER인 회원을 삭제하시오.
DELETE FROM member
WHERE gender = 'F' AND grade = 'SILVER';

-- 5. 등급이 VIP 또는 GOLD인 회원을 삭제하시오.
DELETE FROM member
WHERE grade IN('VIP', 'GOLD');

-- 6. 주문 번호가 1~2 사이인 주문을 삭제하시오.
DELETE FROM orders
WHERE order_id BETWEEN 1 AND 2;

INSERT INTO member VALUES
(1, '홍길동',35,'M', 0, 'VIP','2023-01-01'),
(2, '이순신',22,'M', 0, 'BRONZE','2022-01-01'),
(3, '김영희',19,'F', 0, 'BRONZE','2025-01-01'),
(8, '박철수',45,'M', 0, 'GOLD','2021-01-01'),
(10, '최민수',31,'F', 0, 'SILVER','2024-01-01');

-- 7. 2022년 이전에 가입한 회원을 삭제하시오.
DELETE FROM member
WHERE regdate < '2022-01-01';

-- 8. 카테고리가 NULL인 상품을 삭제하시오.
DELETE FROM product
WHERE category IS NULL;

-- 9. 제목에 '테스트'가 포함된 게시글을 삭제하시오.
DELETE FROM board
WHERE title LIKE '%테스트%'

-- 10. 평균 주문 금액보다 작은 주문을 삭제하시오.
DELETE FROM orders
WHERE total_price < (
    -- 임시 테이블로 감싸서 해결
    SELECT avg_price 
    FROM (
        SELECT AVG(total_price) AS avg_price 
        FROM orders
    ) AS temp -- 반드시 별칭(Alias)을 붙여야 합니다.
);

-- 11. 게시글을 2개 이상 작성한 작성자의 게시글을 삭제하시오.
DELETE FROM board
WHERE writer IN (
    SELECT writer 
    FROM (
        SELECT writer 
        FROM board 
        GROUP BY writer 
        HAVING COUNT(*) >= 2
    ) AS temp_writers
);

-- 12. 등급이 BRONZE인 회원의 주문을 삭제하시오.
DELETE orders FROM orders
JOIN member ON orders.member_id = member.member_id
WHERE member.grade = 'BRONZE';

-- 13. 주문 상태가 '취소'인 주문을 삭제하시오.
DELETE FROM orders WHERE status = '취소';

-- 14. board 테이블의 모든 데이터를 삭제하시오.
DELETE FROM board;

-- 15. 같은 제목의 게시글이 여러 개일 경우, 가장 최근 글을 제외하고 삭제하시오.
DELETE b1
FROM board b1 JOIN board b2
ON b1.title = b2.title
AND b1.board_no < b2.board_no;


SELECT * FROM member;
SELECT * FROM orders;
SELECT * FROM product;
SELECT * FROM board;