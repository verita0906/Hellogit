select user(), database();

show database();
show tables;		-- 테이블 종류 확인

desc student;		-- student테이블 명세 확인 왜? insert를 하기 위해서

insert into student values(101, '안성용', '사학', '010-1111-1111');
insert into student values(102, '최명기', '영어영문', '010-2222-2222');
insert into student values(103, '김태수', '수학', '010-3333-3333');
select * from student;

-- 블럭지정한 것만 실행해라 : alt + x



-- 과목
desc suject;
insert into subject values(501, '컴퓨터개론'), (502, '프리토킹'), (503, '리스닝'), (504, '데이터과학'), (505, '빅데이터');
select * from subject;

desc enroll;


select * from sturdent;
insert into enroll values
(101, 501, 96),
(101, 502, 86),
(101, 503, 76),
(102, 504, 66),
(102, 505, 56),
(103, 502, 68),
(103, 504, 86);


