select * from dept;




/*
select 칼럼명, ...
    from 테이블이름 별칭 [inner] join 테이블이름 별칭
    on 별칭.칼럼명 = 별칭.칼럼명
*/
select * from dept;
select * from emp;

select emp.ename, emp.job, sal from emp;


select emp.ename, emp.job, sal,loc,dname, dept.deptno
    from emp,dept;


select ename,job,sal,loc,d.deptno,dname
    from emp e inner join dept d
    on e.deptno = d.deptno;
    
    
insert into emp values(0202,'bejpark','manager', 7777, to_date('1-5-2012','dd-mm-yyyy'),2850,null,20);


select ename, job, sal, loc, d.deptno, dname
    from emp e left join dept d
    --from dept d left join emp e
    on e.deptno = d.deptno;
    
    
/*
여러개 테이블 조인
select 칼럼, ...
    from 테이블명 별칭 [inner] join 테이블명 별칭
    on 별칭.칼럼 = 별칭.칼럼 inner join 테이블이름 별칭
    on 별칭.칼럼명 = 별칭.칼럼명...
*/

select s.name ||'학생의 담당교수' ||p.name ||'이고 담당 학과는' || d.dname
    from professor p join student s
    on p.deptno = s.deptno1 join department d
    on d.deptno = s.deptno1
    where d.dname='컴퓨터공학과';
