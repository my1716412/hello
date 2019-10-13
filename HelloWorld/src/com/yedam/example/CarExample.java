package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car Car = new Car();
		for(int i=0; i<10; i++) {
			int problemLocation = Car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 한국타이어로 교체.");
				Car.frontLeft = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞 오른쪽 금호차이어로 교체.");
				Car.frontRight = new KumhoTire("앞오른쪽",17);
				break;
			case 3 :
				System.out.println("뒤왼쪽 한국차이어로 교체.");
				Car.BackLeft = new HankookTire("뒤왼쪽",16);
			   break;
			case 4:
				System.out.println("뒤오른쪽 금호차이어로 교체.");
				Car.BackRight = new KumhoTire("뒤오른쪽",15);
				break;
			}
			System.out.println("-----------------------------");
		} 
		
		
	}

}
