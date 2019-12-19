package com.ustglobal.librarysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarysystem.dao.LibrarianDAO;
import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.BookIssue;
import com.ustglobal.librarysystem.dto.BookRegister;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;


@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;
	
	

	@Override
	public boolean deleteBook(int bid) throws CustomException {
		return dao.deleteBook(bid);
	}

	@Override
	public boolean addBooks(Book books) throws CustomException {
		return dao.addBooks(books);
	}

	@Override
	public List<BookRegister> viewRequest() throws CustomException{
		return dao.viewRequest();
	}

	@Override
	public Users addStudent(Users user) throws CustomException {
		
			return dao.addStudent(user);
		
	}

	@Override
	public Users getStudentInfo(int id) throws CustomException {
		return dao.getStudentInfo(id);
	}

	@Override
	public Boolean deleteStudent(int id) throws CustomException {
		return dao.deleteStudent(id);
	}

	@Override
	public List<Book> showAllBooks() throws CustomException {
		return dao.showAllBooks();
	}

	@Override
	public Users addLibrarian(Users users) throws CustomException {
			return dao.addLibrarian(users);
		
	}

	@Override
	public boolean issuebook(BookIssue bookissue) throws CustomException {
		// TODO Auto-generated method stub
		return dao.issuebook(bookissue);
	}

	@Override
	public List<BookIssue> listofissues() throws CustomException {
		// TODO Auto-generated method stub
		return dao.listofissues();
	}

	

}
