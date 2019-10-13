package hello;

public class Hello {
	public static void main(String[] args) {

		int num1 = 10;
		num1++; // num1 = num1 +1;
		int a = 5, b = 7;
		num1 = a++ + ++b; // a++ -> 6, ++b -> 8
		System.out.println(a++ + "," + ++b);
		System.out.println("num1 :" + num1);

		System.out.println(3 == 5); // =
		if (3 < 5)
			System.out.println("ok");
		// else
		// System.out.println("no");

		num1 += 3; // num1 = num1 + 3
		num1 *= 3; // num1 = num1 * 3;

		for (int i = 2; i < 10; i++) {
			System.out.println("<<" + i + "단>>");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}
	}
}
