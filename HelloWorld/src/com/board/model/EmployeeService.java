package com.board.model;

import java.util.List;

public interface EmployeeService {
	// 전체리스트.
	public List<Employee> getEmpList();
	// 한건조회.
	public Employee getEmployee(int empNo);
	// 한건입력.
	public void insertEmployee(Employee emp);
	// 변경처리.
	public void updateEmployee(Employee emp);
	// 삭제처리.
	public void deleteEmployee(int empNo);
}