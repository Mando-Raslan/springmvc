package com.mohamed.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String email;
	private String pass;
	private String address;
	private String city;
	private String inputState;
	private String inputZip;
	private List<String> courses;
	private List<String> options;
	
	
	
	public Student() {
		
		options = new ArrayList<String>();
		options.add("Male");
		options.add("Female");
		options.add("Ather");
		
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getInputState() {
		return inputState;
	}



	public void setInputState(String inputState) {
		this.inputState = inputState;
	}



	public String getInputZip() {
		return inputZip;
	}



	public void setInputZip(String inputZip) {
		this.inputZip = inputZip;
	}



	public List<String> getCourses() {
		return courses;
	}



	public void setCourses(List<String> courses) {
		this.courses = courses;
	}



	public List<String> getOptions() {
		return options;
	}



	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	
	
	
}
