package hello;

import java.util.Scanner;

public class GetMaxValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] aAry = new int[5];
	for(int i=0; i <aAry.length; i++) {
		System.out.println("정수값을 입력.");
		aAry[1] = sc.nextInt();
	 }
	int maxValue = 0;
	for (int i = 0; i < aAry.length; i++) {
	if (maxValue < aAry[i])
		maxValue = aAry[i];
		//	maxValue = (maxValue > aAry[i] ? maxValue : aAry[i]);
	}
	System.out.println("제일 큰 값은:" + maxValue );
}
}
