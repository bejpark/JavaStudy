--update 명령어
-- update 테이블명 set 수정할 칼럼=원하는값;
select * from professor where position='정교수';

update professor set pay=pay+100 where position='정교수';

--실수 시 rollback 가능
--commit : 명령실행 완료시키는 것

--delete from 삭제를 원하는 정보의 테이블명; ->레코드 전체 삭제
--delete from 삭제를 원하는 정보의 테이블명 where 조건; ->조건에 맞는 레코드 삭제

select * from professor;
-- delete from professor where email like '%abc%';
rollback;


select * from emp2;

--truncate table 테이블이름; 빈 테이블로 만들기
--desc 테이블 구조 확인


update professor set bonus = nvl(bonus,0)+100;
select * from professor;
select bonus, nvl(bonus,0) from professor;

select name, deptno from professor where deptno not in (101,201,301);

select * from professor where email like '%a%g%';

select * from professor where email like '_a%';

