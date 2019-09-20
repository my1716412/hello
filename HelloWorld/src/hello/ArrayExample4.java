package hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		String[] strAry= {"Hello", "World", "Good", "Morning"};
		String[] copyAry= new String[strAry.length];
//		for(int i=0; i<strAry.length; i++) {
//			copyAry[i] = strAry[0];
//		}
////		for(String str : strAry) {
////			System.out.println(str);
//		for(int i=0; i<strAry.length; i++) {
////			copyAry[i] = strAry[0];
////		}
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length);
		for(String str : strAry) {
			System.out.println(str);
		}
	
	}

}
