package com.hamitmizrak.jackson;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = -6307341185793389360L;

	private long studentId;
	private String studentName;
	private String studentSurname;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, String studentSurname) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ "]";
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

}
