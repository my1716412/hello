package com.yedam.collections.set;

public class Member {
	String name;
	int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.age == this.age;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return age;
	};
}
