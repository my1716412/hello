function LoginFormCheck() {
	if(frm.id.value=="") {
		alert("아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	if(frm.pw.value=="") {
		alert("비밀번호를 입력하세요.")
		frm.pw.focus();
		return false;
	}
	return true;
}

function memberFormCheck() {
	if(frm.id.value=="") {
		alert("사용할 아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	if(frm.idch.value=="unCheck") {
		alert("아이디 중복체크를 확인해주세요.");
		return false;
	}
	if(frm.pw.value=="") {
		alert("사용할 비밀번호를 입력하세요.");
		frm.pw.focus();
		return false;
	}
	if(frm.pwChk.value=="") {
		alert("비밀번호를 확인해주세요.");
		frm.pwChk.focus();
		return false;
	}
	if(frm.pw.value != frm.pwChk.value) {
		alert("비밀번호가 일치하지 않습니다.");
		frm.pwChk.focus();
		return false;
	}
	if(frm.tel.value=="") {
		alert("연락처를 입력하세요.");
		frm.tel.focus();
		return false;
	}
	console.log(frm.tel.value);
	return true;
}

function idCheck() {
	var id=frm.id.value;
	if(id == "") {
		alert("아이디값을 입력 후 확인하세요.");
		frm.id.focus();
	}else {
	window.open("idCheck.do?id="+id,"","width=500,height=400,top=50,left=50");
	}	
	
}




