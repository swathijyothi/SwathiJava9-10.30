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

@Entity
@Table(name="address_inf")
public class Address {
private	int aid;
private	String street,city,state;
private	long zipcode;
private Student sid;
@Id
@GenericGenerator(name="inc",strategy="increment")
@GeneratedValue(generator = "inc")
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
@Column(name="street")
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
@Column(name="city")
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Column(name="state")
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Column(name="zcode")
public long getZipcode() {
	return zipcode;
}
public void setZipcode(long zipcode) {
	this.zipcode = zipcode;
}
@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "aid")

public Student getSid() {
	return sid;
}
public void setSid(Student sid) {
	this.sid = sid;
}


}
