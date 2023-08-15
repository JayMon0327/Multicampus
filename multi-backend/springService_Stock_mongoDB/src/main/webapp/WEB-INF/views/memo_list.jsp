<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" 
uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<table border="1" width="700px">
    <tr>
        <th>No</th>
        <th>이름</th>
        <th>메모</th>
        <th>날짜</th>
    </tr>
<c:forEach var="row" items="${map.items}" varStatus="status"> <!-- varStatus는 변수명을 붙인것 -->
                <!-- 컨트롤러에서 보낸 map의 items안에 있는 값들을 하나씩 출력 -->
    <tr background="lime">
        <td>${status.count}</td> 
        <!-- 원래 {row._id}가 키값인데 이렇게 쓰면 숫자 뒤에 소수점이 붙어서 나오고, status를 쓰면 중간에 값이 빠질일이 없이 제대로 출력된다.-->
        <!-- index 0부터, count 1부터이기 때문에 count를 사용해서 소수점을 제외하고 출력시킨다.-->
        
        <td>${row.writer}</td>
        <!--작성자이름을 호출한다.-->
        
        <td>
            <a href="#" onclick="memo_view('${row._id}')">${row.memo}</a>
            <!-- _id가 키값이기 때문에 id를 넘겨서  메모내용으로 넘어간다.-->
        </td>
        <td>
        <!-- 날짜가 나오는 형식을 지정하기 위해 formatDate태그와 패턴을 사용한다. -->
        <fmt:formatDate value="${row.post_date}" 
                pattern="yyyy-MM-dd HH:mm:ss" /></td>
    </tr>
</c:forEach>    
</table>
