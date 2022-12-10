package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name="student_inf")
public class Student {
private	int sid;
private	String sname;
private Address aid;
@Id
@GenericGenerator(name="inc",strategy="increment")
@GeneratedValue(generator = "inc")
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
@Column(name="sname")
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name="aid")
public Address getAid() {
	return aid;
}
public void setAid(Address aid) {
	this.aid = aid;
}



	

}
