package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
	   String empid = req.getParameter("id");
	   
	   
	   
	   
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
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			
			
			//4
			if(rs.next()) {
				int id1 = rs.getInt("id");
				String ename = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				out.println("<html>");
				out.println("<table>");
				out.println("<tr>");
				out.println(id1);
				out.println("</tr>");
				
				out.println("<tr>");
				out.print(ename);
				out.println("</tr>");
				out.println("<tr>");
				out.print(sal);
				out.println("</tr>");
				out.println("<tr>");
				out.print(gender);
				out.println("</tr>");
				
			out.println("</html>");
			out.println("</table>");
				
				
//				out.print(id1);
//				out.print(ename);
//				out.print(sal);
//				out.print(gender);
				
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
		
		
		
	   
	   
	}//end of doget
}//end of class
