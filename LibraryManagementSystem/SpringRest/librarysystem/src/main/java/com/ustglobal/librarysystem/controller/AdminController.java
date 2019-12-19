package com.ustglobal.librarysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarysystem.dto.Users;
import com.ustglobal.librarysystem.exception.CustomException;
import com.ustglobal.librarysystem.service.AdminService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class AdminController {
	@Autowired
	private AdminService service;

	
	@DeleteMapping("/library/admin/deleteLibrarian/{id}")
	public Boolean deleteLibrarian(@PathVariable ("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteLibrarian(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteLibrarian()
	
	
	
	
	@GetMapping("/library/admin/displayLibrarian")
	public List<Users> displayLibrarian(){
		List<Users> usersList = null;
		try {
			usersList = service.displayLibrarian();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return usersList;
	}// end of displayeLibrarian()
	

}
