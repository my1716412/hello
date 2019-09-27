package hello;

import java.util.Scanner;

public class TestScore {
	private static TestScore[] ShArray = new TestScore[10];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("[시험성적]");
			System.out.println("---------------------------------------------");
			System.out.println("1.성적|2.전체리스트|3.학생번호조회|4.통계|5.총점기준|6.종료");
			System.out.println("---------------------------------------------");
			System.out.println("입력 > ");
			int Control = sc.nextInt();
			if(Control == 1) {
				Score();
			} else if(Control == 2) {
				
			} else if(Control == 3) {
				
			} else if(Control == 4) {
				run = false;
			}
		}System.out.println("프로그램을 종료합니다.");
	}	
		public static void Score() {
			System.out.println("이름은: ");
			String studentName = sc.nextLine();
			System.out.println("id입력:");
			String studentId= sc.nextLine();
			System.out.println("국어:");
			int studentKor = sc.nextInt();
			System.out.println("영어:");
			int studentEng = sc.nextInt();
			System.out.println("수학:");
			int studentMath = sc.nextInt();
			Student st = new Student(studentName, studentId, studentKor, studentEng, studentMath);
			
		}
		
	}
	
