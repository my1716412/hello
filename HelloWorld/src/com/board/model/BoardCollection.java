package com.board.model;

import java.util.List;

public interface BoardCollection {
	public void writeBoard(Board board, List<Board> boards);//글작성

	public Board getBoard(int boardNo, List<Board> boards);//한건조회
	
	public List<Board> getBoardList(List<Board> boards);//전체리스트	
	
	public void updateBoard(Board board, List<Board> boards);//내용변경
	
	public void deleteBoard(Board board, List<Board> boards);//글삭제

}
