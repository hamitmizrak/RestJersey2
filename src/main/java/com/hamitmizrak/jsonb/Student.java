package com.hamitmizrak.jsonb;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = -2325793728647962955L;
	private long studentId;
	private String studentName;
	private String studentSurname;
	private String studentBirtday;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long studentId, String studentName, String studentSurname, String studentBirtday) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentBirtday = studentBirtday;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname=" + studentSurname
				+ ", studentBirtday=" + studentBirtday + "]";
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

	public String getStudentBirtday() {
		return studentBirtday;
	}

	public void setStudentBirtday(String studentBirtday) {
		this.studentBirtday = studentBirtday;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
