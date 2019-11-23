package com.ustglobal.curdoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Select {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step1:load driver
//			Driver driver = new Driver();   
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//step2:get connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root&ssl=false";
			conn = DriverManager.getConnection(url);
			
			
			//step3:Issue sql query
			String sql = "select * from Employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			//step4:read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("ID: "+id);
				System.out.println("NAME: "+name);
				System.out.println("SAL: "+sal);
				System.out.println("GENDER: "+gender);
				System.out.println("************************");
			}
		}
					
		
			catch(Exception e) {
				e.printStackTrace();
			
			}finally {
				//step5:close all jdbc objects
				try {
					if(conn!=null) {
						conn.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
		     }
		
		
	}//end of main()
	

}
