package com.ustglobal.librarysystem.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.BookIssue;
import com.ustglobal.librarysystem.dto.BookRegister;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

@Repository
public class LibrarianDaoImpl implements LibrarianDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Users addStudent(Users user) throws CustomException {

		user.setType("student");
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();	
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to add the Student Info");
		}
		return user;
	}

	@Override
	public Users getStudentInfo(int id) throws CustomException {
		Users users = null;

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();	
			transaction.begin();
			users = manager.find(Users.class, id);
			transaction.commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the Student Info");
		}
		return users;
	}// end of getStudentInfo()



	@Override
	public Boolean deleteStudent(int id) throws CustomException {

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			transaction.commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to delete the Student");
		}
		return true;
	}



	@Override
	public boolean deleteBook(int bid) throws CustomException {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Book book =manager.find(Book.class,bid);
			manager.remove(book);
			transaction.commit();
			manager.close();
		}catch (Exception e) {
			throw new CustomException("Failed to delete the book");
		}
		return true;

	}

	@Override
	public boolean addBooks(Book books) throws CustomException {
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(books);
			transaction.commit();
			manager.close();
		}catch(Exception e){
			throw new CustomException("Failed to add the book");
		}
		return true;
	}

	@Override
	public List<Book> showAllBooks() throws CustomException{
		List<Book> books = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<Book> typedQuery = manager.createQuery("from Book",Book.class );
			books = typedQuery.getResultList();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the books");

		}
		return books;
	}

	@Override
	public List<BookRegister> viewRequest() throws CustomException {
		List<BookRegister> booksReg = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BookRegister> typedQuery = manager.createQuery("from BookRegister", BookRegister.class);
			booksReg = typedQuery.getResultList();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to Fetch the Requests");

		}
		return booksReg;
	}

	@Override
	public Users addLibrarian(Users users) throws CustomException {

		users.setType("librarian");

		try {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(users);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to add Librarian");
		}
		return users;
	}

	@Override
	public boolean issuebook(BookIssue bookissue) throws CustomException {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bookissue);
			bookissue.setIssueDate(new Date());
			transaction.commit();
			manager.close();
		}catch (Exception e) {
			throw new CustomException("Failed to issue the book");
		}
		return true;
	}

	@Override
	public List<BookIssue> listofissues() throws CustomException {
		List<BookIssue> book = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BookIssue> query = manager.createQuery("from BookIssue", BookIssue.class);
			book = query.getResultList();
			manager.close();
			
		}catch (Exception e) {
			throw new CustomException("Failed to fetch the issued book");
		}
		return book;
	}

	
}
