package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> { 
			System.out.println(t + "8");
		};
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = (d) -> {
			System.out.println("java" + d);
		};
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objconsumer = (s, i) -> {
			System.out.println(s + i);
		};
		objconsumer.accept("java", 8);
	}
}
