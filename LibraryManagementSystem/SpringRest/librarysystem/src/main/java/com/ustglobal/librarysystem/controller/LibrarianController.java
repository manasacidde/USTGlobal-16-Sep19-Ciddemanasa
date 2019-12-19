package com.ustglobal.librarysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.BookIssue;
import com.ustglobal.librarysystem.dto.BookRegister;
import com.ustglobal.librarysystem.dto.LibResponse;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;
import com.ustglobal.librarysystem.service.LibrarianService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class LibrarianController {

	@Autowired
	private LibrarianService service;

	@PostMapping("/library/admin/create")
	public Users addLibrarian(@RequestBody Users users) {
		System.out.println(users);
		try {
			users = service.addLibrarian(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of addLibrarian()
	
	
	@PostMapping("/library/librarian/user")
	public Users addStudent(@RequestBody Users users) {
		Users user = null;
		try {
			user = service.addStudent(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return user;

	}// end of addStudent()

	@PostMapping("/library/librarian/create")
	public boolean addBooks(@RequestBody Book books) {

		boolean isAdded = false;
		try {
			service.addBooks(books);
			isAdded = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isAdded;
	}// end of addBooks()

	@DeleteMapping("/library/librarian/{bid}")
	public boolean deleteBook(@PathVariable("bid") int bid) {
		boolean isDeleted = false;
		try {
			service.deleteBook(bid);
			isDeleted = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;


	}// end of deleteBook()

	@GetMapping("/library/librarian/getBooks")
	public List<Book> showAllBook() {
		List<Book> bookList = null;
		try {
			bookList = service.showAllBooks();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;

	}// end of showAllBooks()

	@GetMapping("/library/librarian/getStudent/{id}")
	public Users getStudentInfo(@PathVariable("id")int id) {
		Users users  = null;
		try {
			users = service.getStudentInfo(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;

	}// end of getStudentInfo()

	@DeleteMapping("/library/librarian/deleteStudent/{id}")
	public boolean deleteStudent(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteStudent(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;

	}// end of deleteStudent()

	@GetMapping("/library/librarian/viewRequest")
	public List<BookRegister> viewRequests() {
		List<BookRegister> booksRegs = null;
		try {
			booksRegs = service.viewRequest();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return booksRegs;


	}// end of viewRequest()
	
	@PostMapping("/library/librarian/bookissue")
	public  boolean issuebook(@RequestBody BookIssue bookissue) {
		boolean books = false;
		try {
			service.issuebook(bookissue);
			books =true;
		} catch (CustomException e) {
			
			System.err.println(e.getMessage());
		}
		return books;
		
	}
	
	@GetMapping("/library/librarian/listissues")
	public List<BookIssue> listofissues() {
		List<BookIssue> book = null;
		try {
			book = service.listofissues();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return book;

	}// end of listofissues()


}
