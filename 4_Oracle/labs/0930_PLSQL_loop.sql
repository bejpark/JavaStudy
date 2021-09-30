select * from userlist;

alter table userlist add age varchar2(20);

alter table userlist add addr varchar2(20);
create or replace PROCEDURE p_userlist(
        id in userlist.id%Type:='kingmsile' ,
        name in userlist.name%type default '연아',
        age in userlist.age%type :=10,
        addr in userlist.addr%type :=null )
is
    Begin
        insert into userlist values(id, name, age, addr);
        DBMS_output.put_line('insert 정보는 ' || id||name||age||addr);
    end;

-----
exec p_userlist('yuna','ab',20,'서울');


begin
    for i in 1..10 loop
        insert into userlist(age) values(i);
    end loop;
end;