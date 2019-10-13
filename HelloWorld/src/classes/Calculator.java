package classes;

public class Calculator {
	static double pi = 3.14;
	
	static double minus(double x, double y) {
		return x - y;
	}
	
	static double plus(double x, double y) {
		return x + y;
	}
	
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int a, int b) {
		double sum = plus(a,b);
		double result = sum/2;
		return result;
	}
	void execute(int a, int b) {
		
		double result = avg(a,b);
		printIn("result:" + result);
        
	}
	void printIn(String str) {
		System.out.println(str);
	}

}
