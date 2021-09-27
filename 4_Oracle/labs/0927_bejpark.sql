/*
create table Test (name VARCHAR2(10), age number(3));
*/

/*
https://dataonair.or.kr/db-tech-reference/d-guide/sql/?pageid=4&mod=document&uid=339
*/
/*
insert into 테이블명 values (전체 column에 넣을 valuelist)
*/
-- 테이블 제거 drop
/*
drop table test;
*/

create table Test (name VARCHAR2(10) not null, age number(3));
select * from test;

insert into test values('aa',25);
insert into test(age,name) values(22,'bb');
insert into test(name) values('cc');

-- select 명령어
/* where name like '%정%' : 앞뒤로 정이있는 경우 선택 
'__' 두글자만
order by ~ 
*/
select * from emp2;

select *
from emp2
where name='백원만';


select empno as "사원번호", name "성 명", position 직급, pay "급 여" from emp2;
select distinct emp_type from emp2;
select distinct position from professor;
