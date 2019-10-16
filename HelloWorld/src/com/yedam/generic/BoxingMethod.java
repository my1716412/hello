package com.yedam.generic;

public class BoxingMethod {
	public static void main(String[] args) {
		Integer intValue = new Integer(10); // 10; 해도됨 
		Box<Integer> box = Util.boxing(intValue);
		System.out.println(box.getObj());
		
		Box<String> strBox = Util.boxing("Hello");
		System.out.println(strBox.getObj());
	}
}
