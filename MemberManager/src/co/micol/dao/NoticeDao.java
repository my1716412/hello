package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.NoticeDto;

public class NoticeDao extends DAO {
	private NoticeDto dto;
	private ArrayList<NoticeDto> list;

	public NoticeDao() {
		super();
	}

	public ArrayList<NoticeDto> select(NoticeDto dto) {
		list = new ArrayList<NoticeDto>();

		String sql = "select seq, subject, contents, reg_id, reg_date, view_cnt from notice ";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new NoticeDto();
				dto.setSeq(rs.getInt("seq"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setReg_id(rs.getString("reg_id"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setView_cnt(rs.getInt("view_cnt"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		close();
		return list;
	}
	
	public int insert(NoticeDto dto) { 
		int n = 0;
		String sql= "insert into notice(seq,subject,contents,reg_id" 
				+ ") values(notice_seq.nextval,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getSubject());
			psmt.setString(2, dto.getContents());
			psmt.setString(3, dto.getReg_id());
			n = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

}
