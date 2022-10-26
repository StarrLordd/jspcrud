package com.javatpoint.bean;

public class User {
private int id;
private String name,password,email,sex,country;
public int getId() {
	return id;
	//Get ID
}
public void setId(int id) {
	this.id = id;
	//Set ID
}
public String getName() {
	return name;
	//Get Name
}
public void setName(String name) {
	this.name = name;
	//Set Name
}
public String getPassword() {
	return password;
	//Get Password
}
public void setPassword(String password) {
	this.password = password;
	//Set Passsword
}
public String getEmail() {
	return email;
	//Get Email
}
public void setEmail(String email) {
	this.email = email;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
