package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardProc {

	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
//	BoardService service = new BoardServiceImpl();
	List<Board> boardAry = new ArrayList<>();
	BoardCollection service = new BoardCollectionImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 9.종료 ");
			int menu = 0;
			try {
				menu = sc.nextInt();// error 발생가능한 곳.
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
//				e.printStackTrace();
			}
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				deleteBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
	
	public void login_check() {
		while(true) {
			System.out.println("id입력.");
			String id = sc.nextLine();
			System.out.println("passwd입력.");
			String passwd = sc.nextLine();
			if(id.contentEquals("user1") && passwd.contentEquals("1234")) {
				System.out.println("방문자1님 환영합니다.");
				break;
			} else {
				System.out.println("??");
			}
		}
	}

	public void deleteBoard() {
		System.out.println("삭제할 글번호:");
		int boardNo = sc.nextInt();
		service.deleteBoard(boardNo, boardAry);
	}

	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		Board board = new Board(boardNo, "", content, "");
		service.updateBoard(board, boardAry);
	}

	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글번호입력:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력:");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);

	}

	public void getBoardList() {
		System.out.println("전체글조회.");
//		Board[] boards = service.getBoardList(boardAry);
		List<Board> boards = service.getBoardList(boardAry);
		for (Board board : boards) {
			if (board != null)
				System.out.println(board);
		}

	}
}