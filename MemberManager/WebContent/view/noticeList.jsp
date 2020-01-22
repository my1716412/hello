<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
<div><h1>공 지 사 항</h1></div>
<div>
	<table border="1">
		<tr>
			<th>글 번 호</th>
			<th>작 성 자</th>
			<th>제 목</th>
			<th>작 성 일 자</th>
			<th>조 회 수 </th>
		</tr>
		<c:if test="${not empty noticelist }">
			<c:forEach var="notice" items="${noticelist }">
			<tr>
				<td>${notice.seq }</td>
				<td>${notice.reg_id }</td>
				<td>${notice.contents }</td>
				<td>${notice.reg_date }</td>
				<td>${notice.view_cnt }</td>			
			</tr>
			</c:forEach>
		</c:if>
	</table>
</div>
<div>
<c:if test="${grant == 'S' }">
<button type="submit" onclick="location.href='noticeInsert.do'">등록</button>
</c:if>
</div>
</div>
</body>
</html>