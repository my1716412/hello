package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}
	
	int instanceSum(int x, int y) {
		return x + y;
	}
	
}
public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10, b = 20, result = 0;
		Calculator.staticSum(a, b);
		Calculator cal = new Calculator();
		cal.instanceSum(a, b);
		
		IntBinaryOperator oper;
		//정적메소드 1,2
		oper = (x, y) -> {
			return Calculator.staticSum(x, y);
		};
		result = oper.applyAsInt(a, b);
		System.out.println("정적메소드참조1  :" + result);
		
		oper = Calculator::staticSum; // :: 메소드 참조를 의미 static 
		result = oper.applyAsInt(a, b);
		System.out.println("정적메소드참조2 : " + result);
		
		System.out.println("==================================");
		
		// 인스턴스메소드 1, 2
		oper = (x, y) -> {
			return cal.instanceSum(x, y);
		}; 
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스메소드참조1 : " + result);// instance 메소드1
		
		oper = cal::instanceSum;	// instance 메소드2
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스메소드참조2 : " + result);
	}
}
