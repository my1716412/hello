package hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] MemberArray = new Member[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.회원등록 |2.회원번호 조회|3.등록 그룹별 리스트|4.종료 ");
			System.out.println("----------------------------");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				();
			} else if (menu == 3) {
				();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public static void createMember() {
		System.out.println("회원등록: ");
		String memberNo = sc.nextLine();
		System.out.println("회원번호조회: ");
		String memberName = sc.nextLine();
		System.out.println("등록 그룹별 리스트: ");
		String memberCourse = sc.nextLine();
		Member Mem = new Member(memberNo, memberName, memberCourse, 0);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = Mem;
				break;

			}
		}
	}

}
