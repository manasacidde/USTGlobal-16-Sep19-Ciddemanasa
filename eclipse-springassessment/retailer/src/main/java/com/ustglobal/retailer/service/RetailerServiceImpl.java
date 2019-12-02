package com.ustglobal.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailer.dao.RetailerDAO;
import com.ustglobal.retailer.dto.Product;
import com.ustglobal.retailer.dto.RetailerBean;
@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerDAO dao;
	@Override
	public int createProfile(RetailerBean bean) {
		
		return dao.createProfile(bean);
	}

	@Override
	public RetailerBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	

	@Override
	public Product search(int pid) {
		
		return dao.search(pid);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

}
