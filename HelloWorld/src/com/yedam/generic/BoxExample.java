package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.setObj(new String("Hello"));
		String str = box.getObj();
		
		Box<Integer> intBox = new Box<>();
		intBox.setObj(10);
		int intValue = intBox.getObj();
		
		
		
//		Box box = new Box();
//		box.setObj(new String("Hello"));
//		String strValue = (String) box.getObj();
//		System.out.println(strValue);
//	
//		box.setObj(new Integer(10));
//		int intValue =(int) box.getObj();
//		System.out.println(intValue);
//		
//		box.setObj(new Double(1.1));
//		String newStr = (String) box.getObj();
	}
}
