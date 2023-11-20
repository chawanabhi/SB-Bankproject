package com.web.model;

public class Banktranf {
	private int accountnumber;
	private String name;
	private String password;
	private int targetaccountnumber;
	private double balance;
	public Banktranf() {
		super();
		}
	public Banktranf(int accountnumber, String name, String password, int targetaccountnumber, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.password = password;
		this.targetaccountnumber = targetaccountnumber;
		this.balance = balance;
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
	public int getTargetaccountnumber() {
		return targetaccountnumber;
	}
	public void setTargetaccountnumber(int targetaccountnumber) {
		this.targetaccountnumber = targetaccountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Banktranf [accountnumber=" + accountnumber + ", name=" + name + ", password=" + password
				+ ", targetaccountnumber=" + targetaccountnumber + ", balance=" + balance + "]";
	}
}
