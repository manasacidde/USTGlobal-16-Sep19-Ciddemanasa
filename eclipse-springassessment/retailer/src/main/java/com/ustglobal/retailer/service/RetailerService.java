package com.ustglobal.retailer.service;

import com.ustglobal.retailer.dto.Product;
import com.ustglobal.retailer.dto.RetailerBean;

public interface RetailerService {
	public int createProfile(RetailerBean bean);
	public RetailerBean login(int id, String password);
	public Product search(int pid);
	public boolean changePassword(int id, String password);
	

}
