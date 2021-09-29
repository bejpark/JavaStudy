/*
1. EMP2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 연봉이 
    높은 사람의 이름과 직급,연봉을 출력하세요. 
    단 연봉 출력 형식은 아래와 같이 천 단위 구분기호와 원 표시를 하세요

2. student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 가장 적게 나가는 학생보다 적은 학생의 이름과 학년과 몸무게를 출력.

3. student 테이블을 조회하여 각 학년별로 최대 키를 가진 학생들의 학년과 이름과 키를 출력.
4. professor 테이블을 조회하여 각 학과별로 입사일이 가장 오래된 교수의 교수번호와 이름, 입사일, 학과명을 출력. 
    단, 학과명순으로 오름차순 정렬.
*/
select name,position,pay from emp2
    where pay>(select min(pay) from emp2 where position='과장');
    
select name,grade,weight from student
    where weight<(select min(weight) from student where grade=4);

select grade,name,height from student
    where (grade,height) in (select grade,max(height) from student group by grade);
    
select name,hiredate,d.dname
    from professor p join department d
    on p.deptno=d.deptno
    where (p.deptno, hiredate) in (select deptno,min(hiredate) from professor group by deptno)
    order by dname;
    
--select grade,max(height) from student group by grade;
select * from professor;
select * from department;