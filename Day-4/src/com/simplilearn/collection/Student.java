package com.simplilearn.collection;

import java.util.*;

public class Student {
	private int sid;
	private String sname;
	private String dob;
	private String qualification;
	
	private String[] courses ;//since one person may join more than one  cources
	private List<String> emails;//since one person may have more than one emails
	private List<Integer> marks;//since one person may have different or same marks in different subject
	private Set<Long> phones;//It is recommended person have many distinguishable phone number
	private Map<String,Long> refs;//. Referance of the Student 
	
	public Student(){}
	
	public Student(String sname, String dob, String qualification,
			String[] courses, List<String> emails, List<Integer> marks,
			Set<Long> phones, Map<String, Long> refs) {
	
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
	}

	
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return sid;
	}

	public void setCid(int cid) {
		this.sid = cid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}
	
	
	
	
	
}
