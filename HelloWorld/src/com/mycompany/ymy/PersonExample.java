package com.mycompany.ymy;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Hong");
		p1.setAge(20);
		p1.setHeight(180.8);
		p1.setWeight(77.2);
		System.out.println("이름은:" +  p1.getName() + "나이는:" + p1.getAge() +"키는:" 
		+ p1.getHeight() + "몸무게는:" + p1.getWeight());
	}

}
