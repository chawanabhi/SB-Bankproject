package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.web.model.Bank;
import com.web.model.Banktranf;
import com.web.service.BankService;

@Controller
public class Bankcontroller {
@Autowired
private BankService serv;
@RequestMapping("/aboutus")
public String about() {
	return "about";
}
	@RequestMapping("/")
	public String home() {
		return "home";	
	}
	@RequestMapping("/newaccount")
	public String regform(@ModelAttribute Bank bank,ModelMap model) {
		return "newuser";	
	}
	@RequestMapping("/register")
	public String regCustomer(@ModelAttribute Bank banktemp, ModelMap model) {
	    Bank existingCustomer = serv.customerDup(banktemp);
	    
	    if (existingCustomer == null) {
	        // No duplicate customer found, proceed with registration
	        serv.regform(banktemp);
	        return "regsucess";
	    } else {
	        // Duplicate customer found, do not attempt registration again
	        return "regfail";
	    }
	}

	
	@RequestMapping("/balance")
	public String balanceform(@ModelAttribute Bank bank,ModelMap model) {
		return "balance";	
	}
	@RequestMapping("/Showbalance")
	public String balancesucess(@ModelAttribute Bank bank,ModelMap model) {
		Bank b1 = serv.balance(bank);
		model.addAttribute("bank", b1);
		if (b1!=null) {
			return "balcheck";
		}else
		return "regfail";	
	}
	@RequestMapping("/deposite")
	public String deposite(@ModelAttribute Bank bank,ModelMap model) {
		return "depositeamt";
	}
	@RequestMapping("/depositdone")
	public String depositesucess(@ModelAttribute Bank bank,ModelMap model) {
		Bank b1 = serv.deposite(bank);
		model.addAttribute("bank", b1);
		if (b1!=null) {
			return "balcheck";
		}else
		return "regfail";	
	}	
	@RequestMapping("/withdraw")
	public String withdrawform(@ModelAttribute Bank bank,ModelMap model) {
		return "withdraw";
		
	}
	@RequestMapping("/withdrawdone")
	public String withdrawsucess(@ModelAttribute Bank bank,ModelMap model) {
		Bank b1 = serv.withdraw(bank);
		model.addAttribute("bank", b1);
		if (b1!=null) {
			return "balcheck";
		}else
		return "regfail";	
	}
	
	@RequestMapping("/transfer")
	public String transfer(ModelMap model,Banktranf bank) {
		  model.addAttribute("bank", bank);
		return "transfer";
	}
	@RequestMapping("/transferdone")
	public String transfersucess(@ModelAttribute Banktranf bank,ModelMap model) {

		 List<Bank>lists=serv.transfer(bank);
		  
		  model.put("aa",lists.get(0).getBalance()+bank.getBalance());
		  model.put("bb",lists.get(0).getBalance());
		  
		  model.put("dd",lists.get(1).getBalance());
		  model.put("cc",lists.get(1).getBalance()-bank.getBalance());
			return "transfersucess";
	}	
	@RequestMapping("/closeac")
	public String closeform(@ModelAttribute Bank bank,ModelMap model) {
		return "close";	
	}
	@RequestMapping("/close")
	public String close(@ModelAttribute Bank bank,ModelMap model) {
		serv.close(bank);
		return "closesucess";
	}
}
