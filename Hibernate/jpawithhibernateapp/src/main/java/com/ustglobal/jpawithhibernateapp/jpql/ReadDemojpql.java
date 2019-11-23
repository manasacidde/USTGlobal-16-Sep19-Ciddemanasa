package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemojpql {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		String jpql = "from Product";
		
		String jpql1 = "select pname from Product";
		Query query = entityManager.createQuery(jpql1);
		List<String> l = query.getResultList();
		for(String s:l) {
			System.out.println(s);
		}
		
//		List<Product> l = query.getResultList();
//		for(Product p:l) {
//			System.out.println(p.getId());
//			System.out.println(p.getPname());
//			System.out.println(p.getQuantity());
//			System.out.println("==============");
//		}
		
		
		

	}

}
