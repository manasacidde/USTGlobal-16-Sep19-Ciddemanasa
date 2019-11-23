package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		
		Course c = new Course();
		c.setCid(10);
		c.setCname("java");
		
		Course c1 = new Course();
		c1.setCid(20);
		c1.setCname("sql");
		
		ArrayList<Course> a= new ArrayList<Course>();
		a.add(c);
		a.add(c1);
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("manasa");
		s.setCourse(a);
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s);
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		entityManager.close();
		 
		
		
	}

}
