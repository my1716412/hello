package com.yedam.example;

public class KumhoTire { 
KumhoTire(String location, int maxRotation) {
	super(location, maxRotation);
}


	@Override
	boolean roll() {
		accumulatedRotation++;
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + "Kumho 타이어수명:" 
					+(maxRotation-accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location +  "Kumho 타이어펑크***");
			return false;
	}





	}
}
