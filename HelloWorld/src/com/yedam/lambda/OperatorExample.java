package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] score = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = 0;
		for (int score : score) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		IntBinaryOperator oper = (a, b) -> {
			int result = score[0];
			result = (a >= b ? a : b);
			return result;

		};
		int result = minOrMax(oper);
		System.out.println("Max" + result);
		
		result = minOrMax((a, b) -> {
			return (a>= b ? b : a);
		});
		System.out.println("min: " + result);
	}
}
