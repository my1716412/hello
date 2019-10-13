package hello;

public class MethodExample03 {
	public static void main(String[] args) {
//		printStar(5);
		int[] ary = showArray(1,2,3,4,5);
		for (int i = 0; i < ary.length; i++) {
//	같은		for(int a:ary) { 
//				System.out.println(a);
			System.out.println(ary[i]);
		}
         // ==>>enhanced for
		for(int a:ary) {
			System.out.println(a);
		}
	}
	
	
	
	
	
	
	public static int[] showArray(int...arg) {
		int [] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] =arg[i];
		}
		return aAry;
	}
	
	
	
	
		{int[] intAry = {1,2,3,4,5};
		int sum = 0;
		for(int i =0; i<intAry.length; i++) {
			sum = sum + intAry[i]; // sum += intAry[i];
		}
		System.out.println("합은:" + sum);

	
		int[] intAry2 = {1,2,3,4,5,6};
		sum = sumArray(intAry2);
		System.out.println("합은:" + sum);
		
		int[] intAry3 = {1,2,3};
		sum = sumArray(intAry3);
		System.out.println("합은:" + sum);		
	}	
	public static int sumArray(int[] ary) {
	int sum = 0;
		for (int i =0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}

	public static void printStar(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
			
			 
				System.out.print("*");

			}
			System.out.println();   		
		} 
	}
	
	
	
}
