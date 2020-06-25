create table user (
id integer UNSIGNED AUTO_INCREMENT PRIMARY KEY,
name varchar(50),email varchar(50),
   password varchar(255),
 username varchar(255)
    
);
create table purchase(
id integer auto_increment primary key,
medicine_name varchar(50),
medicine_company varchar(50),
price integer,
quantity integer,
purchase_date date);

create table sale(
id integer auto_increment primary key,
medicine_name varchar(50),
medicine_company varchar(50),
price integer,
quantity integer,
sale_date date);

create table stock(
id integer auto_increment primary key,
medicine_name varchar(50),
medicine_company varchar(50),
quantity integer
);

 insert into user values(1,"varsha","varsha@gmail.com",12345,"varsha_kumari");
  insert into purchase(id,medicine_name,medicine_company,price,quantity) values(1,"a","b",100,5);