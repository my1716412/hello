package hello;

public class Bingo {
	public static void main(String[] args) {
		int[][] aAry = new int[5][5];
		int i, j, number = 0;
		for (i = 0; i < aAry.length; i++) {
			for (j = 0; j < aAry[i].length; j++) {
				number++;
				aAry[i][j] = number;
				System.out.print(aAry[i][j] + " ");
			}
			System.out.println();
		}
		for (i = 0; i < aAry.length; i++) {
			for (j = 0; j < aAry[i].length; j++) {
				number++;
				aAry[i][j] = number;
				System.out.print(aAry[i][j] + " ");
			}
		}
	}
}
