package com.ustglobal.librarysystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@Column
	private int bid;
	
	@Column
	@NotNull
	@Size(min=5,message="min size is 5")
	private String bname;
	
	@Column
	@NotNull
	@Size(min=5,message="min size is 5")
	private String author;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", getBid()=" + getBid()
				+ ", getBname()=" + getBname() + ", getAuthor()=" + getAuthor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
