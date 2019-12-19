package com.ustglobal.librarysystem.dto;

import java.util.List;

public class LibResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<Book> books;
	private List<Users> users;
	private List<BookRegister> bookreg;
	
	public List<BookRegister> getBookreg() {
		return bookreg;
	}
	public void setBookreg(List<BookRegister> bookreg) {
		this.bookreg = bookreg;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
