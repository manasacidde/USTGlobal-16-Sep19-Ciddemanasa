package com.jspiders.jdbc.pkg1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Myfirstjdbcprogram {

	public static void main(String[] args)
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
	try 
	{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		String dburl="jdbc:mysql://localhost:3306/bejm32?user=root&password=root";
		con=DriverManager.getConnection(dburl);
		String query="select * from studentsinfo";
		stmt=con.createStatement();
	    rs=stmt.executeQuery(query);
	    while(rs.next())
	    {
	    	int regNum=rs.getInt("regno");
	    	String fName=rs.getString("firstname");
	    	String mName=rs.getString("middlename");
	    	String lName=rs.getString("lastname");
	    	System.out.println("regno="+regNum);
	    	System.out.println("firstname="+fName);
	    	System.out.println("middlename="+mName);
	    	System.out.println("lastname="+lName);
	  	    	
	    }
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
		if(con!=null)
		{
			con.close();
		}
		if(stmt!=null)
		{
			stmt.close();
		}
		if(rs!=null)
		{
			rs.close();
		}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	}
   }
