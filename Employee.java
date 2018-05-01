package com.auribises;

public class Employee {

	
	//Atrributes
	
int id;
String name;
int age;
String email;
String address;

public Employee(){
	
}

public Employee(int id, String name, int age, String email, String address) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
	this.address = address;
}

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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String toString() {
	
	return "Employee[id=" + id + ", name=" + name + " , age=" + age + " , email=" + email + " , address= " + address + "]";
}

}
