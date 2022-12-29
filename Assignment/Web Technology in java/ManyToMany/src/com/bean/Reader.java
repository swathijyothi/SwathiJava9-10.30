package com.bean;

import java.util.Collection;

public class Reader {
private	int readerId; 
private	String email, fName, lName; 
private	Collection<Subscription> subscriptions;
public int getReaderId() {
	return readerId;
}
public void setReaderId(int readerId) {
	this.readerId = readerId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public Collection<Subscription> getSubscriptions() {
	return subscriptions;
}
public void setSubscriptions(Collection<Subscription> subscriptions) {
	this.subscriptions = subscriptions;
}

	
	

}
