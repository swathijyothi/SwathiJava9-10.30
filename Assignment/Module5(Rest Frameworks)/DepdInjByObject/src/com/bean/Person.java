package com.bean;

public class Person {
private	String pname;
private Phone pno;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Phone getPno() {
	return pno;
}
public void setPno(Phone pno) {
	this.pno = pno;
}

public void callphone() {
	System.out.println("calling phone");
	pno.call();
}

}
