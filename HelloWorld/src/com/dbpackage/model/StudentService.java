package com.dbpackage.model;

import java.util.List;

public interface StudentService {

	public void insertStudent(Student student);

	public List<Student> getStudentList();

	public Student getStudent(int studentNo);

}
