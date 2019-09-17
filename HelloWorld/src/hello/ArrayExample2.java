package hello;

public class ArrayExample2 {
public static void main(String[] args) {
	int[][] intAry = {{2,3,4},{5,6,7}};
	//  2 3 4
	//  5 6 7 2행 3열
	for(int i = 0; i < intAry.length; i++) {
		for(int j = 0; j < intAry[i].length; j++) {
			System.out.println("[" + i + "," + j + "=>" + intAry[i][j] +"]");
		}
		System.out.println();
	}
}
}
