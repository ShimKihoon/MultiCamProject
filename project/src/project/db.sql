drop table users;
drop table movies;
--drop table history;

create table users(
	id varchar2(20) primary key,
	name varchar2(20) not null,
	pw varchar2(20) not null,
	birthdate date default null
);

create table movies(
	num number(10) primary key,
	name varchar2(50) not null,
	genre varchar2(20) default null
);


--CREATE TABLE history (
--    historyno  number
--	mname varchar2(40) default null, 
--	mtime varchar2(40) default null, 
--	mseat varchar2(40) default null  --A1, A2, A3 
--	id varchar2(40) fk, 
--);


insert into movies (num,name,genre) values (1,'극한직업','코미디');
insert into movies (num,name,genre) values (2,'말모이','드라마');
insert into movies (num,name,genre) values (3,'내안의 그대','코미디');
insert into movies (num,name,genre) values (4,'주먹왕랄프2','애니메이션');
insert into movies (num,name,genre) values (5,'아쿠아맨','SF');
insert into movies (num,name,genre) values (6,'PMC: 더벙커','액션');
insert into movies (num,name,genre) values (7,'보헤미안 랩소디','드라마');
insert into movies (num,name,genre) values (8,'마약왕','드라마');

drop sequence seq_num;

create sequence seq_num
		start with 1
		increment by 1
		nocycle
		nocache;

 drop table seats;

create table seats(
	resnum number(10) primary key,
	moviename varchar2(50)	default null ,
	movietime varchar2(20) default null,
	Id varchar2(20) default null,
	movieseat varchar2(20) default null,
	snack varchar2(100) default null

);	


select * from seats;



