package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.ustglobal.jpawithhibernateapp1.dto.Employee;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee e = entityManager.find(Employee.class, 1);
		System.out.println("id-- "+e.getId());
		System.out.println("name-- "+e.getName());
		System.out.println("sal-- "+e.getSal());
		entityManager.close();
		
		
	}

}
