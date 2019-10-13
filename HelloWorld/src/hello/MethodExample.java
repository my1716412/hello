package hello;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		int a = 30;
		showName();
		showAge(a);
		showMe(175.5,65.5);
		int result = sum(4,5);
		System.out.println("결과값:" + result);
		int resul = minus(7,4);
		System.out.println("결과:" + resul);
		int resu = multi(3,3);
		System.out.println("답:" + resu);
		int res =div(10,2);
		System.out.println("답:" + res);
		System.out.println(args[1]);
		double aaa = Weight(165.5);
		System.out.println("적정몸무게:"+ aaa );
	}
	
	
	public static double Weight(double height) {
		return (height-100)*0.9;
	   
	}

	
	
	public static int div(int xx, int yy) {
		return xx/ yy;
	}
	
	
	public static int multi(int o, int p) {
		return o * p;
	}
	
	
	public static int minus(int x, int y) {
		return x - y;
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	
	public static void showMe(double height, double weight) {
		System.out.println("I am "+height+" and "+weight+" kg");
	}
	
	public static void showAge(int age) {
		System.out.println("I am "+age+" years old");
	}
	

	public static void showName() {
		System.out.println("Hello, my name is Miyeong.");
	}
	
}
