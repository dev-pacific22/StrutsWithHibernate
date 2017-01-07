package com.deep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tblEmployee")

public class Employee {
private int id;
private String firstName,lastName, password, department, contact, email;

@Column(name="password")
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name="department")
public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}
@Id
@GeneratedValue
@Column(name="empId")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@Column(name="firstName")
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Column(name="lastName")
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Column(name="contact")
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Column(name="email")
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}

