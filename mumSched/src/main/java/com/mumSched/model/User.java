package com.mumSched.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userstable")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="Id")
	private int id;
	
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String password;
	private String userroles;
	
	public User() {}

	public User(String username, String firstname, String lastname, int age, String password, String userroles) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.password = password;
		this.userroles = userroles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getUserroles() {
		return userroles;
	}

	public void setUserroles(String userroles) {
		this.userroles = userroles;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	


}




	
	
	



	
	


