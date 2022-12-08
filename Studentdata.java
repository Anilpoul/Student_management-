package com.student.manage;

public class Studentdata {
    private int studentId;
	private String studentName;
	private String studentMobile;
	private String studentCity;
	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentMobile() {
		return studentMobile;
	}


	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}


	public String getStudentCity() {
		return studentCity;
	}


	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


	public Studentdata(int studentId, String studentName, String studentMobile, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentCity = studentCity;
	}
	
	
	public Studentdata(String studentName, String studentMobile, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentCity = studentCity;
	}
	
	
	public Studentdata() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Studentdata [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile="
				+ studentMobile + ", studentCity=" + studentCity + "]";
	}
	
}
