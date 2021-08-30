-- title
SELECT user(), databas();



INSERT INTO title values(1, '사장');
SELECT tno, tname from title;
UPDATE title
	SET tname = "과장"
WHERE tno = 2;
DELETE FROM title 


-- department
DESC department;
INSERT INTO department values(1, '기획', 10);
INSERT INTO department values(2, '영업', 20);
SELECT deptno, deptname, floor FROM departmemt;
UPDATE department SET deptname = '인사' WHERE deptno = 4;
DELETE FROM department WHERE deptno = 4;


--employee
INSERT INTO employee values(1004, '석주명', 2, 4377, 4000000, 2);
INSERT INTO employee values(1005, '장준화', null, null, 4000000, null);
INSERT INTO employee values(1006, '김혜인', 1, 4377, 4000000, null);

DELETE FROM employee WHERE empno = 1004;
UPDATE employee 
	SET empname = '권민성', title = 1, manager = NULL, salary = 3000000, 1
WHERE empno = 1004;
SELECT empno, empname, title, manager, salary, dno FROM employee;
SELECT empno, empname, title, manager, salary, dno FROM employee WHERE empno = 4377;

