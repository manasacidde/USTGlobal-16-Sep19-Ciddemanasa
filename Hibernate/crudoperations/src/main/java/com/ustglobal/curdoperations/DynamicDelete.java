package com.ustglobal.curdoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicDelete {
public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "delete from employee_info where name=? ";
			pstmt = conn.prepareStatement(sql);
			
			String name = args[0];
			pstmt.setString(1, name);
			int count = pstmt.executeUpdate();
			
			System.out.println("Row(s) deleted "+count);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(conn!=null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


}
