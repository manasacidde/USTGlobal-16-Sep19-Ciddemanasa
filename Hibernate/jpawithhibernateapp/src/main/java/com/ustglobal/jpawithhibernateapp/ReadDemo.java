package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product pr = entityManager.find(Product.class, 101);
		System.out.println("id-- "+pr.getId());
		System.out.println("name-- "+pr.getPname());
		System.out.println("quantity-- "+pr.getQuantity());
		entityManager.close();
		
		
	}

}
