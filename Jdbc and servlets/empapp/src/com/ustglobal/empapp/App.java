package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert  employee data");
		System.out.println("Press 3 to update  employee data");
		System.out.println("Press 4 to delete  employee data");
		System.out.println("Press 5 to search single  employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch(ch) {
		case 1: 
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			for(EmployeeBean bean : result) {
				System.out.println("id: "+bean.getId());
				System.out.println("name: "+bean.getName());
				System.out.println("gender: "+bean.getGender());
				System.out.println("sal: "+bean.getSal());
			}
			
			break;
			
		case 2: 
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			int id2 = scn.nextInt();
			String name2 =scn.nextLine();
			int sal2 = scn.nextInt();
			String gender2 = scn.nextLine();
			EmployeeBean bean2 = new EmployeeBean();
			bean2.setId(id2);
			bean2.setName(name2);
			bean2.setSal(sal2);
			bean2.setGender(gender2);
			int count2= dao2.updateEmployeeData(bean2);
			System.out.println("rows deleted "+count2);
			
			
			break;
		case 3: EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			String name =scn.nextLine();
			int sal = scn.nextInt();
			String gender = scn.nextLine();
			EmployeeBean bean1 = new EmployeeBean();
			bean1.setId(id);
			bean1.setName(name);
			bean1.setSal(sal);
			bean1.setGender(gender);
			int count1= dao3.updateEmployeeData(bean1);
			System.out.println("rows deleted "+count1);
			
			break;
		case 4: EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			int id4 = scn.nextInt();
		   int count= dao4.deleteEmployeeData(id4);
		   System.out.println("rows deleted "+count);
		   break;
			
			
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id5 = scn.nextInt();
			EmployeeBean bean = dao5.SearchEmployeeData(id5);
			if(bean!=null) {
				System.out.println("id: "+bean.getId());
				System.out.println("name: "+bean.getName());
				System.out.println("gender: "+bean.getGender());
				System.out.println("sal: "+bean.getSal());
			}else {
				System.out.println("no data found");
			}
			break;
		}//end of switch
	}//end of main
}//end of class
