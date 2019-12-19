package com.ustglobal.librarysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarysystem.dao.AdminDAO;
import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	
	
	@Override
	public Boolean deleteLibrarian(int id) throws CustomException {
		// TODO Auto-generated method stub
		return dao.deleteLibrarian(id);
	}

	@Override
	public List<Users> displayLibrarian() throws CustomException {
		// TODO Auto-generated method stub
		return dao.displayLibrarian();
	}

}
