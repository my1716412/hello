package com.board.model;

public class Board {
	int boardNo;
	String title;
	String contents;
	String writer;
	public Board(int boardNo, String title, String contents, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
