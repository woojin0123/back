-- member-- SQL 표준 주석
# MySQL 주석
-- ctrl+enter: 커서가 있는 문장 실행 또는 블록 설정한 여러 문장 실행
-- 문장 끝은 세미콜론;

-- 스키마(DB) 생성
CREATE SCHEMA `mydb` DEFAULT CHARACTER SET utf8mb4 ;

-- 스키마 사용
USE mydb;

-- 스키마 삭제
DROP DATABASE basic; 
/*
-- ctrl+d: 한줄 복제 or 선택한 영역 복제

	DB 구축: DDL
		1. 사용자 정의: root, hong
			- 아이디, 패스워드, 권한 설정(DBA)
        2. 스키마(DB) 생성
        3. 테이블 생성
            CREATE TABLE 테이블명 (
				컬럼 데이터타입 [제약조건] [기타 속성],
                컬럼 데이터타입 [제약조건] [기타 속성],
                ...
                FOREIGN KEY (현재 테이블의 칼럼) REFERENCES 참조할 테이블(참조할 테이블의 칼럼)
			);
            
            테이블/컬럼 이름 규칙
				1. 영문자, 숫자, _(언더바)
                2. 첫 글자는 숫자x
                3. 최대 길이는 64자
                4. 예약어x (단, 백틱(`)로 묶으면 예약어도 사용 가능하나 권장하지 않음)
                5. 윈도우 시스템에서는 대소문자 구분x, 구분하는 시스템도 있다(예, Linux)
                6. 테이블명은 복수로, 컬럼명은 단수로 (관례)
                7. 소문자, 스네이크 표기법 (관례)
                
			데이터 타입
				1. 숫자
					INT: 정수
					BIGINT: 큰 정수
					DECIMAL(p,s): 금액, 정확한 소수
                2. 문자
					CHAR(n): 고정 길이 예) 주번 - 13자
                    VARCHAR(n): 가변 길이 예) 이름 - 2자, 3자, ~
                    TEXT: 대용량 문자열
                3. 날짜/시간
					DATETIME: 로컬 시간
                    TIMESTAMP: UTC 기준
                4. 불리언
					BOOLEAN -> TINYINT(1)
                5. 이진 데이터: 이미지, 동영상 등
					TINYBLOB: 255B
					BLOB: 64KB - 작은 아이콘, 설정 파일
                    MEDIUMBLOB: 16MB - 일반 이미지
                    LONGBLOB: 4GB - 고화질 이미지, 동영상
                    
			제약 조건
				1. NOT NULL: 빈 값(NULL)을 허용하지 않음 -> 필수 입력
                2. UNIQUE: 중복 값을 허용x -> 유일성(UQ), 단 NULL은 허용!
                3. PRIMARY KEY: 기본키(PK) -> 행 구별, 중복x(유일성)
                4. FOREIGN KEY: 외래키(FK)
                5. CHECK: 입력되는 값이 특정 조건(예, price>0)을 만족하는지 검사
                6. DEFAULT: 값을 입력하지 않았을 때 자동으로 들어갈 값
                
			기타 속성
				1. AUTO_INCREMENT: 자동으로 1씩 증가 (1, 2, 3, ...)
					-> 기본키를 지정한 컬럼에 설정한다.
            
*/
-- 1. 회원 정보(회원 아이디, 이름, 나이, 성별, 가입일자)를 저장하는 member 테이블을 생성하시오.
-- 윈도우 시스템에서 MySQL은 대소문자를 구별하지 않는다.
-- 명령어는 대문자로 (관례)

