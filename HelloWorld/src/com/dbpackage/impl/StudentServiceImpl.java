package com.dbpackage.impl;

import java.util.List;

import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;

public class StudentServiceImpl implements StudentService { // StudentService의 메소드 구현

	StudentDAO dao = new StudentDAO();

	@Override

	public void insertStudent(Student student) {
		dao.insertStudent(student);
		

	}

	@Override
	public List<Student> getStudentList() {
		return dao.getStudentList();
	}

	@Override
	public Student getStudent(int studentNo) {
		return null;
	}

}
