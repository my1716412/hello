package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardProc {
	
	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];
	BoardService service = new BoardServiceImpl();
	
	public void execute() {
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("1.작성2.단건조회3.전체조회4.변경9.종료");
			int menu = sc.nextInt();
			if(menu == 1) {
				writeBoard();
			}else if (menu == 2) {
				getBoard();
			} else if (menu == 4) {
				updateBoard();
			}else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("프로그램종료");
	}
	
	public void updateBoard() {
		System.out.println("변경할 글 번호");
		int boardNo = sc.nextInt();sc.nextLine();
		System.out.println("변경할 내용");
		String content = sc.nextLine();
		System.out.println("변경할 제목");
		String title = sc.nextLine();
		System.out.println("변경할 작성자");
		String writer = sc.nextLine();
		Board board = new Board(boardNo,title,content,writer);
		service.updateBoard(board, boardAry);
	}
	public void writeBoard() {
		System.out.println("글작성");
		System.out.println("게시글번호입력");
		int boardNo = sc.nextInt();sc.nextLine();
		System.out.println("제목입력");
		String title = sc.nextLine();
		System.out.println("내용입력");
		String contens = sc.nextLine();
		System.out.println("작성자입력");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contens, writer);
		
		service.writeBoard(board, boardAry);
//		for(int i=0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}
	public void getBoard() {
		System.out.println("한건");
		System.out.println("조회할 번호 입력");
		int boardNo = sc.nextInt();
		
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println("board");
//		for(int i=0; i< boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle()+"," + boardAry[i].getWriter());
//			}
//		}
//		
	}
	public void getBoardList() {
		System.out.println("전체글");
		Board[] resultAry= service.getBoardList(boardAry);
		for(Board brd : resultAry) {
			System.out.println(brd);
		}
//		for(int i=0; i< boardAry.length; i++) {
//			if(boardAry != null ) {		
//			System.out.println(boardAry[i].getBoardNo()+ "," + boardAry[i].getTitle);
//			}
//		}
		
	}
}
