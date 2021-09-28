-- Oracle SQL_PLSQL_PPT > 2, 3장 실습  
/*
문자 함수 퀴즈 1)
Student 테이블을 참조해서 아래 화면과 같이 1 전공이(deptno1 컬럼) 
101번인 학생의 이름과 전화번호와 지역번호를 출력하세요. 
단 지역번호는 숫자만 나와야 합니다.
*/

select tel, instr(tel,')') 
    from student  -- index string
    where deptno1 = 101;

--substr(tel, 시작위치, 뽑을갯수);
--substr(tel, 시작위치);

select name, tel, substr(tel, 1, instr(tel,')') -1) "지역번호"
    from student
    where deptno1 =101;

/*
문자 함수 퀴즈 3)
Dept2 테이블을 사용하여 dname 을 오른쪽의 결과가 
나오도록 쿼리를 작성하세요.   -- 오라클 버전에 따라 한글 글자 다름 
*/
select rpad(dname, 10,
        substr('1234567890', lengthb(dname)-2)) "RPAD연습"
    from dept2;

select rpad(dname, 10,
        substr('1234567890', length(dname)+1)) "RPAD연습"
    from dept2;-- Oracle SQL_PLSQL_PPT > 2, 3장 실습  
    