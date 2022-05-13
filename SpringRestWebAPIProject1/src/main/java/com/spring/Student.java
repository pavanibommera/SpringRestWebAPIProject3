package com.spring;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Student {
	
	@Id
	private int id;
	private String sname;
	private String scourse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	
	
	
	
	
	

}
