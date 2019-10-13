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
			System.out.println("1.생셩 |2.전체리스트 |3.조회|4.종료 ");
			System.out.println("----------------------------");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				Membery();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public static void createMember() {
		System.out.println("이름은: ");
		String memberName = sc.nextLine();
		System.out.println("id입력:");
		String memberId = sc.nextLine();
		System.out.println("Password입력:");
		String memberPassword = sc.nextLine();
		System.out.println("나이를 입력:");
		int memberAge = sc.nextInt();
		Member Mem = new Member(memberName, memberId, memberPassword, memberAge);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = Mem;
				break;

			}
		}
	}

	public static void getMemberList() {
		for (Member m : MemberArray) {
			if (m != null) {
				System.out.println(m.getName() + "," + m.getId());
			}
		}
	}

	public static void Membery() {
		System.out.println("ID를 입력하세요.");
		String MemberId = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String MemberPassword = sc.nextLine();
		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;
		// id,passwd 같으면 이름, 나이 출력
		// id 맞고 passwd 다르면 비밀번호 잘못
		// id, passwd 안맞으면 존재하지 않는 아이디
		for (Member m : MemberArray) {
			if (m != null && m.getId().equals(MemberId)) {
				if (m.getPassword().equals(MemberPassword)) {
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
				} else {
					isId = true;
					isPw = false;
					break;
				}
			} else {
				isId = false;
				isPw = false;
			}
		}
		if (isId == true && isPw == true)
			System.out.println("이름은:" + name + ", 나이는:" + age);
		else if (isId == true && isPw == false)
			System.out.println("비번틀림.");
		else if (isId == false && isPw == false)
			System.out.println("존재하지 않는 아이디.");

	}

}
