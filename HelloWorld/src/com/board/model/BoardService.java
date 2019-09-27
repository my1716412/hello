package com.board.model;

public interface BoardService {
	public void writeBoard(Board board, Board[] boards);//글작성
	public Board getBoard(int boardNo, Board[] boards);//한건조회
	public Board[] getBoardList(Board[] boards);//전체리스트	
	public void updateBoard(Board board, Board[] boards);//내용변경
	
	
	public void deleteBoard(Board board, Board[] boards);//글삭제

}
