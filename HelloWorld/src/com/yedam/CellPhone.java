package com.yedam;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		super(); //"object(객체)" 기본적으로 최상위 부모클래스
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
