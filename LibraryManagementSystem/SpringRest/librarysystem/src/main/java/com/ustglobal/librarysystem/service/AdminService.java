package com.ustglobal.librarysystem.service;

import java.util.List;

import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

public interface AdminService {
	
	
	public Boolean deleteLibrarian(int id) throws CustomException;
	public List<Users> displayLibrarian() throws CustomException;

}
