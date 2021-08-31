-- 학생이 수강한 과목

select s.std_no, s.std_name, j.subj_name, e.score
	from student s join enroll e  
		on s.std_no = e.std_no
	join subject j 
		on e.subject_code = j.subject_code;
		

	
-- 번호  성명   컴퓨터개론 프리토킹  리스닝  데이터과학  빅데이터  합계  평균
-- 101 안성용    96     86     76     null    null  258  86
-- 102 최명기    null   null   null   66       56   122  61
-- 103 김태수    null   68     null   86      null  154  77
-- 피벗을 이용하여 위와 같이 나오도록 하세요.

create view vw_student_grade -- 피벗이 길다 싶으면 view를 만들자~~~!!!!!
as
select  stdno '학번'
	  , std_name '성명'
	  , max(if (subj_code = 501, score, null) as '컴퓨터 개론'
	  , max(if (subj_code = 502, score, null) as '프리토킹'
	  , max(if (subj_code = 503, score, null) as '리스닝'
	  , max(if (subj_code = 504, score, null) as '데이터과학'
	  , max(if (subj_code = 505, score, null) as '빅데이터'
	  , sum(score) '합계'
	  , avg(score) '평균'
	from (select s.std_no, s.std_name, j.subj_name, j.subj_code, e.score
		from student s join enroll e  
			on s.std_no = e.std_no
		join subject j 
			on e.subject_code = j.subject_code) t
	group by std_no;
		
select 학번, 성명, '컴퓨터 개론', 프리토킹, 리스닝, '데이터 과학', 빅데이터, 합계, 평균
	from vw_student_grade;
	

-- 학생이 수강한 과목을 알고자 할 경우
select s.std_no, s.std_name, e.subj_code, j.subj_name 
	from student s join enroll e on s.std_no = e,std_no
	join subject j on e.subj_code = j.subj_code
  where s.std_no = 101;

 
 -- 프리토킹 과목을 수강한 학생을 구하고자한다면?(쇼핑몰 담당자가 자사 옷이 얼마나 팔렸나 조회하는 것과 같음)
 select s.subj_code, s.subj_name, std.std_no, std.std_name, std.std_dept
 	from subject s join enroll e on s.subj_code = e.subj_code
 	join student std on std.std_no = e,std_no
   where s.subj_code = 502;
   
  