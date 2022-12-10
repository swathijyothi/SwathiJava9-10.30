package com.bean;

import java.util.Collection;

public class Subscription {
private int subscriptionId; 
private	String subscriptionName;
private Collection<Reader> readers;
public int getSubscriptionId() {
	return subscriptionId;
}
public void setSubscriptionId(int subscriptionId) {
	this.subscriptionId = subscriptionId;
}
public String getSubscriptionName() {
	return subscriptionName;
}
public void setSubscriptionName(String subscriptionName) {
	this.subscriptionName = subscriptionName;
}
public Collection<Reader> getReaders() {
	return readers;
}
public void setReaders(Collection<Reader> readers) {
	this.readers = readers;
}


}
