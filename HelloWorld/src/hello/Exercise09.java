package hello;

import java.util.Scanner;

public class Exercise09 {
public static void main(String[] args) {
	boolean run = true;
	int studentNum = 0;
	int[] scores = null;
	Scanner scanner =new Scanner(System.in)
			
			while(run); {
				System.out.println("-----------------------------------");
				System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
				System.out.println("------------------------------------");
				System.out.println("선택>");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					//작성위치
				} else if(selectNo == 2) {
				   //작성위치				
				}  else if(selectNo == 3) {
					//작성위치
				} else  if(selectNo == 4) {
					//작성위치
				} else  if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램종료");
}
}