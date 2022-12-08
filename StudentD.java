package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class StudentD {
    public static  boolean  insertToDB(Studentdata sd)
	{
		boolean f= false;
	try {
		Connection con = Cp.createC();
		String q = "insert  into students(sname, smobile, scity) values(?, ?, ?)";
		PreparedStatement pstmt =con.prepareStatement(q);
		pstmt.setString(1, sd.getStudentName());
		pstmt.setString(2, sd.getStudentMobile());
		pstmt.setString(3, sd.getStudentCity());
		
		pstmt.executeUpdate();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f= false;
	try {
		Connection con = Cp.createC();
		String q = "delete from students where sid = ?";
		PreparedStatement pstmt =con.prepareStatement(q);
		pstmt.setInt(1, userId);
		
		
		pstmt.executeUpdate();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	}

    public static void ShowStudents() {
		
	try {
		Connection con = Cp.createC();
		String q = "select * from students";
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);
		while(set.next())
		{
			int id = set.getInt(1);
			String name = set.getString(2);
			String mobile = set.getString(3);
			String city = set.getString(4);

			System.out.println("ID : "+id);
			System.out.println("name : "+name);
			System.out.println("mobile : "+mobile);
			System.out.println("-----------------------------------------");

			

		}

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
    }

}
