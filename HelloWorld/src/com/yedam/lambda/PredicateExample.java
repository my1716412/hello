package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent {
	String name;
	String sex;
	int score;
	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getScore() {
		return score;
	}
	
	
}
public class PredicateExample {
	static List<HighStudent> list = Arrays.asList(new HighStudent("홍길동","남자",77),
			new HighStudent("김순희","여자",88), new HighStudent("박길동","남자",85),
			new HighStudent("바순희","여자",87));
		
	static double avg(Predicate<HighStudent> pred) {
		boolean bool = false;
		int cnt = 0; int sum = 0;
		for(HighStudent student : list) {
			bool = pred.test(student);
			if(bool) {
				cnt++;
				sum += student.getScore();
			}
		}
		return (double) sum/cnt;
	}
	
	public static void main(String[] args) {
		Predicate<HighStudent> pred = new Predicate<HighStudent>() {
			@Override
			public boolean test(HighStudent t) {
				return true;  //t.getSex().contentEquals("남자");
			}
		};
		double avg = avg(pred);
		System.out.println("평균 : " + avg); //남자평균
		
		avg = avg((t) -> {
			return t.getSex().contentEquals("여자");
		});
		System.out.println("여자평균 : " + avg);
	}
}
