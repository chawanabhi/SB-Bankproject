package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
@Id
private int accountnumber;
private String name;
private String password;
private String conformpassword;
private double balance;
private String address;
private long mobileno;
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public Bank(int accountnumber, String name, String password, String conformpassword, double balance, String address,
		long mobileno) {
	super();
	this.accountnumber = accountnumber;
	this.name = name;
	this.password = password;
	this.conformpassword = conformpassword;
	this.balance = balance;
	this.address = address;
	this.mobileno = mobileno;
}
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConformpassword() {
	return conformpassword;
}
public void setConformpassword(String conformpassword) {
	this.conformpassword = conformpassword;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "Bank [accountnumber=" + accountnumber + ", name=" + name + ", password=" + password + ", conformpassword="
			+ conformpassword + ", balance=" + balance + ", address=" + address + ", mobileno=" + mobileno + "]";
}

}
