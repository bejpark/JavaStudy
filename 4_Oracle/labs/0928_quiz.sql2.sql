/*
1.사원들 이름,부서번호,부서이름 출력(emp,dept table)
2.dallas에서 근무하는 사원의 이름,직위,부서번호,부서이름 출력(dept table)
3.이름에 'A'가 들어가는 사원들의 이름과 부서이름 출력(emp,dept)
4.사원이름과 그 사원이 속한 부서의 부서명, 월급을 출력하는데 월급이 3000이상인 사원을 출력(emp,dept)
5.직위가 'salesman'인 사람들의 직위와 그 사원이름, 그리고 속한 부서이름을 출력(emp,dept)
6.커미션이 책정된 사원들의 사번,이름,연봉,연봉+커미션,급여등급 출력하되 칼럼명을 '사원번호','사원이름'
'연봉','실급여','급여등급'으로 출력(emp salgrade)
7.부서번호가 10인 사람들의 부서번호,부서이름,사원이름,월급,급여등급 출력(emp,dept,salgrade)
8.부서번호가 10,20인 사원들의 부서번호,부서이름,사원이름,월급,급여등급 출력/ 그리고 출력된결과물을 부서번호가 낮은 순으로,
월급이 높은 순으로 정렬(emp,dept,salgrade)
9.사번,이름,그 사원을 관리하는 관리자의 사번,이름을 출력/ 각 칼럼명을
사원번호 사원이름 관리자번호 관리자이름으로 출력(emp)
self join(본인테이블의 칼럼 참조하는 경우)
*/
select * from emp;
select * from dept;
select * from salgrade;
--1
select e.ename,e.deptno,dname
    from emp e inner join dept d
    on e.deptno=d.deptno;
--2
select e.ename,e.job,d.deptno,d.dname
    from dept d inner join emp e
    on d.loc='DALLAS' and e.deptno=d.deptno;
--3
select e.ename,e.job,d.dname
    from emp e inner join dept d
    on e.ename like '%A%' and e.deptno=d.deptno;
--4
select e.ename,d.dname,e.sal
    from emp e inner join dept d
    on e.sal>=3000 and e.deptno=d.deptno;
--5
select e.job, e.ename, d.dname
    from emp e inner join dept d
    on e.deptno=d.deptno and e.job='SALESMAN';
--6
select e.empno "사원번호",e.ename "사원이름",e.sal "연봉",e.sal+e.comm "실급여",s.grade "급여등급"
    from emp e inner join salgrade s
    on (sal + comm) between losal and hisal and comm is not null;
--7
select d.deptno,d.dname,e.ename,e.sal,s.grade
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (sal+nvl(comm,0)) between losal and hisal and e.deptno=10;
--8
select d.deptno,d.dname,e.ename,e.sal,s.grade
    from emp e join dept d
    on e.deptno=d.deptno join salgrade s
    on (sal+nvl(comm,0)) between losal and hisal 
    where e.deptno=10 or e.deptno=20
    order by e.deptno asc, sal desc;
--9
select e.empno "사원번호",e.ename "사원이름",e.mgr "관리자번호",e2.ename "관리자이름"
    from emp e join emp e2
    on e.mgr=e2.empno;
    
