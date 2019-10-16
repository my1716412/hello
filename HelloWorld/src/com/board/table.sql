create table user_login(id varchar2(10),
                        passwd  varchar2(30),
                        name    varchar2(50));
drop table boards;                        
create table boards(board_no number not null,
                   title varchar2(100) not null,
                   content varchar2(300) not null,
                   writer varchar2(10) not null,
                   creation_date date,
                   orig_no number);
                  
alter table boards add constraint board_pk primary key(board_no);             