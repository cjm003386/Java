1. ����� board/1234 �����մϴ�.
	conn System/1234
	CREATE USER board IDENTIFIED BY 1234;
	GRANT RESOURCE, SONNECT TO board;
	CONN board/1234
	
2. ���̺� ����
drop table board cascade constraints purge; -- ���������� �ִ� ��� ���������� �����մϴ�.
											-- �θ� ���̺��� ��� �ڽĿ� ���� ���� ���ǵ� �����˴ϴ�.



CREATE TABLE BOARD(
	BOARD_NUM         NUMBER(5),         --�� ��ȣ(�⺻ Ű)
	BOARD_NAME        VARCHAR2(30),   --�ۼ���
	BOARD_PASS          VARCHAR2(30),   --��й�ȣ
	BOARD_SUBJECT      VARCHAR2(300),  --����
	BOARD_CONTENT    VARCHAR2(4000), --����
	BOARD_FILE            VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����Ǵ� ���ϸ�)
	BOARD_ORIGINAL    VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����� ������ ���� ���ϸ�)
	BOARD_RE_REF         NUMBER(5),      --�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
	BOARD_RE_LEV         NUMBER(5),      --�亯 ���� ����(���� ��:0, �亯:1, �亯�� �亯2)
	BOARD_RE_SEQ         NUMBER(5),     --�亯 ���� ����(���� �� �������� �����ִ� ����)
	BOARD_READCOUNT NUMBER(5),      --���� ��ȸ��
	BOARD_DATE DATE,                         --���� �ۼ� ��¥
	PRIMARY KEY(BOARD_NUM)
);

select * from board;
delete from board;
3. �� ��ȣ�� �������� ����մϴ�.
		   ������ �̸� : board_seq
		   		���۰� : 1
		   		������ : 1
drop SEQUENCE BOARD_SEQ;
CREATE SEQUENCE BOARD_SEQ;

4. ���̺� ��ȸ�� ���� �������� ����ǵ��� INSERT���� �ۼ��ϼ���.
          ����1) �������� ��� BOARD_RE_REF �÷��� ���� ���� �� ��ȣ�� �����ϴ�.                   
          ����2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT ���� ��� 0 �Դϴ�.
          ����3) BOARD_DATE�� �ý��� ��¥�Դϴ�.
          ����4) BOARD_FILE, BOARD_ORIGINAL�� null�� ó���մϴ�.
          ����5) ��й�ȣ ������ ������ ��ȸ �� �����մϴ�
          
          SQL��)
          insert into board
          (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,
           BOARD_CONTENT, BOARD_RE_REF, 
           BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,
           BOARD_DATE)
           		values(board_seq.nextval, 'admin' , '1', 'JSP ���δ� ����־��',
           				'������ �غ���', board_seq.nextval,
           				0,0,0,
           				sysdate);
           				
select * from board;

6. ���̺� ��ȸ�� BOARD_RE_REF�� �������� ������������ �����ϰ�, BOARD_RE_REF ������ BOARD_RE_SEQ�� �������� �������� �����մϴ�.
���ı������� ó������ 10���� ��ȸ�մϴ�. (SELECT�� ���)

1�ܰ� )
select * from board
order by BOARD_RE_REF desc,
BOARD_RE_SEQ asc

2�ܰ� )
select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT,
BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV,
BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
from (select * from board
	  order by BOARD_RE_REF desc,
	  BOARD_RE_SEQ asc)
where rownum <= 10

3�ܰ� )
SQL> select *
	from (select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT,
				BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV,
				BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
		  from (elect * from board
	 		    order by BOARD_RE_REF desc,
	 	        BOARD_RE_SEQ asc)
	      where rownum <=40)
 where rnum>=31 and rnum<=40;
 
 
 
 update board
 set BOARD_SUBJUECT = '���ƿ�2' , BOARD_CONTENT = '�������ƿ�'
 where BOARD_NUM = 2;
 
 
 delete from board
				where  BOARD_RE_REF = ?
				and    BOARD_RE_LEV >=?
				and    BOARD_RE_SEQ >=?
				and    BOARD_RE_SEQ <=(  nvl((SELECT min(board_re_seq)-1
				                             FROM   BOARD
				                             WHERE  BOARD_RE_REF=?
				                             AND    BOARD_RE_LEV=?
				                             AND    BOARD_RE_SEQ>?) , 
				                            (SELECT max(board_re_seq)
				                             FROM   BOARD
							                 WHERE  BOARD_RE_REF=? ))
                                        );
          

                                        
create table board_copy
as
select * from board;

insert into board
select * from board_copy;