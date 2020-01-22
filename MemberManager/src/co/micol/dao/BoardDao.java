package co.micol.dao;

import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao extends DAO {
	private BoardDto dto;
	private ArrayList<BoardDto> list;
	
	public BoardDao() {
		super();
	}

	public ArrayList<BoardDto> select(int id) {  //전체리스트 또는 한개 리스트 가져오기
		list = new ArrayList<BoardDto>();			 //id = 0이면 "All"전체	 아니면, 그룹전체 
		String sql = "select * from mvc_board";
		if (id != 0) sql = sql + " where bgroup= ?";
		//코드
		return list;
	}
	
	public int insert(BoardDto dto) {
		int n = 0; 
		
		return n;
	}
	public int update(BoardDto dto) {
		int n = 0; 
		
		return n;
	}
	public int delete(BoardDto id) {
		int n = 0; 
		
		return n;
	}
}
