package hello;

public class WhileExample {
	public static void main(String[] args) {
		// 4단 출력
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			if(i++ <= 5)
				continue;
			System.out.println(3+ "*" + i + "=" +3 * i );
			if(i == 9)
				break;
			//i++;
		}
		i = 1;
		do {
			System.out.println(3+ "*" + i + "=" +3 * i );
			i++;
		} while (i < 10);
	}

}
