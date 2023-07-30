  
CREATE table IF NOT EXISTS Employee(
  UID INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  UName varchar(225) NOT NULL,
  DOB Date NOT NULL,
  Address varchar(225) NOT NULL,
  Phone VARCHAR(10) NOT NULL UNIQUE,
  PASSWORD VARCHAR(10) NOT NULL
);

-- INSERT INTO Employee(UName,DOB,Address,Phone,PASSWORD) values ('jOHN','12/12/2002','ABS',1234567891,'ASBCN1233'),
-- 	  ('jONNY','11/11/2003','ADB',9412345678,'1233');
      
SELECT * from user;

CREATE TABLE IF NOT EXISTS Medicine(
 ID INT GENERATED ALWAYS AS IDENTITY,
  MID INT PRIMARY KEY,
  MName varchar(225) NOT NULL,
  Company varchar(225) NOT NULL,
  Expiry_Date varchar NOT NULL,
  Quantity INT NOT NULL,
  Price INT NOT NULL
);

CREATE TABLE IF NOT EXISTS Bill(
  BID VARCHAR(225) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  MID INT UNIQUE NOT NULL,
  MName varchar(225) NOT NULL,
  Company varchar(225) NOT NULL,
  Expiry_Date Date NOT NULL,
  Quantity INT NOT NULL,
  Price INT NOT NULL,
  DATE Date NOT NULL
);

select * from Employee;
select * from Medicine;
select * from Bill;