package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class App 
{
    public static void main( String[] args )
    {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        entityManager = entityManagerFactory.createEntityManager();
        Product pr = entityManager.getReference(Product.class, 101);
//        Product pr = entityManager.find(Product.class, 101);
        System.out.println(pr.getClass());
        
    }
}
