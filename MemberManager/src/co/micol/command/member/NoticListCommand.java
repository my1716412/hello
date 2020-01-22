package co.micol.command.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;
import co.micol.dao.NoticeDao;
import co.micol.dto.NoticeDto;

public class NoticListCommand implements Command{
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NoticeDao dao = new NoticeDao();
		NoticeDto dto = new NoticeDto();
		
		ArrayList<NoticeDto> list = dao.select(dto);
		request.setAttribute("noticelist", list);
		
		String path="view/noticeList.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
