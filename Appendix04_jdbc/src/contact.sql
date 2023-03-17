drop table contact_tbl;
create table contact_tbl (
    contact_no  number              not null,
    name        varchar2(20 byte)   not null,
    tel         varchar2(20 byte)   null,
    email       varchar2(99 byte)   null,
    address     varchar2(99 byte)   null
);

alter table contact_tbl
    add constraint pk_contact primary key(contact_no);
    
drop sequence contact_seq;
create sequence contact_seq nocache;

select contact_no, name, tel, email, address
  from CONTACT_TBL;
 
insert into CONTACT_TBL values (contact_seq, 상철, 010-1111-1111, sangcheol@naver.com, 제주);
insert into CONTACT_TBL values (contact_seq, 관리실, 02-1111-1111, admin@naver.com, 서울);
insert into CONTACT_TBL values (contact_seq, 미자, 010-3213-6594, miza@naver.com, 안양);
insert into CONTACT_TBL values (contact_seq, 철수, 010-9405-0684, cheolsoo@naver.com, 인천);
insert into CONTACT_TBL values (contact_seq, 상철, 010-9852-2334, ceoldsa@naver.com, 인천);
  