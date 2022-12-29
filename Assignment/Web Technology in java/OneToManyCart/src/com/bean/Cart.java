package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="cart")
public class Cart
{
private	int cartId;
private	double total; 
private	String name;
private	Collection<Item> items;

@Id
@GenericGenerator(name="inc", strategy = "increment")
@GeneratedValue(generator="inc")
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
@Column(name="total")
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cart")
public Collection<Item> getItems() {
	return items;
}
public void setItems(Collection<Item> items) {
	this.items = items;
} 

	

}
