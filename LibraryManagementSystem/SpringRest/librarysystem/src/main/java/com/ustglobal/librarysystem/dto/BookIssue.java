package com.ustglobal.librarysystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="books_issue")
public class BookIssue {
	
	@Id
	@Column
	private int transactionId;
	@Column
	@NotNull
	private int registrationId;
	@JsonFormat(pattern= "yyyy-MM-dd")
	@Column
	@NotNull
	@Past
	private Date issueDate;
	@JsonFormat(pattern= "yyyy-MM-dd")
	@Column
	@NotNull
	@Future
	private Date returnDate;
	@Column
	@NotNull
	private double fine;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	

}
