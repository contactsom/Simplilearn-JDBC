package com.simplilearn.mapping;

public class Student {

	private int sid;
	private String sname;
	private String email;
	private String phone;	
	Address address;//Student class, Contain Address information of one student.
	
	
	public Student(){}
	
	public Student(String sname, String email, String phone) {
	
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	

	
	
	

}
