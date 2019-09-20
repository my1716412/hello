package classes;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("금액은 ?");
	int money = sc.nextInt();
	exchange (money);
	sc.close();
	}
public static void exchange(int a) {
	int money = 0;
	int result=0, remain=0;
	int[] perMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	for(int i=0; i<8; i++) {
		result = money / perMoney[i];
		remain = money % perMoney[i];
		System.out.println(perMoney[i]+ "원짜리:" + result);
		money = remain;
	}
}
}

