package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Bank;
import com.web.model.Banktranf;
import com.web.repo.Bankrepo;
@Service
public class BankSer implements BankService {
@Autowired
private Bankrepo repo;
	@Override
	public Bank regform(Bank bank) {
		Bank bank1=new Bank();
		bank1.setAccountnumber(bank.getAccountnumber());
		bank1.setName(bank.getName());
	
		if(bank.getPassword().equals(bank.getConformpassword())) {
			bank1.setPassword(bank.getPassword());
		}
		bank1.setConformpassword(bank.getConformpassword());
		bank1.setBalance(bank.getBalance());
		bank1.setAddress(bank.getAddress());
		bank1.setMobileno(bank.getMobileno());
		
		repo.save(bank1);
		return bank1;
	}

	@Override
	public Bank balance(Bank bank) {
		Bank b1 = repo.findById(bank.getAccountnumber()).get();		
		return b1;
	}

	@Override
	public Bank deposite(Bank bank) {
		Bank b1 = repo.findById(bank.getAccountnumber()).get();
		if (bank.getAccountnumber()==b1.getAccountnumber()&&bank.getName().equals(b1.getName())&&bank.getPassword().equals(b1.getPassword())) {
			b1.setBalance(bank.getBalance()+b1.getBalance());	
		repo.save(b1);	
		}
		return b1;
	}

	@Override
	public Bank withdraw(Bank bank) {
		Bank b2 = repo.findById(bank.getAccountnumber()).get();
		if (bank.getAccountnumber()==b2.getAccountnumber()&&bank.getName().equals(b2.getName())&&bank.getPassword().equals(b2.getPassword())) {
			b2.setBalance(b2.getBalance()-bank.getBalance());	
		repo.save(b2);	
		}
		return b2;
	}
	@Override
	public void close(Bank bank) {
		Bank b1 = repo.findById(bank.getAccountnumber()).get();
		if (bank.getAccountnumber()==b1.getAccountnumber()&&bank.getName().equals(b1.getName())&&bank.getPassword().equals(b1.getPassword())) {
			repo.deleteById(bank.getAccountnumber());
		}
	}
	@Override
	public List<Bank>  transfer(Banktranf bank) {
		
		Bank b1=repo.findById(bank.getAccountnumber()).get();
		Bank b2=repo.findById(bank.getTargetaccountnumber()).get();
		if (bank.getAccountnumber()==b1.getAccountnumber()&&bank.getName().equals(b1.getName())&&bank.getPassword().equals(b1.getPassword())) {
			b1.setBalance(b1.getBalance()-bank.getBalance());
			b2.setBalance(b2.getBalance()+bank.getBalance());
			repo.save(b1);
			repo.save(b2);	
			List<Bank> list=List.of();
			return list;
	}
		return null;
}
	@Override
	public Bank customerDup(Bank bank) {
		Bank b=null;
		try {
		b = repo.findById(bank.getAccountnumber()).get();
		return b;
		}
		catch (Exception e) {
				return b;
		}
	}



	
	
	}