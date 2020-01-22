<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function openFormClose(n) {
		if(n==1) {
		opener.document.frm.idch.value = 'Checked';
		} else { 
		opener.document.frm.id.value = "";
		opener.document.frm.id.focus();
		}
		window.close();
	}
</script>
</head>
<body>
	<div align="center">
		<div>
			<c:choose>
				<c:when test="${idcheck==true }">
					<h1>${id }는사용할 수 있는 아이디입니다.</h1>
					<div>
						<br />
						<button type="button" onclick="openFormClose(1)">확인</button>
					</div>
				</c:when>
				<c:otherwise>
					<h1>${id }는이미 사용하는 아이디입니다.</h1>
					<div>
						<br />
						<button type="button" onclick="openFormClose(0)">확인</button>
					</div>
				</c:otherwise>
			</c:choose>
		</div>

	</div>
</body>
</html>