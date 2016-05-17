DTHPredixWorkshop

Contains code used to create a Java RESTful sevice connecting to a Predix PostGres database. (for DTH workshop 5/18)

PGStudio Git link: https://github.com/john-k-ge/pg_studio_1.2_cf.git

SQLs Used:

CREATE TABLE employee(ID INT PRIMARY KEY NOT NULL,NAME TEXT NOT NULL,AGE INT NOT NULL,ADDRESS CHAR(50),SALARY REAL);

insert into employee values (1,'John Doe',24,'Novi, MI',140000); 
insert into employee values (2,'Jane Doe',25,'Farmington, MI',150000); 
insert into employee values (3,'Steve Doe',26,'Ann Arbor, MI',160000); 
insert into employee values (4,'Joe Doe',27,'Wixom, MI',170000); 
insert into employee values (5,'Chris Doe',28,'Nashville, TN',180000); 
insert into employee values (6,'Kid Rock',24,'Detroit, MI',140000);
