--���� ���
--1. �� ���� ������ ���� Ŀ���� �������� ���� ���콺 ��Ŭ��->Execute Current Text(Alt + S)
drop table goodsinfo purge;

--2. ���� ���� ������ ���
--	 ���� ���� �� ���콺 ��Ŭ�� - > Execute Selected Text (Alt+X)
--							   �Ǵ�
--							   Execute Selected Text As one Statement(Alt+C)

create table goodsinfo(
	code varchar2(5) primary key,
	name varchar2(30) not null,
	price number(8) not null,
	maker varchar2(20)
	);
	
	/*
	CODE	NAME		PRICE	MAKER
	-----	-------	 -  -----	-----
	10001	������	TV 350000	LG
	10002	DVD �÷��̾�	250000	LG
	10003	������ ī�޶�	210000 	�Ｚ
	10004	���ڻ���		180000	���̸���
	10005	������ ������	400000	�Ｚ
	*/
	
	INSERT INTO goodsinfo
	VALUES (10001,'������ TV', 350000, 'LG');
	
	INSERT INTO goodsinfo
	VALUES (10002,'DVD �÷��̾�', 250000, 'LG');
	
	INSERT INTO goodsinfo
	VALUES (10003,'������ ī�޶�', 210000, '�Ｚ');
	
	INSERT INTO goodsinfo
	VALUES (10004,'���ڻ���', 180000, '���̸���');
	
	INSERT INTO goodsinfo
	VALUES (10005,'������ ������', 400000, '�Ｚ');
	
	SELECT * FROM GOODSINFO;
	
	SELECT * FROM DEPT;
	
	--SELECT *
	--FROM EMP;
