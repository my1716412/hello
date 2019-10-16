package hello;

public class yy {
	public static void main(String[] args) {
		int max = 0;
		for(int i = 0; i< 200; i++) {
			if(i % 3 ==0 && i % 7 == 0) {
				max = i;
			}
		}
		System.out.println("큰수는 : " + max + "입니다.");
	}
}
