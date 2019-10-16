package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p2.getValue().equals(p2.getValue());
		return bool1 && bool2;

	}

	public static <K, V> boolean compareValue(Pair<K, V> p5, Pair<K, V> p6) {
//		boolean bool3 = p5.getKey().equals(p6.getKey());
		boolean bool4 = p6.getValue().equals(p6.getValue());
		return  bool4;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
	
	
}
