SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Views */

DROP VIEW bookview;



/* Drop Tables */

DROP TABLE book;
DROP TABLE author;




/* Create Tables */

CREATE TABLE book
(
	-- 本のID
	id varchar(10) NOT NULL UNIQUE COMMENT '本のID',
	-- 本の名前
	name varchar(30) COMMENT '本の名前',
	-- 本の価格
	price int COMMENT '本の価格',
	-- 著者のID
	authorid varchar(10) NOT NULL COMMENT '著者のID',
	PRIMARY KEY (id)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE author
(
	-- 著者のID
	authorid varchar(10) NOT NULL COMMENT '著者のID',
	authorname varchar(30),
	PRIMARY KEY (authorid)
);



/* Create Foreign Keys */

ALTER TABLE book
	ADD FOREIGN KEY (authorid)
	REFERENCES author (authorid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Create Views */

CREATE VIEW bookview AS select book.id, book.name, book.price, author.authorname from book,author where book.authorid = author.authorid;



