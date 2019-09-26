package com.yedam.example;

public class KumhoTire extends Tire{ 
public KumhoTire(String location, int maxRotation) {
	super(location, maxRotation);
}
@Override
public
	boolean roll() {
		accumulatedRotation++;
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + "Kumho 타이어수명:" 
					+(maxRotation-accumulatedRotation) + " 회");
			return true;
		} else {
			return false;
	}





	}
}
