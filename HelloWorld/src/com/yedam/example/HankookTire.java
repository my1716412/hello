package com.yedam.example;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
@Override
public
boolean roll() {
	accumulatedRotation++;
	if(maxRotation>accumulatedRotation) {
		System.out.println(location + "타이어수명:" 
				+(maxRotation-accumulatedRotation) + " 회");
		return true;
	} else {
		System.out.println("***" + "타이어펑크***");
		return false;
}

}
}