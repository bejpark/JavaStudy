--PL/SQL


--Declare 선언(선택)
--Begin   
--    실행
--End;


Begin
    DBMS_output.put_line('김연아');
End;


DECLARE
    vno number(4);
    vname varchar2(20);
BEGIN
    select empno,name 
        into vno,vname
        from emp2
        where empno=&empno;
        DBMS_OUTPUT.PUT_line('입력값 : '||vno||' <--> '||vname);
end;

select * from emp2;

create procedure p_test
is
    Begin
        DBMS_output.put_line('김연아');
        DBMS_output.put('dd');
        DBMS_output.put_line('bj park 345');
    end;
    
exec p_test;


create or replace procedure p_test(name in varchar2)
is 
    begin
        DBMS_output.put_line(name||'님 합격');
    end;
    
exec p_test('bj;);

