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
			<h1>공 지 사 항 등 록</h1>
			<div>
				<form id="frm" name="frm" action="noticeInsertProc.do" method="post">
					<div align="center">
						<table border="1">
							<tr>
								<th width="100">제 목</th>
								<td>&nbsp;&nbsp; <input type="text" id="subject" name="subject" size="50"></td>
							</tr>
							<tr>
								<th width="100">내 용</th>
								<td>&nbsp;&nbsp; <textarea  id="contents" name="contents"></textarea>
								</td>
							</tr>
						</table>
					</div>
					<div>
					<br />
						<input type="submit" value="등록">
						&nbsp;&nbsp; 
						<input type="reset" value="취소">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>