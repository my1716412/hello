package com.dbpackage.control;

import java.util.List;
import java.util.Scanner;

import com.board.model.BoardDB;
import com.dbpackage.impl.StudentServiceImpl;
import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;

public class StudentProc {

	Scanner sc = new Scanner(System.in);
	StudentService service = new StudentServiceImpl();

	public void execute() {
		System.out.println("execute");

		while (true) { // 무한 루프 돌리기 위해서
			int menu = 0;
			System.out.println("1. 입력| 2. 전체 조회| 3. 한 건 조회| 9. 종료");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoardList();
			} else if (menu == 3) {
				getBoard();
			} else if (menu == 9) {
				break;
			}
		}

	}

	public void writeBoard() {
		System.out.println("학생번호를 입력하세요");
		int studentNo = sc.nextInt();
		sc.nextLine();
		System.out.println("학생이름을 입력하세요");
		String studentName = sc.nextLine();

		System.out.println("전공을 입력하세요");
		String major = sc.nextLine();

		Student student = new Student(studentNo, studentName, major);
		service.insertStudent(student);

	}

	public void getBoardList() {

		System.out.println("전체 조회를 시행합니다");
		System.out.println("=================");
		System.out.println("학생 번호|학생 이름|전공");
		System.out.println("=================");

		List<Student> getStudentList = service.getStudentList();
		for (Student student : getStudentList) {
			System.out.println(student.getStudentNo() + " | " + student.getStudentName() + " | " + student.getMajor());
		}
		System.out.println("=================");

	}

	public void getBoard() {

	}

}
