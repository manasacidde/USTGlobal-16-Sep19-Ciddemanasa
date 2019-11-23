package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
public static void main(String[] args) {
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "delete from Product where id=:pid";
			Query query = entityManager.createQuery(jpql);
		
			query.setParameter("pid", 102);
			int count = query.executeUpdate();
			System.out.println("deleted rows"+count);
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
		entityManager.close();
		}
		
}
		

}
