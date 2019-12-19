package com.ustglobal.librarysystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
@Entity
@Table(name="users_info")
public class Users {
	@Id
	@Column
	@NotNull
	private int id;
	@Column
	@NotNull
	@Size(min=5,message="min size is 5")
	private String name;
	@Column
	@Email
	@NotNull
	@Size(min=5,message="min size is 5")
	private String email;
	@Column
	@NotNull
	@Size(min=5,message="min size is 5")
	private String password;
	@Column
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
