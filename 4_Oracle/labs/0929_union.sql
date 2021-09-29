--decode
select deptno, decode(deptno,10,'accounting',
                            20,'research',
                            30,'sales','operations') name
        from dept;
        
        

select * from dept;

--테이븗 복사, 레코드 복사
create table c_emp2
    as select * from emp2;
create table c_emp
    as select * from emp;

select * from c_emp2;
desc emp2;
desc c_emp2;


create table c_emp_20
    as select * from emp where deptno=20;
select * from c_emp_20;

select * from professor;

--문제1] 교수텡블에서 전임강사만 추출해서 테이블 생성
--문제2] emp테이블에서 mgr가 7566인 사람만 추출해서 새 테이블
create table p1
    as select * from professor where position='전임강사';
create table e1
    as select * from emp where mgr='7566';

select * from e1;


create table c_emp3
    as select * from emp where 1=0;
    

create table c_emp30
    as select * from emp
        order by ename desc, sal desc, empno asc;

create table copy_emp_30
    as select empno 번호, ename 이름, job 직업, sal 급여 from emp where deptno=30;
select * from copy_emp_30;


/*
c_emp : 전체복사
c_emp_20 : 부서번호20만
c_emp3 : 틀만복사
c_emp_30 : 원하는 필드만 복사
*/


--union pk/fk 아닌 상태 테이블 합치기
select * from emp
    union --중복레코드 제거하고 합쳐서 보여줌
    select * from c_emp;
    
insert into c_emp(empno,ename,deptno) values(303,'bjp',40);

select * from emp
union select * from c_emp30;

select empno,ename,job,sal from emp --필드개수, data type 일치해야함
union
select * from copy_emp_30;

select * from c_emp30;

select * from emp
    union all --중복포함
    select * from c_emp30;
    
    
    
--문제4] 사원번호, 이름, 급여 그리고 15%인상된 급여를 정수로 표시하되
--    컬럼명을 New Salary로 지정하여 출력하시오.
select * from emp;
select empno,ename,sal,round(sal*1.15,0) "New Salary"
    from emp;

--문제5]각 사원의 이름을 표시하고, 근무 달 수를 계산하여 컬럼명을 
--     Months_Works로 지정하고, 근무 달수를 기준으로 오래된 사람부터
--     정렬하여 출력하시오.
select ename,round(MONTHS_BETWEEN(SYSDATE,hiredate),0) "Months_Work"
    from emp
    order by "Months_Work" desc;

--문제6]사원의 이름과 커미션을 출력하되, 커미션이 책정되지 않은 
--    사원의 커미션은 'no commission'으로 출력하시오.
select ename,nvl(comm,'no') from emp;
select ename,comm from emp;
