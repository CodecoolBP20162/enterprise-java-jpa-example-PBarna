create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), zipcode varchar(255), primary key (id))
create table Student (id  bigserial not null, age int8 not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(255), primary key (id))
create table Student (id  bigserial not null, age int8 not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(4) not null, primary key (id))
create table Student (id  bigserial not null, age int8 not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Address add constraint UK_o0hhnhstybt1puh0p539o4nul unique (Zip)
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(4) not null, primary key (id))
create table Student (id  bigserial not null, age int8 not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Address add constraint UK_o0hhnhstybt1puh0p539o4nul unique (Zip)
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(4) not null, primary key (id))
create table Phone (Student_id int8 not null, PHONE_NUM varchar(255), PHONE_TYPE varchar(255) not null, primary key (Student_id, PHONE_TYPE))
create table Student (id  bigserial not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Address add constraint UK_o0hhnhstybt1puh0p539o4nul unique (Zip)
alter table Phone add constraint FK8p74wyfckl9p9p9d7h5y0a9ea foreign key (Student_id) references Student
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(4) not null, student_id int8, primary key (id))
create table Phone (Student_id int8 not null, PHONE_NUM varchar(255), PHONE_TYPE varchar(255) not null, primary key (Student_id, PHONE_TYPE))
create table Student (id  bigserial not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Address add constraint UK_o0hhnhstybt1puh0p539o4nul unique (Zip)
alter table Address add constraint FK4q6j38bhikrv1pjbmde52gg7 foreign key (student_id) references Student
alter table Phone add constraint FK8p74wyfckl9p9p9d7h5y0a9ea foreign key (Student_id) references Student
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
