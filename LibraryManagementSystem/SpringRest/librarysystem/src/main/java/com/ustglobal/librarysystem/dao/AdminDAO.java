package com.ustglobal.librarysystem.dao;

import java.util.List;

import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;

public interface AdminDAO {
	
	
	public Boolean deleteLibrarian(int id) throws CustomException;
	public List<Users> displayLibrarian() throws CustomException;

}
