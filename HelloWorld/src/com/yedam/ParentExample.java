package com.yedam;
class Parent {
	void method1 () {
		System.out.println("부모클래스의 메소드1.");
	}
	void method2 () {
		System.out.println("부모클래스의 메소드2.");
	}
}

class child extends Parent {
	@Override
	void method1() {
		System.out.println("자식클래스의 메소드1.");
	}
	@Override
	void method2() {
		System.out.println("자식클래스의 메소드2.");
	}

	void method3() {
		System.out.println("자식클래스의 메소드3.");
	}

}

public class ParentExample {
	public static void main(String[] args) {
		child c1 = new child(); // 자동형변환
//		c1.method1();
//		c1.method2();
//		c1.method3();
			Parent p1 = c1;
//			p1.method1();
//			p1.method2();
//			p1.method3(); // 에러
		
		if (p1 instanceof child) {
		c1 = (child) p1;
		c1.method1();// 가능
		c1.method2();// 가능
		c1.method3();// 가능
		}
		Parent p2 = new Parent();
//		p2.method1();
//		p2.method2();
		if (p2 instanceof child) {
			c1 = (child) p2;
			c1.method1();// 가능
			c1.method2();// 가능
			c1.method3();// 가능
		}

	}

}
