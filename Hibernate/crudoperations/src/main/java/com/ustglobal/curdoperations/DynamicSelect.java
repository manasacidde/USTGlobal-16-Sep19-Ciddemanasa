package com.ustglobal.curdoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelect {
public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		
		Connection conn  = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//2
			conn = DriverManager.getConnection(url);
			
			//3
			pstmt = conn.prepareStatement(sql);
			String eid = args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			//4
			if(rs.next()) {
				int empid = rs.getInt("id");
				System.out.println(empid);
				String ename = rs.getString("name");
				System.out.println(ename);
				int sal = rs.getInt("sal");
				System.out.println(sal);
				String gender = rs.getString("gender");
				System.out.println(gender);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {if(conn!=null) {
				conn.close();
			}if(pstmt!=null) {
				pstmt.close();
			}if(rs!=null) {
				rs.close();
			}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}


}
