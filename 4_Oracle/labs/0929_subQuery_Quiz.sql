--subQuery

--ex) select * from emp where ename=(서브쿼리문장);

select * from emp2;
select * from emp2 where name='백원만';
select * from emp2 where pay>6000000;
select * from emp2 where pay>(select pay from emp2 where name='백원만');


select avg(pay) from emp2;

select * from student;
select * from department;
select * from professor;
select hiredate from professor where name='송도권';

--문제1]emp2 평균 급여보다작은 직원
select * from emp2 where pay<(select avg(pay) from emp2);

--문제2]학생 테이블에서 1학년 평균키보다 큰 사람들 출력
select * from student where height>(select avg(height) from student where grade=1);

--문제3]학생 테이블, 학과 테이블을 사용하여 이윤나 학생과 전공(deptno1) 동일한 학생들의 이름과 학과이름 출력
select name,d.dname
    from student s left join department d
    on s.deptno1 = d.deptno
    where s.deptno1=(select deptno1 
                    from student 
                    where name='이윤나');
--문제4]교수테이블에서 입사일이 송도권 교수보다 나중에 입사한 사람의 이름,입사일,학과명을 출력
select name,hiredate,p.deptno
    from professor p join department d
    on p.deptno=d.deptno
    where hiredate>(select hiredate
                    from professor
                    where name='송도권');
--문제5]학생테이블에서 전공이 101인 학과의 평균 몸무게보다 몸무게가많은 학생들의 이름과 몸무게 출력
select name,weight
    from student
    where weight>(select avg(weight)
                from student 
                where deptno1=101);

