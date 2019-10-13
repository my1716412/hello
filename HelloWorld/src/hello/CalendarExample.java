package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {	
	public static void main(String[] args) 	{
//		Calendar cal = Calendar.getInstance();
//		System.out.println("년:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + cal.get(Calendar.MONTH));
//		System.out.println("요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("=====================");
//		cal.set(2019,0,1);
//		System.out.println("년:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + cal.get(Calendar.MONTH));
//		System.out.println("요일:" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("전체일수:" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year= sc.nextln;
		System.out.println("월을 입력하세요.");
		getCal(year, month);
		}
		public static void getCal(int year, int month) {
			Calendar cal = Calendar.getInstance();
			int translatedMonth = month -1;
			cal.isSet(year, translatedMonth,1);
			String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
			int monthDay = cal.compareTo(getActual)
			int monthDay = getMonthday(month);
			int sDay = getStartday(month);
			System.out.println("        << " + month + "월달 >>");

	
	
	}
	
	
		
		
	}

