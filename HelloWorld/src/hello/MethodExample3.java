package hello;

import java.util.Scanner;

public class MethodExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int mon = sc.nextInt();
		showCal(mon);
	}

	public static void showCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonthday(month);
		int sDay = getStartday(month);
		System.out.println("        << " + month + "월달 >>");
		// 요일 타이틀 출력
		for (String str : week) {
			System.out.print(" " + str);
//			for(int i = 0; i < week.length; i++) {
//				System.out.print(" " + week[i]);			
//			}			
		}
		System.out.println();
		// 1일의 위치 지정.
		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0)
				System.out.println();
		}
	}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일.
		} else if (month == 10) {
			startDay = 3; // 화요일.
		} else if (month == 11) {
			startDay = 6; // 금요일.
		} else if (month == 8) {
			startDay = 5;
		}
		return startDay;
	}

	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}

	public static int[] showArray(int... arg) {
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

	public static int[] showArray(int a, int b, int c, int d, int e) {
		int[] ary = { a * 2, b * 2, c * 2, d * 2, e * 2 };
		return ary;
	}

	public static void printStar(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printStar(int a, int b) {
		for (int j = 0; j < b; j++) {
			for (int i = 0; i < a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int sumArray(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}
}
