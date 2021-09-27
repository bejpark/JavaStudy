--함수
select * from student;

select sum(height), sum(weight) from student;

select avg(height) as "평균키", avg(weight),max(height) "제일 큰 학생",min(height) from student;

select count(8) from professor;
select count(bonus), count(name) from professor;



select rank(490) within group (order by pay desc) as "등수" from professor;

select name, pay from professor order by pay desc;


--oracle은 null값이 우선 순위가 높다. mysql은 반대

select name,pay,bonus from professor order by bonus desc;
/*
키가 168인 사람은 몇 번째로 큰지 확인
몸무게가 58인 사람은 몇 번째인지 등수 구하기
g_end가 200000,600000보다 작은 값 출력(any 사용)
*/
select rank(168) within group (order by height desc) from student;
select rank(58) within group (order by weight desc) from student;


select * from gift where g_end<any(200000,600000);
select * from gift where g_end>any(200000,600000);
select * from gift where g_end<all(200000,600000);
select * from gift where g_end>all(200000,600000);



--제약조건
create table userlist(
    id VARCHAR2(10) constraint id_pk PRIMARY key,
    name varchar2(10) --not null
    );


select * from userlist;
insert into userlist values('kingsmile','bej');
insert into userlist values('kingsmile','bej');

insert into userlist(id) values('gildong');
insert into userlist(name) values('sss');

create table fk_member(
    code number(2) not null,
    id varchar2(20) not null,
    constraint id_fk references userlist2(id),
    etc varchar2(10)
);
select * from member;
desc member;


create table userlist2(
    id varchar(10) constraint userlist2_id_pk primary key,
    jumin char(13) constraint jumin_un unique
);

select * from userlist2;

insert into userlist2 values('kingsmile','bej');
insert into userlist2 values('kingsmile','bej');
insert into userlist2(id) values('gildong');
insert into userlist2(jumin) values('gildong');