use infinite;

drop table if exists Login;

Create Table Login
(
  userName varchar(30) primary key,
  passCode varchar(30) NOT NULL
);

Insert into Login(UserName,PassCode) values('Rajan','Tiwari'),
	('Akash','Kadam'),
    ('Jadhav','Suraj'),
    ('Deepak','Kumar'),
    ('Swetha','Priya');