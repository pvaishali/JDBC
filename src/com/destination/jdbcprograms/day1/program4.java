package com.destination.jdbcprograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			String url="jdbc:mysql://localhost:3306/test1";
			String user="root";
			String pwd="vaishulatchu123";
			//step2
			Connection con=DriverManager.getConnection(url,user,pwd);
			System.out.println("connection established");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id:");
			String query="select * from student where id= ? ";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, sc.nextInt());
			ResultSet rs=pst.executeQuery();
			while(rs.next()!=false)
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println("--------------------------");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
