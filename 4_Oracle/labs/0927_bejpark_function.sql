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


