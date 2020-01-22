package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.IndexCommand;
import co.micol.command.member.IdCheckCommand;
import co.micol.command.member.LogOutCommand;
import co.micol.command.member.LoginCommand;
import co.micol.command.member.LoginOkCommand;
import co.micol.command.member.MemberInputCommand;
import co.micol.command.member.MemberInsertOkCommand;
import co.micol.command.member.MemberListCommand;
import co.micol.command.member.NoticListCommand;
import co.micol.command.notice.NoticeInsertCommand;
import co.micol.command.notice.NoticeInsertProcCommand;
import co.micol.common.Command;

@WebServlet("/NewFrontController")
public class NewFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Command> cont = new HashMap<String, Command>();
  
	public NewFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// 해쉬맵 구조를  put() 적어준다
		cont.put("/index.do", new IndexCommand()); // 홈페이지 호출
		cont.put("/login.do", new LoginCommand()); //로그인
		cont.put("/loginOk.do", new LoginOkCommand());
		cont.put("/logout.do", new LogOutCommand()); 
		cont.put("/memberInput.do", new MemberInputCommand()); //회원가입
		cont.put("/idCheck.do", new IdCheckCommand());
		cont.put("/memberInsertOk.do", new MemberInsertOkCommand());
		cont.put("/memberList.do", new MemberListCommand());
		cont.put("/noticeList.do", new NoticListCommand());
		cont.put("/noticeInsert.do", new NoticeInsertCommand());
		cont.put("/noticeInsertProc.do", new NoticeInsertProcCommand());
//		cont.put("/noticeInsert.do", new IndexCommand());
//		cont.put("/noticeInsert.do", new IndexCommand());
//		cont.put("/noticeInsert.do", new IndexCommand());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 실행할 class객체를 찾아주는 부문 get()
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command commandImpl = cont.get(path); //실행 클래스를 선택한다.
		commandImpl.excute(request, response);
		

}
}
