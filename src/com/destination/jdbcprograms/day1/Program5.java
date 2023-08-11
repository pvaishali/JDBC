package com.destination.jdbcprograms.day1;
import java.util.*;
import java.sql.*;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connection
				String url = "jdbc:mysql://localhost:3306/test1";
				String user = "root";
				String pwd = "vaishulatchu123";
				Connection con = DriverManager.getConnection(url, user, pwd);
				String sql = "insert into student value(?,?)";
				System.out.println("How many data rows are to be added? :");
				int d = sc.nextInt(); 
				//System.out.println(d);
				PreparedStatement pst = con.prepareStatement(sql);
				for(int i=1; i<=d; i++) {
				System.out.println("Enter the id: ");
				pst.setInt(1, sc.nextInt());
				System.out.println("Enter the name: ");
				pst.setString(2, sc.next());
				
				int x = pst.executeUpdate();
				if(x>0) {
					System.out.println("Data Added");
				}
				else {
					System.out.println("Data Addition failed");
				}
				}
				pst.close();
				con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
