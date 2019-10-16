package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
		
	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for(Board board : boards) {
			if(board.getBoardNo() == boardNo) {
				boardTemp = board;
			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> listTemp = new ArrayList<>();
		for(Board board : boards) {
			listTemp.add(board);
		}
		return listTemp;
	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for(Board boardTemp : boards) {
			if (board.getBoardNo() == boardTemp.getBoardNo()) {
				boardTemp.setTitle(board.getTitle());
				
			}
		}
		
	}

	@Override
	public void deleteBoard(Board board, List<Board> boards) {
		for(Board board : boards) {
			if(board.getBoardNo() == boardNo) {
				boards.remove(board);
			}
		}
		
	}

	
	
}
