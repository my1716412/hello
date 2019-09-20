package classes;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "hong";
		st1.major = "history";
		st1.studentNo = 1111;
		System.out.println(st1.name + "," + st1.major + "," + st1.studentNo);

		Student st2 = new Student("Kim", "math");
		st2.studentNo = 2222;
		System.out.println(st2.name + "," + st2.major + "," + st2.studentNo);
	
	}

}
