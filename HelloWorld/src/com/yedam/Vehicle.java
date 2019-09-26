package com.yedam;

import com.yedam.example.Tire;
class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("버스 달림");
	}
	
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시 달림");
	}
}
public class Vehicle {
	String engine;
	String handle;
	Tire tire;
	void start ( ) {
		System.out.println("차 출발");
	}
	void run() {
		System.out.println("차 달림");
	}
	void stop() {
		System.out.println("차 정지");
	}

}
