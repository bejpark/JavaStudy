/*
--문제
[1]empno 사원번호, 이름, 급여, 직급 필드만 출력(별칭을 준다) 부장이면서 일지매인 사람 검색
[2]필드 출력은 위와 같고, 조건이 과장이거나 김문호인 사람 검색(emp2)
[3]급여가 500이상이고, 보너스가 60이상 받는 교수
[4]이름에서 '김영조' 사람들
[5]이름에서 '김'씨 성을 가진 사람들
[6]이름이 두 글자인 사람
[7]id에 s or a 글자가 들어가는 사람
[8]전임강사
[9]이름이 '나한라'를 '너한나'로 변경
[10]취미가 등산인 사람들만 찾아서 '수영'으로 변경
[11]계약직 직원 찾아서 삭제
[12]pay (or bonus)가 50 이상인 사람만 출력
[13]정규직이면서 '백원만' 찾기
[14]정규직이거나 '유도봉'찾기
[15]수습직이거나 김씨성을 가진 사람 찾기
[16]김씨가 아닌 수습직원 찾기
[17]교수테이블에서 교수들의 이름을 조회하여 성씨 부분에 'ㅈ'이 포함된 사람의 명단 출력
*/
desc emp2;
select * from emp2;
--1
select empno as "사원번호", name as "이름",pay as "급여", position as "직급" from emp2 where name like '일지매' and position like '부장';
--2
select empno as "사원번호", name as "이름",pay as "급여", position as "직급" from emp2 where name like '김문호' or position like '과장';
--3
select * from professor where pay>=500 and bonus>=60;
--4
select * from professor where name like '김영조';
--5
select * from professor where name like '김%';
--6
select * from professor where name like '__';
--7
select * from professor where id like '%s%' or id like '%a%';
--8
select * from professor where position like '전임강사';
--9
update emp2 set name='너한나' where name like '나한라';
--10
update emp2 set hobby='수영' where hobby='등산';
--11
delete from emp2 where emp_type='계약직';
--12
select * from professor where pay>=50 or bonus>=50;
--13
select * from emp2 where emp_type='정규직' and name='백원만';
--14
select * from emp2 where emp_type='정규직' or name='유도봉';
--15
select * from emp2 where emp_type='수습직' or name like '김%';
--16
select * from emp2 where emp_type='수습직' and name not like '김%';
--17
select name from professor where name between '자%' and '차%';


select * from professor;