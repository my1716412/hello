package com.yedam.collections.list;

import java.util.List;
import java.util.Vector;

import com.board.model.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board(1,"제목1", "내용1", "작성자1"));
		list.add(new Board(2,"제목2", "내용2", "작성자2"));
		list.add(new Board(3,"제목3", "내용3", "작성자3"));
		list.add(new Board(4,"제목4", "내용4", "작성자4"));
		list.add(new Board(5,"제목5", "내용5", "작성자5"));
		for(Board b : list) {
			System.out.println(b);
		}
		list.remove(0);
		System.out.println("==========================");
		for(Board b : list) {
			System.out.println(b);
		}
	}
}
