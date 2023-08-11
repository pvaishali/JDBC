package com.destination.jdbcprograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		//step1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		String url="jdbc:mysql://localhost:3306/test2";
		String user="root";
		String pwd="vaishulatchu123";
		//step2
		Connection con=DriverManager.getConnection(url,user,pwd);
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("create table student(id int,name varchar(60)");
		if(x>0) {
			System.out.println("tablecreated");
		}else {
			System.out.println("table creation failed");
		}
		stmt.close();
		con.close();
			}
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
	}

}
