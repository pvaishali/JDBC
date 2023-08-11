package com.destination.jdbcprograms.day1;
import java.sql.*;
public class JDBCConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jdbcCodes";
String user="root";
String pwd="vaishulatchu123";
Connection con=DriverManager.getConnection(url,user,pwd);
if(con!=null)
System.out.println("connection established");
else
{
	System.out.println("connection failed");
}
	}

}
