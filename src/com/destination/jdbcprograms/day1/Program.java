package com.destination.jdbcprograms.day1;
import java.util.*;
import java.sql.*;
public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try {
//step1
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jd";
String user="root";
String pwd="vaishulatchu123";
//step2
Connection con=DriverManager.getConnection(url,user,pwd);
System.out.println("Enter the database name:");
Statement stmt=con.createStatement();
int x=stmt.executeUpdate("create database"+sc.next());
if(x>0) {
	System.out.println("database created");
}else {
	System.out.println("database creation failed");
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
