select ceil(12.34), ceil(-12.34) from dual; --올림 후 정수 반환
select floor(12.34), floor(-12.34) from dual; --내림 후 정수 반환

select trunc(12.3455,2), trunc(12.3890,2), round(12.3890,2) from dual;


--문자열 함수
select instr('abcd','b') from dual;
select * from professor;

select rpad(dname,10,'*') from dept2;

select length('candide') from dual;
select length(dname), lengthb(dname) from dept2;

select rpad(dname,10,substr('1234567890',length(dname)+1)) "RPAD연습" from dept2;

select * from student where deptno1=103;

select name, rtrim(REGEXP_replace(name,'(.)','\-1'),'-') "변경후"
    from student
    where deptno1 = 103;
    
select name, rtrim(REGEXP_replace(birthday,'(/)','\'),'-') "변경후"
    from student
    where deptno1 = 103;



--형변환 함수
select sysdate, to_char(sysdate,'YYYY-MM-DD') from dual;

    
    
-- 날짜 함수
select sysdate from dual;
select months_between(sysdate, hiredate) from professor;
select name, hiredate, add_months(hiredate, 3) from professor;
select next_day(sysdate, 3) from dual;
select to_char(sysdate, 'YYMMDD HH:MI:SS') from dual;

-- to_char
select pay, to_char(pay,'999,999,999,999') from emp2;
-- 날짜 함수
select sysdate from dual;
select months_between(sysdate, hiredate) from professor;
select name, hiredate, add_months(hiredate, 3) from professor;
select next_day(sysdate, 3) from dual;
select to_char(sysdate, 'YYMMDD HH:MI:SS') from dual;

-- to_char
select pay, to_char(pay,'999,999,999,999') from emp2;



