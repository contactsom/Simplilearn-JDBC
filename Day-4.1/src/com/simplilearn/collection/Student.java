package com.simplilearn.collection;

import java.util.*;

import javax.persistence.*;


import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="students")

public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

@Column(name="sid")	
	private int sid;//PK

@Column(name="sname")
	private String sname;

@Column(name="dob")
	private String dob;

@Column(name="quali")
	private String qualification;

@CollectionOfElements
@JoinTable(name="courses",joinColumns=@JoinColumn(name="sid"))
@IndexColumn(name="idx")
@Column(name="cname")
private String[] courses ;//since one person may join more than one  cources

@CollectionOfElements
@JoinTable(name="emails",joinColumns=@JoinColumn(name="sid"))
@IndexColumn(name="idx")
@Column(name="emailId")
private List<String> emails;//since one person may have more than one emails

@CollectionOfElements
@JoinTable(name="marks",joinColumns=@JoinColumn(name="sid"))
@Column(name="marks")
private List<Integer> marks;//since one person may have different or same marks in different subject


@CollectionOfElements
@JoinTable(name="phones",joinColumns=@JoinColumn(name="sid"))
@IndexColumn(name="idx")
@Column(name="phones")
private Set<Long> phones;//It is recommendable a person have many distinguishable phone number

@CollectionOfElements
@JoinTable(name="refs",joinColumns=@JoinColumn(name="sid"))
@IndexColumn(name="rname")
@Column(name="rphone")
private Map<String,Long> refs;

	
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
