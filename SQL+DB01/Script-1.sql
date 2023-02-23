CREATE TABLE member2 (
id varchar2(100),
pw varchar2(100),
name varchar2(100),
tel varchar2(100)
)

CREATE TABLE bbs2(
id varchar2(100),
title varchar2(100),
content varchar2(100),
writer varchar2(100)
)

CREATE TABLE PRODUCT2 (
no varchar2(100),
name varchar2(100),
content varchar2(100),
price varchar2(100)
)

CREATE TABLE "HR"."PRODUCT22" 
   (	"ID" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"PRICE" NUMBER(38,0)
   )
   
CREATE TABLE "HR"."MEMBER3" 
   (	"ID" VARCHAR2(100), 
	"PW" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"TEL" VARCHAR2(100)
   )   
   
   CREATE TABLE "HR"."HOBBY2" 
   (	"HOBBYID" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"LOCATION" VARCHAR2(100)
   )
   
INSERT INTO "member" values('park','1234','pack','011')

INSERT INTO "member" values('apple','1111','apple','011')

INSERT INTO "member" values('ice','2222','ice','012')

INSERT INTO "member" values('melon','3333','melon','013')

INSERT INTO "HOBBY" values('100','run','seoul')

INSERT INTO "HOBBY" values('200','book','busan')

SELECT * FROM "member" -- 모든컬럼

SELECT * FROM "HOBBY" -- 모든컬럼

SELECT id FROM "member" 

SELECT CONTENT  FROM "HOBBY" -- id 컬럼

SELECT id, pw FROM "member" --id,pw컬럼

SELECT CONTENT,LOCATION  FROM "HOBBY" --id,pw컬럼


	