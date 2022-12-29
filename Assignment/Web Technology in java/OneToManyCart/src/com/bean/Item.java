package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="item")
public class Item {
private	int id; 
private	String itemId; 
private	Double itemTotal; 
private	int quantity; 
private	Cart cart;
@Id
@GenericGenerator(name="inc", strategy = "increment")
@GeneratedValue(generator="inc")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="ItemId")
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
@Column(name="ItemTotal")
public Double getItemTotal() {
	return itemTotal;
}
public void setItemTotal(Double itemTotal) {
	this.itemTotal = itemTotal;
}
@Column(name="Quantity")
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name="cart")
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
} 


}
