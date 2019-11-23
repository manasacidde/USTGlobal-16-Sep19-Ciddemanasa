package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.PencilBox;
import com.ustglobal.jpawithhibernateapp.dto.Product;

public class TestOneToMany {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	PencilBox pencilBox = entityManager.find(PencilBox.class, 1);
	
	
	entityManager.close();
	
}
}
