-- 著者マスター
INSERT INTO author (authorid, authorname) VALUES ('a001', '野村太郎');
INSERT INTO author (authorid, authorname) VALUES ('a002', 'みずほ花子');


-- 書籍マスター
INSERT INTO book (id, name, price, authorid) VALUES ('b001', 'はじめてのJava', '1900', 'a001');
INSERT INTO book (id, name, price, authorid) VALUES ('b002', '楽しく学ぼうC#', '2500', 'a002');
INSERT INTO book (id, name, price, authorid) VALUES ('b003', 'クラウド全集', '3000', 'a001');


