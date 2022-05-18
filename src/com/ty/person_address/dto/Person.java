package com.ty.person_address.dto;

public class Person {
	
	private int pid;
	private String name;
	private String email;
	private String phone;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		System.out.println("ID: "+pid);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone number: "+phone);
		return "";
	}
	
	
}
