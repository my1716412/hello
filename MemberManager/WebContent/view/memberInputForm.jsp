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
	<div>
		<br />
		<c:choose>
		<c:when test="${id != null }">
			<h1>${id }님은 이미 등록된 회원입니다.</h1>
		</c:when>
		<c:otherwise>
			<h1>회원 등록 화면</h1>
			<div>
				<form id="frm" name="frm" action="memberInsertOk.do" method="post" onsubmit="return memberFormCheck();">
					<div>
						<table border="1">
							<tr>
							<th width="110">아 이 디</th>
								<td><input type="text" id="id" name="id" size="20"> &nbsp;&nbsp;
									<button type="button" id="idch" name="idch" onclick="idCheck()" value="unCheck">중복체크 </button>
								</td>
							</tr>
							<tr>
								<th>이 름</th>
								<td><input type="text" id="name" name="name" size="30"></td>
							</tr>
							<tr>
								<th>비밀번호</th>
								<td><input type="password" id="pw" name="pw" size="30"></td>
							</tr>
							<tr>
								<th>비밀번호 확인</th>
								<td><input type="password" id="pwChk" name="pwChk" size="30"></td>
							</tr>
							<tr>
								<th>주 소</th>
								<td><input type="text" id="addr" name="addr" size="70"></td>
							</tr>
							<tr>
								<th>전 화 번 호</th>
								<td><input type="text" id="tel" name="tel" size="30"></td>
							</tr>
						</table>
					</div>
					<div>
						<br />
						<input type="submit" value="가입"> &nbsp;&nbsp;
						<input type="reset" value="취소"> &nbsp;&nbsp;
					</div>
				</form>
			</div>
		</c:otherwise>
		</c:choose>
	</div>
	</div>
</body>
</html>