package com.destination.jdbcprograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		//step1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		String url="jdbc:mysql://localhost:3306/test1";
		String user="root";
		String pwd="vaishulatchu123";
		//step2
		Connection con=DriverManager.getConnection(url,user,pwd);
		String sql="insert into student value(?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		System.out.println("enter the id:");
		pst.setInt(1,sc.nextInt());
		System.out.println("enter the name:");
		pst.setString(2,sc.next());
		int x=pst.executeUpdate();
		if(x>0) {
			System.out.println("data added");
		}else {
			System.out.println("data addition failed");
		}
		pst.close();
		con.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
