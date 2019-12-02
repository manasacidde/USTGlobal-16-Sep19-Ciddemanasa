package com.ustglobal.retailer.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private int amountPayable;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id" ,nullable=false)
	private RetailerBean retailerBean;
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}
	

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmountPayable() {
		return amountPayable;
	}

	public void setAmountPayable(int amountPayable) {
		this.amountPayable = amountPayable;
	}
	

}
