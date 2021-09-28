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