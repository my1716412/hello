package com.yedam.exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "10";
		String data2 = "20";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("sum :" + (val1 + val2));
	}
}
