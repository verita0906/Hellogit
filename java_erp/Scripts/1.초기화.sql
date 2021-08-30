-- 내 스키마
DROP SCHEMA IF EXISTS java_erp;

-- 내 스키마
CREATE SCHEMA java_erp;

-- 사원
CREATE TABLE java_erp.employee (
	empno   INTEGER     NOT NULL COMMENT '사원번호', -- 사원번호
	empname VARCHAR(50) NOT NULL COMMENT '사원명', -- 사원명
	manager INTEGER     NULL     COMMENT '직속상사', -- 직속상사
	salary  INTEGER     NULL     COMMENT '급여', -- 급여
	empno2  INTEGER     NULL     COMMENT '부서명' -- 부서명
)
COMMENT '사원';

-- 사원
ALTER TABLE java_erp.employee
	ADD CONSTRAINT PK_employee -- 사원 기본키
		PRIMARY KEY (
			empno -- 사원번호
		);

-- 부서
CREATE TABLE java_erp.department (
	deptno   INTEGER     NOT NULL COMMENT '부서번호', -- 부서번호
	deptname VARCHAR(50) NOT NULL COMMENT '부서명', -- 부서명
	floor    INTEGER     NULL     COMMENT '위치', -- 위치
	empno    INTEGER     NULL     COMMENT '사원번호' -- 사원번호
)
COMMENT '부서';

-- 부서
ALTER TABLE java_erp.department
	ADD CONSTRAINT PK_department -- 부서 기본키
		PRIMARY KEY (
			deptno -- 부서번호
		);

-- 직책
CREATE TABLE java_erp.Title (
	tno   INTEGER     NOT NULL COMMENT '직책번호', -- 직책번호
	tname VARCHAR(50) NOT NULL COMMENT '직책명' -- 직책명
)
COMMENT '직책';

-- 직책
ALTER TABLE java_erp.Title
	ADD CONSTRAINT PK_Title -- 직책 기본키
		PRIMARY KEY (
			tno -- 직책번호
		);

-- 사원
ALTER TABLE java_erp.employee
	ADD CONSTRAINT FK_Title_TO_employee -- 직책 -> 사원
		FOREIGN KEY (
			manager -- 직속상사
		)
		REFERENCES java_erp.Title ( -- 직책
			tno -- 직책번호
		);

-- 사원
ALTER TABLE java_erp.employee
	ADD CONSTRAINT FK_employee_TO_employee -- 사원 -> 사원
		FOREIGN KEY (
			empno2 -- 부서명
		)
		REFERENCES java_erp.employee ( -- 사원
			empno -- 사원번호
		);

-- 부서
ALTER TABLE java_erp.department
	ADD CONSTRAINT FK_employee_TO_department -- 사원 -> 부서
		FOREIGN KEY (
			empno -- 사원번호
		)
		REFERENCES java_erp.employee ( -- 사원
			empno -- 사원번호
		);
		
	
	-- 
drop user 'user_java_erp'@'localhost';

grant all privileges
	on java_erp.*
		to 'user_java_erp'@'localhost' IDENTIFIED by 'rootroot';