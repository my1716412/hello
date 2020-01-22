<%@page import="co.micol.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
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
<div><jsp:include page="topmenu.jsp"></jsp:include></div>
<div><h1>회 원 목 록</h1></div>
<div>
	<table border="1">
		<tr>
			<th>아 이 디</th>
			<th>이 름</th>
			<th>가 입 일 자</th>
			<th>주 소</th>
			<th>전 화 번 호</th>
		</tr>
<%--
		<tr>
			<td colspan="5">JSP 익스프레션</td>
		</tr>
//jsp 익스프레션
	ArrayList<MemberDto> list = (ArrayList<MemberDto>)request.getAttribute("memberlist");
	if(list != null){
		for(MemberDto dto : list){
--//%>
		<tr>
			<td><%=dto.getId() %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.geteDate() %></td>
			<td><%=dto.getAddr() %></td>
			<td><%=dto.getTel() %></td>
		</tr>
<%//--
		}
	}
		<tr>
			<td colspan="5">jstl</td>
		</tr>
--%>
<!-- c:tag -->		
		<c:if test="${not empty memberlist }">
			<c:forEach var="member" items="${memberlist }">
			<tr>
				<td>${member.id }</td>
				<td>${member.name }</td>
				<td>${member.eDate }</td>
				<td>${member.addr }</td>
				<td>${member.tel }</td>
			</tr>
			</c:forEach>
		</c:if>
	</table>
</div>
<div>
<br />
<button type="button" onclick="location.href='view/main.jsp'">확인</button>
</div>
</div>
</body>
</html>