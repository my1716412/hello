package com.mycompany.ymy;

class Access2 {
	public Access2() {
		System.out.println("Access2");
	}

}

public class Access1 {
	public int field1;
	int field2;
	private int field3;
	public void method1() {
		field3 = 10;
		System.out.println("method1");
	}
	public void method2() {
		System.out.println(field3);
		System.out.println("method2");
	}
	private void method3() {
		System.out.println("method3");
	}
	public Access1() {
		System.out.println("Access1");
	}

}
