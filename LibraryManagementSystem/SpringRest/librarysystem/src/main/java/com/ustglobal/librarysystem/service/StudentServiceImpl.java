package com.ustglobal.librarysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ustglobal.librarysystem.dao.StudentDAO;
import com.ustglobal.librarysystem.dto.Book;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

@Service
public class StudentServiceImpl implements StudentService{


	@Autowired
	private StudentDAO dao;
	

	@Override
	public Boolean reqBook(int bid) throws CustomException {
		return dao.reqBook(bid);
	}

	@Override
	public List<Book> searchBook(String bname) throws CustomException{
		return dao.searchBook(bname) ;
	}

	@Override
	public Users login(int id, String password) throws CustomException {
		
		return dao.login(id, password);
	}
	

}
