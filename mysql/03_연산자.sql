SELECT * FROM member;

/*
    산술 연산자
        + 덧셈
        - 뺄셈
        * 곱셉
        / 나눗셈
*/
-- 1. 회원 포인트에 100을 더한 값을 조회하시오.
SELECT name, point AS 기존포인트, point+100 AS 100점추가 FROM member;
-- 2. 회원 포인트에서 50을 차감한 값을 조회하시오.
SELECT name, point-50 FROM member;
-- 3. 포인트를 2배로 계산하여 조회하시오.
SELECT name, point*2 AS '두배로 인상' FROM member;
-- 4. 포인트를 10으로 나눈 값을 조회하시오.
SELECT name, point/10 FROM member;


/*
    비교 연산자
        =       같다
        !=      같지 않다
        <>      같지 않다
        >       크다
        <       작다
        >=      크거나 같다
        <=      작거나 같다
*/

-- 비교연산자
-- 5. 등급이 VIP인 회원을 조회하시오.
SELECT * FROM member
WHERE grade = 'VIP';
-- 6. 등급이 VIP가 아닌 회원을 조회하시오.
SELECT * FROM member
WHERE grade != 'VIP';
-- 7. 포인트가 500 초과인 회원을 조회하시오.
SELECT * FROM member
WHERE point > 500;
-- 8. 나이가 30 이상인 회원을 조회하시오.
SELECT * FROM member
WHERE age >= 30;
/*
    데이터베이스 = 스키마
    테이블 = 릴레이션
    열 = 필드 = 컬럼 > 속성(attribute)
    행 = 레코드 = 튜플 
*/

/*
    논리연산자
        AND     그리고  조건 결과가 모두 참이면 TRUE
        OR      또는    조건 결과가 모두 거짓이면 FALSE
        NOT     아니다  TRUE면 FALSE, FALSE면 TRUE
        - 논리연산과 비교연산의 TRUE 또는 FALSE
        > 조건절에 사용
*/

-- 논리연산자
-- 9. 성별이 F이고 포인트가 500 이상인 회원을 조회하시오.
SELECT * FROM member
WHERE gender = 'F' AND point >= 500;

-- 10. 등급이 GOLD 또는 VIP인 회원을 조회하시오.
SELECT * FROM member
WHERE grade = 'GOLD' OR grade = 'VIP';

SELECT * FROM member
WHERE grade IN ('GOLD', 'VIP');

-- 11. 성별이 M이 아닌 회원을 조회하시오.
SELECT * FROM member
WHERE NOT gender = 'M';

-- 12. 포인트가 200에서 700 사이인 회원을 조회하시오.
SELECT * FROM member
WHERE point BETWEEN 200 AND 700;

-- 13. 등급이 BRONZE 또는 SILVER인 회원을 조회하시오.
SELECT * FROM member
WHERE grade IN('GOLD' OR 'VIP');

-- 14. 이름에 '수'가 포함된 회원을 조회하시오.
SELECT * FROM member
WHERE name LIKE '%수%';

-- 15. 포인트가 NULL인 회원을 조회하시오.
SELECT * FROM member
WHERE point IS NULL;

-- 16. 포인트가 NULL이 아닌 회원을 조회하시오.
SELECT * FROM member
WHERE point IS NOT NULL;

-- 17. 회원 등급을 중복 없이 조회하시오.
SELECT DISTINCT grade FROM member;