package com.yedam.example2;

import com.yedam.example.Tire;

public class Car2 {
	Tire [] tireAry = { new Tire("앞 왼쪽", 6)
			          , new Tire("앞오른쪽", 2)
			          , new Tire("뒤왼쪽", 3)
			          , new Tire("뒤오른쪽", 4)};
	
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 2);
//	Tire backLeft = new Tire("뒤왼쪽", 3);
//	Tire backRight = new Tire("뒤오른쪽", 4);
	//필드선언시 클래스의 인스턴스도 사용할 수 있다.
	
 	public int run() {
		System.out.println("[자동차가 달립니다]");
//		for(int i =0; i<tireAry.length;) {
//		if(tireAry[i].roll() == false) {
//			stop();
//			return i + 1;
//		}
// 	}		
		if(tireAry[0].roll() == false) {
			stop();
			return 1;//왼쪽 앞바퀴에 문제가 발생하면 1을 내보내겠다.
		} else if(tireAry[1].roll() == false) {
			stop();
			return 2;
		} else if(tireAry[2].roll() == false) {
			stop();
			return 3;
		} else if(tireAry[3].roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
}