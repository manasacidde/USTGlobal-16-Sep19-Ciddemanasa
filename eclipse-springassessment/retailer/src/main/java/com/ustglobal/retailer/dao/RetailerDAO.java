package com.ustglobal.retailer.dao;

import com.ustglobal.retailer.dto.Product;
import com.ustglobal.retailer.dto.RetailerBean;

public interface RetailerDAO {
	
	public int createProfile(RetailerBean bean);
	public RetailerBean login(int id, String password);
	public Product search(int pid);
	public boolean changePassword(int id, String password);
	

}
