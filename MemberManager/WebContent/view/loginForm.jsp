<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<h1>로 그 인</h1>
			<div>
				<form id="frm" name="frm" action="loginOk.do" method="post" onsubmit="return LoginFormCheck()">
					<div>
						<table border="1">
							<tr>
								<th width="100">아 이 디</th>
								<td>&nbsp;&nbsp; <input type="text" id="id" name="id"size="50"></td>
							</tr>
							<tr>
								<th width="100">비 밀 번 호</th>
								<td>&nbsp;&nbsp; <input type="password" id="pw" name="pw"size="50"></td>
							</tr>
						</table>
					</div>
					<div>
					<br />
						<input type="submit" value="로그인">
						&nbsp;&nbsp; 
						<input type="reset" value="취소">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>