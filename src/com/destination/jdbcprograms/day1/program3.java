package com.destination.jdbcprograms.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class program3 {

	public static void main(String[] args) throws Exception {
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
			String query="select * from student";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
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
