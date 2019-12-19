package com.ustglobal.librarysystem.dao;

import java.util.List;

import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

public interface StudentDAO {
	
	public Boolean reqBook(int bid) throws CustomException;
	public List<Book> searchBook(String bname) throws CustomException;
	public Users login(int id,String password) throws CustomException;
	
	
	
}
