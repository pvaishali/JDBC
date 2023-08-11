package com.destination.jdbcprograms.employeeeApp;
import java.sql.*;
public class DBConnection {
	static Connection con;
    public static Connection createDBConnetion(){

        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username="root";
            String password="vaishulatchu123";
           con= DriverManager.getConnection(url,username,password);

        }catch (Exception ex){
            ex.printStackTrace();
        }
     return con;

    }
}
