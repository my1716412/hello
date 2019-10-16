package com.dbpackage.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dbpackage.common.DAO;
import com.dbpackage.model.Student;

public class StudentDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public List<Student> getStudentList() {
		conn = DAO.getConnect();
		String sql = "select * from student";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return getStudentList();

	}

	public void insertStudent(Student student) {
		conn = DAO.getConnect();
		String sql = "insert into student values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getStudentNo());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getMajor());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
