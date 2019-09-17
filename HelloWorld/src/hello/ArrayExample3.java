package hello;

public class ArrayExample3 {
public static void main(String[] args) {
	int[][] intAry = new int[2][];
	intAry[0] = new int[3];
	intAry[1] = new int[4];
	int a = 8;
	for(int i = 0; i < intAry.length; i++) {
		for(int j = 0; j < intAry[i].length; j++) {
			intAry[i][j] = a++;
		}
	}
	int sum = 0;
	for(int i = 0; i < intAry.length; i++) {
		for(int j = 0; j < intAry[i].length; j++) {
			sum+=intAry[i][j];
		}
		System.out.println("=>[" +i + "]=> 합:" + sum +);
	}
	
//	for(int i = 0; i < intAry.length; i++) {
//		for(int j = 0; j < intAry[i].length; j++) {
//			System.out.printf("%2d", intAry[i][j]);
//		}
//		System.out.println();
//	}
}
}
