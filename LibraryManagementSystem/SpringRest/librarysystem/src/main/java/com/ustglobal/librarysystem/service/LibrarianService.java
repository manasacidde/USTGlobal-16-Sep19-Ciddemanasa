package com.ustglobal.librarysystem.service;

import java.util.List;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.BookIssue;
import com.ustglobal.librarysystem.dto.BookRegister;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

public interface LibrarianService {
	
	public Users addStudent(Users user) throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	public boolean deleteBook(int bid) throws CustomException;
	public boolean addBooks(Book books) throws CustomException;
	public List<BookRegister> viewRequest() throws CustomException;
	public List<Book> showAllBooks() throws CustomException;
	public Users addLibrarian(Users users)  throws CustomException;
	
	public boolean issuebook(BookIssue bookissue) throws CustomException;
	public List<BookIssue> listofissues() throws CustomException;

}
