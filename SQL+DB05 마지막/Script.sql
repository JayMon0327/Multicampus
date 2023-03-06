

-- 테이블 제약조건 확인
SELECT cols.table_name, cols.constraint_name, cols.column_name
     , cols.position, cons.status, cons.owner
FROM all_constraints cons, all_cons_columns cols
WHERE cols.table_name = '테이블명'
AND cons.constraint_type = 'P' -- 특정 조건만 확인 시 사용
AND cons.constraint_name = cols.constraint_name
AND cons.owner = cols.owner
ORDER BY cols.table_name, cols.POSITION;

--테이블 pk 값 지우
ALTER TABLE SUBJECT DROP CONSTRAINT SUBJECT_PK1;

-- HR.SUBJECT definition

CREATE TABLE "HR"."SUBJECT" 
   (	"강좌이름" VARCHAR2(100), 
	"강의실" VARCHAR2(100),
	CONSTRAINT "subject_PK" PRIMARY KEY ("강좌이름")
   ) 
   
SELECT *
FROM "record" r,STUDENT_INFORMATION si 
WHERE r.학생번호 = si.학생번호  

SELECT *
FROM "record" r  
LEFT OUTER JOIN SUBJECT s  
ON r.강좌이름 = s.강좌이름 

SELECT * FROM hr.STUDENT_INFORMATION si WHERE 학생번호 IN 
(SELECT 학생번호 FROM "record" r WHERE 성적 = 3.5)

SELECT  * FROM "record" r WHERE 강좌이름 =
(SELECT 강좌이름 FROM SUBJECT s WHERE 강의실 = '공학관 110' )

SELECT *FROM "record" r 

---------------------------------------

CREATE TABLE movies ( --메인테이블 pk1
    id INT PRIMARY KEY,
    title VARCHAR(255),
    director VARCHAR(255),
    actors VARCHAR(255),
    release_date DATE,
    genre VARCHAR(255),
    summary VARCHAR(255),
    trailer_link VARCHAR(255)
);

CREATE TABLE reviews (  --fk키 설정1
    id INT PRIMARY KEY,
    movie_id INT,
    reviewer_name VARCHAR(255),
    content VARCHAR(255),
    FOREIGN KEY (movie_id) REFERENCES movies(id)
);

CREATE TABLE ratings ( --fk키 설정 2
    id INT PRIMARY KEY,
    movie_id INT,
    rating FLOAT,
    FOREIGN KEY (movie_id) REFERENCES movies(id)
);



