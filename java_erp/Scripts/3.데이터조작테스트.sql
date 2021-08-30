-- title
SELECT user(), databas();
show Tables;

INSERT INTO title values(1, '사장');
INSERT INTO title values(2, '부장');

UPDATE title 
	SET tname = "과장"
WHERE tno = 2;
DELETE FROM title WHERE tno = 2;

SELECT * 
	FROM title;

INSERT INTO department values(1, '기획', 10);
INSERT INTO department values(2, '영업', 20);
INSERT INTO employee values(4377, '이성래', 1, NULL, 4500000, 1);

DESC title;
SELECT tno, tname FROM title;
SELECT tno, tname FROM title WHERE tno = 2;

SELECT deptno, deptname, floor FROM departmnet;
SELECT empno, empname, title, manager, dno FROM employee;

-- department
SELECT deptno, deptname, floor FROM department;
SELECT deptno, deptname, floor FROM department WHERE deptno =2;

INSERT INTO department values(3, '개발', 21);
UPDATE department SET deptname = '인사' WHERE deptno = 4;
DELETE FROM department WHERE deptno = 4;

--employee
INSERT INTO employee values(1004, '석주명', 2, 4377, 4000000, 2);
INSERT INTO employee values(1005, '장준화', null, null, 4000000, null);
INSERT INTO employee values(1006, '김혜인', 1, 4377, 4000000, null);


UPDATE employee 
	SET empname = '권민성', title = 1, manager = NULL, salary = 3000000, 1 
WHERE empno = 1004;
SELECT empno, empname, title, manager, salary, dno FROM employee;
SELECT empno, empname, title, manager, salary, dno FROM employee WHERE empno = 4377;