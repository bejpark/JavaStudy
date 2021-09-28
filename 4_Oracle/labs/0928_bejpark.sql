--제약조건 check
create table ck_test(
    name varchar2 (10) not null,
    age number(2) not null check (age between 20 and 30 ),--age컬럼의 값은 20~30사이만 허용
    gender char(2) check(gender in('m','f'))--gender컬럼 값은 'm' or 'f'만 허용
    );

insert into ck_test values('park',22,'f');
insert into ck_test values('kang',30,'d');--(gender)check에 위배, 적용안됨
insert into ck_test values('kim',50,'m');--(age)check에 위배, 적용안됨
insert into ck_test values('lee',27);--값부족 적용안됨

--제약조건 default
create table de_test(
    name varchar2(10) not null,
    addr varchar2(10) default '서울'
);

insert into de_test values('tt', '부산');
insert into de_test (name) values('gg');--이름만 쓰겠다->주소는 디폴트값들어감
insert into de_test values('ff');--값의 수 충분하지않음 오류
insert into de_test values('hh', default); --주소는 디폴트값

--컬럼추가 alter table 테이블명 add(컬럼명 자료형 [제약조건], 컬럼명 자료형 [제약조건],..)
alter table de_test add phone varchar2(15); --de_test 테이블에 phone 컬럼추가, 값은 null로 들어감 (컬럼은 뒤로 추가된다, 중간에 삽입불가)
alter table de_test add (age number, jumin varchar(13), reg_date date);--여러 컬럼추가시 ()로 묶음
update de_test set phone=' ';--null이 아니지만 빈값

--컬럼삭제 alter table 테이블명 drop column 컬럼명
alter table de_test drop column addr;--중간에 있는 컬럼삭제시 앞으로 당겨지지않고 비어있으니 설계부터 주의할것
alter table de_test drop (age, phone);--여러개 삭제

--datatype 변경 alter table 테이블명 modify 컬럼명 변경자료형
desc de_test;
alter table de_test modify jumin number;--jumin컬럼 varchar2->number로 바뀜
alter table de_test modify name number;--변경할 컬럼에 값이 있을경우 오류남(바꾸려면 모두 비워야함) 가능하면 없어야할 일
delete de_test;--모든 값이 지워진다 where로 name값을 일일이 지정해줘야함

--컬럼명 변경 alter table 테이블명 rename column 기존컬럼명 to 변경컬럼명
alter table de_test rename column name to irum;

--테이블 삭제 drop table 테이블명
drop table ck_test;


select * from de_test;
select * from ck_test;


--집계함수 사용시 group by
select sum(height),sum(weight) from student;
select grade, sum(height),sum(weight) from student;-- 일반필드는 그룹(집합) 필드와 같이 쓸 수 없다
select grade, sum(height),sum(weight) from student group by grade;--그룹으로 묶을 필드 설정


select * from student;




select deptno as "학과", round(avg(nvl(pay,0)),0) "평균 급여"
    from professor
    group by deptno;



