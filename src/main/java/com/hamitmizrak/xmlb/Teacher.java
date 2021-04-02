package com.hamitmizrak.xmlb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teacher implements Serializable {
	private static final long serialVersionUID = 2238780518758946646L;
	private long teacherId;
	private String teacherName;
	private String teacherSurname;
	private String teacherBirtday;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(long teacherId, String teacherName, String teacherSurname, String teacherBirtday) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.teacherBirtday = teacherBirtday;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSurname=" + teacherSurname
				+ ", teacherBirtday=" + teacherBirtday + "]";
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public String getTeacherBirtday() {
		return teacherBirtday;
	}

	public void setTeacherBirtday(String teacherBirtday) {
		this.teacherBirtday = teacherBirtday;
	}

}
