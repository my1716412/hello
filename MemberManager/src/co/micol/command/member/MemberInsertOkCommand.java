package co.micol.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;
import co.micol.dao.MemberDao;
import co.micol.dto.MemberDto;

public class MemberInsertOkCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		
		dto.setId(request.getParameter("id"));
		dto.setName(request.getParameter("name"));
		dto.setPassword(request.getParameter("pw"));
		dto.setAddr(request.getParameter("addr"));
		dto.setTel(request.getParameter("tel"));
		System.out.println("### id : " + request.getParameter("id"));
		System.out.println("### name : " + request.getParameter("name"));
		System.out.println("### pw : " + request.getParameter("pw"));
		System.out.println("### addr : " + request.getParameter("addr"));
		System.out.println("### tel : " + request.getParameter("tel"));
		System.out.println("###request.getParameterNames() : " + request.getParameterNames());
		;
		
		int pass = dao.insert(dto);
		
		String path="view/menberInsertOk.jsp";
		request.setAttribute("pass", pass);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
