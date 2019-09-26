package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = { (int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1) };
		for (int i = 0; i < num.length; i++) {
// System.out.println(num[i]);
		}
		boolean isok = true;
		while (isok) {
			System.out.println("첫번째 숫자를 입력하시오.");
			int num1 = sc.nextInt();
			System.out.println("두번재 숫자를 입력하시오.");
			int num2 = sc.nextInt();
			System.out.println("세번재 숫자를 입력하시오.");
			int num3 = sc.nextInt();

			int strike = 0, ball = 0;

			int[] numb = { num1, num2, num3 };
			for (int i = 0; i < 3; i++) {
				for (int k = 0; k < 3; k++) {
					if (num[i] == numb[k]) {
						if (i == k) {
							strike++;
						} else
							ball++;
					}

				}
			}
			if (strike == 3)
				isok = false;
			else {
				System.out.println("strike는 " + strike + ", ball은 " + ball);
			}

		}
	}

}