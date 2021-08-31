select user, database();



insert 
	into erp,title (codem name)
vqalues
(1, '사장'),
(2, '부장'),
(3, '과장'),
(4, '대리'),
(5, '사원');

select * from title;

insert into erp.department (code, name, floor) values(1, '기획'), 10);
select * from department;

insert 
	into erp.emp