package com.dbpackage.model;

public class Student {

	int studentNo;
	String studentName;
	String major;

	public Student(int studentNo, String studentName, String major) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.major = major;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
