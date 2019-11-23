package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ustglobal.jpawithhibernateapp1.dto.Employee;

public class InsertDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("deepika");
		emp.setSal(20000);
	
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(emp);
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		 
		
		
		

	}

}
