package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product pr = entityManager.find(Product.class, 101);
			System.out.println(entityManager.contains(pr));
			entityManager.detach(pr);  
			System.out.println(entityManager.contains(pr));
			
			entityManager.merge(pr);
			Product pr1 = entityManager.find(Product.class, 101);
			pr1.setPname("bus");
			System.out.println("record updated");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}


}
