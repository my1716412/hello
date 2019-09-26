package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("윤미영");
		m1.setId("yyy");
		m1.setPassword("yyy1");
		m1.setAge(20);

		Member m2 = new Member("관리자", "admin");
		m2.setPassword("admin123");
		m2.setAge(0);

		Member m3 = new Member("사용자1", "user1", "user123", 10);

		Member[] memberAry = { m1, m2, m3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 이름 입력");
		String Name = sc.nextLine();
		for (Member m : memberAry) {
			if (m.getName().equals(Name))
				System.out.println("==>" + m.getName() + "," + m.getId() + "," + m.getPassword() + "," + m.getAge());
		}
	}
}
