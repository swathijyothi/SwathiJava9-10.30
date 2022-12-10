package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_info")
public class Student {
private	int sid;
private 	String sname;
private 	Address address;

@Id
@GenericGenerator(name="inc",strategy = "increment")
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
@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "sid")
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
	
	
	

}
