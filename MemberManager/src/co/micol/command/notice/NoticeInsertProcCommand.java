package co.micol.command.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.common.Command;
import co.micol.dao.NoticeDao;
import co.micol.dto.NoticeDto;

public class NoticeInsertProcCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		NoticeDao dao = new NoticeDao();
		NoticeDto dto = new NoticeDto();
		
		HttpSession httpsession = request.getSession(); // 자바객체를 이용해서 session객체를 이용할 때
		String id = (String)httpsession.getAttribute("id");
		
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setReg_id(id);
		
        dao.insert(dto);
		
        String path = "/MemberManager/noticeList.do";
		response.sendRedirect(path);
	}

}
