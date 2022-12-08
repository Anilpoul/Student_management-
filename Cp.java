package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class Cp {
    static Connection con;
	public static  Connection createC()
	{
		try {
			//driver loading 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection 
		String user = "root";
		String password = "anil";
		String url = " jdbc:mysql://1.27.0.0.1:3306/student_management";
		
		con = DriverManager.getConnection(url, user, password);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return con ;
	}
}
