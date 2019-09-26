package com.yedam.example;

public class Car {
	Tire frontLeft = new Tire("앞왼쪽",6);
	Tire frontRight = new Tire("앞오른쪽",2);
	Tire BackLeft = new Tire("뒤왼쪽",3);
	Tire BackRight = new Tire("뒤오른쪽",4);
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeft.roll() == false) {
			stop();
			return 1; // 왼쪽 앞바퀴에 문제가 발생하면 1값을 보내겠다.
		}else if(frontRight.roll() == false) {
			stop();
			return 2;
		}else if(BackLeft.roll() == false) {
			stop();
			return 3;
		}else if(BackRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
}
}