-- 테이블 생성
-- 테이블/컬럼 이름에 백틱(`)은 생략 가능
CREATE TABLE `member` (
	`member_id` INT PRIMARY KEY AUTO_INCREMENT, 
    `name` VARCHAR(50), 
    `age` INT, 
    `gender` CHAR(1), 
    `regdate` DATE
);

-- 2. 이름(product_name)은 필수 입력인 product 테이블을 생성하시오.
	-- : 필수 입력: 해당 칼럼에 데이터를 반드시 입력하도록 조건을 저장
    /*
		MySQL 전용 속성
			1. AUTO_INCREMENT: 자동으로 1씩 증가 (1, 2, 3, ...)
					-> 기본키를 지정한 컬럼에 설정한다.
			2. Unsigned
            3. Zero Fill
            4. Binary
            5. Generated
    */
CREATE TABLE product (
	product_id INT PRIMARY KEY AUTO_INCREMENT,
	product_name VARCHAR(100) NOT NULL,
    price INT
);

-- 3. 조회수(view_cnt) 기본값이 0인 board 테이블을 생성하시오.
CREATE TABLE board (
	board_no INT PRIMARY KEY AUTO_INCREMENT, 
    title VARCHAR(200),
    view_cnt INT DEFAULT 0 
    );
    
-- 4. 이메일(email)이 중복되지 않는 user 테이블을 생성하시오.
CREATE TABLE user (
	user_id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

-- 5. 주문(orders) 테이블을 생성하고 회원(member) 테이블을 참조하도록 설정하시오.
CREATE TABLE orders (
order_id INT PRIMARY KEY AUTO_INCREMENT,
member_id INT,
order_date DATE,
-- 외래키 설정: 현재 테이즐의 member_id 칼럼은 member 테이블의 member_id를 참조한다.
FOREIGN KEY (member_id) REFERENCES member (member_id)
);

/*
DDL: CREATE. ALTER, DROP

 테이블 수정 
 *안바꾸는 건 그대로 작성하면 됨
 // 1. 컬럼 추가 (ADD)
	ALTER TABLE 테이블명 
    ADD 컬럼명 데이터타입 [제약조건];
    
// 2. 데이터 타입과 제약 조건 변경 (MODIFY)
	ALTER TABLE 테이블명 
    MODIFY 컬럼명 데이터타입 [제약조건];
    
// 3. 컬럼의 이름&타입 변경 (CHANGE)
	ALTER TABLE 테이블명 
    CHANGE 컬럼명1 컬럼명2 데이터타입 [제약조건];
    
// 4. 컬럼의 이름만 변경(MySQL 8.0+) (RENAME COLUMN)
	ALTER TABLE 테이블명
    RENAME COLUMN 변경전컬럼명 TO 변경후컬럼명;
    
// 5. 컬럼 삭제 (DROP)
	ALTER TABLE 테이블명 
    DROP [COLUMN] 컬럼명;
	- COLUMN 쓰는 것이 표준, MySQL은 생략 가능
    
// 6. 컬럼 제약 조건 삭제 (DROP INDEX)
	ALTER TABLE 테이블명
    DROP INDEX 컬럼명;
*/

-- 6. member 테이블에 phone 컬럼을 추가하시오.
	ALTER TABLE member 
	ADD phone VARCHAR(20);
    
-- 7. member 테이블의 name 컬럼 길이를 100으로 변경하시오.
	ALTER TABLE member
	MODIFY name VARCHAR(100);
    
-- 8. member 테이블의 phone 컬럼명을 mobile로 변경하시오.
	ALTER TABLE member
    RENAME COLUMN phone TO mobile;
    
-- 9. member 테이블에서 age 컬럼을 삭제하시오.
	ALTER TABLE member
    DROP COLUMN age;
        
-- 10. member 테이블의 email 컬럼에 UNIQUE 제약조건을 추가하시오.
	ALTER TABLE member
    ADD email VARCHAR(100) UNIQUE;
    
-- 11. email UNIQUE 제약조건을 삭제하시오.
-- MySQL에서 컬럼에 UNIQUE 제약 조건을 설정하면 시스템은 중복값을 빠르게 체크하기 위해
-- 내부적으로 해당 컬럼에 index를 자동 생성함 > UNIQUE 제약 조건을 삭제하려면 생성된 index를 삭제해야함
	ALTER TABLE member
    DROP INDEX email;
    
/*
	테이블 이름 변경
		ALTER TABLE 기존테이블명 RENAME TO 새테이블명;
            
	테이블 삭제
		DROP TABLE 테이블명;
*/

-- 12. member 테이블 이름을 customer로 변경하시오.
ALTER TABLE member RENAME TO customer;
-- 12-1. customer 테이블 이름을 member로 변경하시오.
RENAME TABLE customer TO member;

-- 13. product 테이블을 삭제하시오.
DROP TABLE product;

/*
	DML: 
		데이터 조회: SELECT
        데이터 삽입: INSERT
        데이터 변경: UPDATE
        데이터 삭제: DELETE
        
	데이터 삽입
		INSERT INTO 테이블명 (컬럼1, 컬럼2, ...)
		VALUES (컬럼1값, 컬럼2값)

	테이블 삭제 > 구조 삭제
		DROP TABLE 테이블명; // 롤백X, AI초기화O
	데이터 삭제 > 데이터만 삭제
		DELETE FROM 테이블명; // 롤백O, AI초기화X
        TRUNCATE TABLE 테이블명; // 롤백X, AI초기화O
*/

-- 14. board 테이블의 모든 데이터를 삭제하시오.
DELETE FROM board;
TRUNCATE TABLE board;
    
/*
	CREATE TABLE 새테이블명 AS
    SELECT * FROM 기존테이블명
*/
-- 15. member 테이블 구조와 데이터를 복사하여 member_backup 테이블을 생성하시오.
-- member 테이블의 모든 컬럼을 조회해서 조회한 컬럼으로 member_backup 테이블을 생성한다
CREATE TABLE member_backup AS
SELECT * FROM member;
-- * 는 모든 컬럼 지칭

DESC member;

ALTER TABLE member
DROP COLUMN phone;

/*
	트랜젝션(Transaction)
*/
-- 테이블 생성
CREATE TABLE test (
	id INT PRIMARY KEY,
    name VARCHAR(30)
) ENGINE=InnoDB;

-- 데이터 삽입
-- *여러 정보 넣을 때 드래그+ctrl+shift+enter
INSERT INTO test VALUES (1, 'A');
INSERT INTO test VALUES (2, 'B');
INSERT INTO test VALUES (3, 'C');

-- 세이프모드 해제
SET SQL_SAFE_UPDATES = 0;

-- 1. 트랜젝션 시작
START TRANSACTION;

-- 2. 데이터 삭제
DELETE FROM test;
TRUNCATE TABLE test;

-- 3. 데이터 확인(조회)
SELECT * FROM test;

-- TCL: 
-- 4. 트렌젝션 종료: COMMIT or ROLLBACK;
COMMIT;
ROLLBACK;