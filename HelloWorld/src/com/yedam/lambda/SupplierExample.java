package com.yedam.lambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intsup = () -> {
			int num = (int) (Math.random()*6+1);
			return num;
		};
		int result = intsup.getAsInt();
		System.out.println("결과: " + result);
	}
}
