




--LENGTH 글자수 !!

SELECT LENGTH(ENAME) FROM EMP --5

--SUBSTR / INSTR 문자열 추출/문자열의 위치 !!

SELECT SUBSTR(ENAME,2) FROM EMP --ILL --ILL 2번째 글자부터 끝까지
SELECT SUBSTR(ENAME,1,2) FROM EMP --WI --WI 1번째 글자부터 2개
SELECT SUBSTR(ENAME,-2) FROM EMP --LL -- -2번째(뒤에서 두번째) 글자부터 끝까지

--REPLACE 특정문자를 다른 문자로 대체 !!

SELECT REPLACE(ENAME,'L''N') FROM EMP --WINN

--CONCAT 문자열을 결합 !!

SELECT CONCAT(ENPNO, ':') FROM EMP --78WILL
SELECT CONCAT(ENPNO,':',ENAME) FROM EMP --78:WILL

--TRIM / LTRIM / RTRIM 특정문자나 공백을 삭제(앞뒤/앞만/뒷만) !!

SELECT TRIM('W' FROM ENAME) FROM EMP --ILL
SELECT TRIM(' hong ') FROM EMP -- hong

--UPPER/LOWER/INITCAP 대변자/ 소문자/ 첫글자만 대문자로 변환

SELECT UPPER(ENAME) FROM EMP --WILL

--LPAD/RPAD 빈 공간을 특정문자로 대체
SELECT LPAD(ENAME, 6 , '#') FROM EMP --##WILL -- 6개의 나머지 앞자리를 #으로 채우기, 채울 문자를 넣지 않은 경우 공백으로 채워짐


--수업실습

SELECT LENGTH(TRIM(ENAME)) FROM emp

SELECT trim(BOTH 'A' FROM ename) FROM emp -- 양쪽끝에 A를 제거

SELECT trim (LEADING 'A' FROM ename) FROM emp -- 앞쪽에 A를 제거

SELECT trim (TRAILING 'A' FROM ) 

--1
  
SELECT LENGTH(ename) From emp

--2

SELECT LENGTH(ename) FROM emp WHERE job ='manager'

--3

SELECT ename, job FROM emp WHERE comm IS NULL 

--4

SELECT hiredate FROM emp WHERE comm IS NOT NULL 

--5

SELECT substa(ename, 2) FROM emp

--6

SELECT substa(ename,1,3) FROM emp

--7
SELECT replace(ename,'k','p') FROM emp

--8 
SELECT empno || '번은' || ename || '입니다' FROM emp

--9
SELECT hiredate,
to_char(sysdate,'mm') AS mm, To_char(sysdate,'day') AS DAY FROM emp

--10
SELECT job
CASE job 
	WHEN 'manager' THEN 'level1'
	WHEN 'salesman' THEN 'level2'
	ELSE 'level3'
END AS level_result
FROM emp

SELECT count(*)
FROM emp

SELECT count(SAL)
FROM emp
WHERE job = 'SALESMAN'

SELECT COUNT(SAL),SUM(SAL),AVG(SAL), MIN(SAL),MAX(SAL)
FROM EMP
GROUP BY JOB
ORDER BY JOB 
HAVING count(SAL) >= 4 --그룹을 지어서 검색 후 필터링을 하고자 하는 경우 
ORDER BY JOB DESC -- 다 끝난 다음에 정렬 

-----------------------------------------정리문제 2

SELECT count(*)
FROM EMP e 

SELECT count(*)
FROM EMP e 
WHERE DEPTNO = 20 OR MGR <= 7700


SELECT MIN(SAL)
FROM EMP e 
WHERE DEPTNO = 10 OR DEPTNO = 20

SELECT DEPTNO, avg(SAL)
FROM EMP 
GROUP BY DEPTNO

SELECT DEPTNO, SUM(SAL)
FROM EMP 
GROUP BY DEPTNO
ORDER BY DEPTNO 

SELECT DEPTNO, avg(SAL)
FROM EMP 
GROUP BY DEPTNO
HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO DESC 

SELECT COUNT(*), AVG(SAL) 
FROM EMP 
WHERE JOB = 'MANAGER'

SELECT COUNT(*) 
FROM EMP 
WHERE ENAME LIKE '%S%'

SELECT COUNT(*) 
FROM EMP 
WHERE SAL >= 3000 AND COMM IS NOT NULL 
ORDER BY SAL DESC

--------------------------------------------------
-- join :왜 하는가? 검색을 하고 싶은데 항목들이 여러개의 테이블에 흩어져 있는 경우
--		테이블을 모아서 (합해서) 검색
-- 2개의 테이블의 공통된 값들만 조인해서 검색

SELECT *
FROM HR."MEMBER" m  , HR.BBS b  
WHERE m.ID = b.WRITER

SELECT  B."no", title, NAME 
FROM HR."MEMBER" m ,HR.BBS b 
WHERE M.ID = B.WRITER 

---- INner join : 테이블간 공통된 값만 추출
---- emp 테이블과 dept 테이블을 조인하세요.
---- 하나의 컬럼이상이 동일한 컬럼이 있어야 함
---- empno, ename, job, deptno, loc 컬럼 검색
---- 조인조건: deptno

SELECT e.EMPNO, E.ENAME, E.JOB, D.DEPTNO, D.LOC
FROM DEPT d ,EMP e  -- 앞에가 LEFT 뒤가 RIGHT
WHERE D.DEPTNO =E.DEPTNO 

SELECT *
FROM "MEMBER" m
LEFT OUTER JOIN BBS b 
ON (m.ID = b.WRITER)

SELECT *
FROM "MEMBER" m
RIGHT OUTER JOIN BBS b 
ON (m.ID = b.WRITER)

--LEFT / RIGHT OUTER JOIN 
--1. EMP테이블의 정보는 다보이게 하고 싶음. DEPT는 맞는것만 오른쪽에 붙여두고 싶습니다.
SELECT *
FROM EMP e 
LEFT OUTER JOIN DEPT d 
ON (E.DEPTNO = D.DEPTNO)

--2. DEPT테이블의 정보는 다보이게 하고 싶음. EMP는 맞는 것만 오른쪽에 붙여주고 싶음.

SELECT * 
FROM EMP e 
RIGHT OUTER JOIN DEPT d 
ON (E.DEPTNO = D.DEPTNO)

-------------------------------------------------------

SELECT *
FROM HR."MEMBER" m ,HR.BBS b 
WHERE M.ID = B.WRITER 

SELECT *
FROM "MEMBER" m 
LEFT OUTER JOIN BBS b 
ON M.ID = B.WRITER 

CREATE TABLE COMPANY(
ID VARCHAR2(200) PRIMARY KEY,
NAME VARCHAR2(200),
ADDR VARCHAR2(200),
TEL VARCHAR2(200)

)

INSERT INTO COMPANY VALUES ('C100', 'GOOD', 'SEOUL', '011')

INSERT INTO COMPANY VALUES ('C200', 'JOA', 'BUSAN', '012')

INSERT INTO COMPANY VALUES ('C300', 'MARIA', 'ULSAN', '013')

INSERT INTO COMPANY VALUES ('C400', 'MY', 'KWANGJU', '014')

SELECT *FROM COMPANY

SELECT *
FROM COMPANY c, PRODUCT22 p  
WHERE c.ID = p.COMPANY  

SELECT *
FROM COMPANY c 
LEFT OUTER JOIN PRODUCT22 p  
ON c.ID = p.COMPANY

SELECT *
FROM COMPANY c 
RIGHT OUTER JOIN PRODUCT22 p  
ON c.ID = p.COMPANY

