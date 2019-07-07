create table account(
username varchar(32) primary key,
password varchar(32),
firstname varchar(32),
lastname varchar(32),
id int,
isTeacher varchar(32));

CREATE TABLE `filestore` (
  `id` int(11) NOT NULL AUTO_INCREMENT primary key,
  `name` varchar(255) NOT NULL,
  `mime` varchar(255) NOT NULL,
  `data` longblob NOT NULL
);

CREATE TABLE keyword(
id INT AUTO_INCREMENT primary key,
phrase varchar(255) NOT NULL,
location varchar(255),
page varchar(32) 
);