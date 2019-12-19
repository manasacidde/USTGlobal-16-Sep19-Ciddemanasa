package com.ustglobal.librarysystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.LibResponse;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;
import com.ustglobal.librarysystem.service.StudentService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping(path="/library/login/{id}/{password}",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Users login(@PathVariable("id")int id,@PathVariable("password")String password) {
		Users user = null;
		try {
			user = service.login(id, password);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}// end of login()
	

	@PostMapping("/library/librarian/getBooks/{bname}")
	public  List<Book> searchBook(@PathVariable("bname") String bname) {
		List<Book> bookList = null;
		try {
			bookList = service.searchBook(bname);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of search
	

	@GetMapping("/library/student/book/request/{bid}")
	public boolean requestBook(@PathVariable("bid") int bid) {

		boolean isRequest = false;
		try {
			service.reqBook(bid);
			isRequest = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isRequest;

	}
}
