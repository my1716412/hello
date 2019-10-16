package com.yedam.lambda;
@FunctionalInterface 
 //                 가 람다식의 대상이됨. 구현하는 하나의 메소드있어야함.
interface MyInterface {
	int print(int a, int b); 
}

class MyInterfaceClass implements MyInterface {

	@Override
	public int print(int a, int b) {
		return a + b;
	}

}

public class LambdaBasicExample {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterfaceClass();
//		int result = mi.print(4, 9);
//		System.out.println("결과값은:" + result);

		MyInterface mi = (c, d) -> {
			int res = 0;
			res = c * d;
		    return res;
			};
		    int result = mi.print(3, 5);
		System.out.println("결과값은:" + result);

		mi = new MyInterface() {
			@Override
			public int print(int a, int b) {
				return a - b;
			}

		};
		result = mi.print(7, 4);
		System.out.println("결과값은:" + result);
		
		
		 mi = (e, f) -> {
			return e/f;
		};
		System.out.println("결과 : " + mi.print(8,4));
		
	}
}
