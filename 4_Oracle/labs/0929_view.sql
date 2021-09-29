--View

create or replace view v_emp
    as select empno, ename, deptno from emp;
    
select * from v_emp;

--emp 테이블 제거하면 v_emp는 제거됨


create view v_emp_30
    as select job,ename,sal from emp where deptno=30;
    
select * from v_emp_30;



/*
문제1] 30번 부서 사원들의 직위, 이름, 월급을 담은 view  테이블 만들기, 별칭 직위, 사원이름, 급여로 Alias 주고
    월급이 2000보다 많은 사원들만 추출해서 뷰 만들기
    
문제2] 부서별(부분합==소계) 최대급여, 최소급여, 평균급여를 갖는 뷰 만들기

문제3] 부서별 평균급여를 갖는 뷰를 만드는데, 평균 급여가 2000이상인 부서만 출력하세요.

문제4] 직위별 총급여를 갖는 뷰 테이블 만들고, 직위(job)가 manager인 사원들은 제외하고 총급여가 3000이상인 사원들 출력하기
*/
select * from emp;

create view v_emp3
    as select job "직위",ename "사원이름",sal "급여" from emp where sal>2000 and deptno=30;
select * from v_emp2;
select * from dept;

create or replace view v_emp2
    as select deptno, max(sal) "최대", min(sal) "최소", avg(sal) "평균"
    from emp group by deptno;
    
create or replace view v_emp2
    as select deptno,round(avg(sal),2) "평균급여" 
    from emp group by deptno having avg(sal)>2000;
    
create or replace view v_emp2
    as select job,sum(sal) "총급여"
    from emp 
    where job!='MANAGER' or job<>'manager'
    group by job having sum(sal)>3000;
    
create or replace view v_emp2
    as select job,sum(sal) "총급여"
    from emp 
    group by job having sum(sal)>3000 and job not like 'MANAGER';

--SQL 질의어 명령은 대소문자 구분 안함. 하지만 레코드에 대한 것은 구분함(Oracle은)

/*
문제7] 교수 테이블에서 테이블 구조만 복사된 c_professor 새로운 테이블 
     생성(이름, 직위, 입사일, 이메일, 홈페이지)하고 레코드 복사 하기
--------------------------------------------------------
문제8] c_emp22 테이블의 구조물만 복사 c_emp22로 만드세요
--------------------------------------------------------
문제9] emp 테이블에서 c_emp22에 직위가 'manager'인 
      사람들만 레코드 복사하시오.
*/
create table c_professor
    as select name,position,hiredate,email,hpage from professor where 1=0;
select * from c_professor;

create table c_emp22
    as select * from emp where 1=0;

insert into c_emp22 (select * from emp where job='MANAGER');
select * from c_emp22;
