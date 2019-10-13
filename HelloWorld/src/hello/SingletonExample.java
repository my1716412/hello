package hello;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1==s2)
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체");
	}

}
