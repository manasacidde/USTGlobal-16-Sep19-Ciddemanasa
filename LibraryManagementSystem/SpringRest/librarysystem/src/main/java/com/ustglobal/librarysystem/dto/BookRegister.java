package com.ustglobal.librarysystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="book_reg")
public class BookRegister {

	@Id
	@Column
	@GeneratedValue
	private int registrationId;
	
	@Column
	@NotNull
	private int bid;
	
	@Column
	@NotNull
	private int id;
	
	@JsonFormat(pattern= "yyyy-MM-dd")
	@Column
	@NotNull
	private Date registrationDate;
	
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate){
		this.registrationDate = registrationDate;
	}
	
	
}
