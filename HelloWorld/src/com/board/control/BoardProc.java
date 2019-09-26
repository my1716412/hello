package com.board.control;

import java.util.Scanner;

import com.board.model.Board;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];
	public void execute() {
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("1.작성2.단건조회3.전체4.종료");
			int menu = sc.nextInt();nextLine();
			if(menu == 1) {
				writeBoard();
			}else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			}else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("프로그램종료");
	}
	

	public void writeBoard() {
		System.out.println("글작성");
		System.out.println("게시글번호입력");
		int boardNo = sc.nextInt();
		System.out.println("제목입력");
		String title = sc.nextLine();
		System.out.println("내용입력");
		String contens = sc.nextLine();
		System.out.println("작성자입력");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contens, writer);
		for(int i=0; i < boardAry.length; i++) {
			if (boardAry[i] == null) {
				boardAry[i] = board;
				break;
			}
		}
	}
	public void getBoard() {
		System.out.println("한건");
		System.out.println("조회할 번호 입력");
		int boardNo = sc.nextInt();
		for(int i=0; i< boardAry.length; i++) {
			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
				System.out.println(boardAry[i].getTitle()+"," + boardAry[i].getWriter());
			}
		}
		
	}
	public void getBoardList() {
		System.out.println("전체글");
		for(int i=0; i< boardAry.length; i++) {
			System.out.println(boardAry[i].getBoardNo);
		}
		
	}
}
