create table employee(
employee_id number(10) primary key,
employee_name varchar(50),
employee_phone number(11),
employee_email varchar(50)
);
insert into employee select 1,'name1',11,'email1' from dual;
insert into employee select 2,'name2',22,'email1' from dual;
update employee  t set employee_email = 'email2' where t.employee_id=2;
select * from employee;
select * from employee t where t.employee_id = 1
select employee_name from employee t where t.employee_id = 1
