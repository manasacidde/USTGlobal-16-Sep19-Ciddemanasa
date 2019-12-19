package com.ustglobal.librarysystem.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.BookRegister;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;


@Repository
public class StudentDaoImpl implements StudentDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	static int sid;
	
	@Override
	public Boolean reqBook(int bid)  throws CustomException{
		
		BookRegister booksReg = new BookRegister();
		booksReg.setId(StudentDaoImpl.sid);
		booksReg.setBid(bid);
		booksReg.setRegistrationDate(new Date());
	
		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksReg);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to Request the Book");
		}
		return true;
	}

	@Override
	public List<Book> searchBook(String bname) throws CustomException {
		List<Book> book = null;
		try {
		String jpql = "from Book where bname=:name";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql, Book.class);
		query.setParameter("name", bname);
		 book = query.getResultList();
		
	}catch(Exception e) {
		throw new CustomException("Failed to search the Book");
	}
		return book;
	
}

	@Override
	public Users login(int id, String password) throws CustomException {
		this.sid=id;
		Users user = null;
		try {
		String jpql = "from Users where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Users> query = manager.createQuery(jpql, Users.class);
		query.setParameter("id",id);
		query.setParameter("pass", password);
		user = query.getSingleResult();
		}catch(Exception e) {
			throw new CustomException("Failed to log in ");
		}
		return user;
	}
}