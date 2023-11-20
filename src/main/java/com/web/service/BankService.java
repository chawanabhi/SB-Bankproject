package com.web.service;

import java.util.List;

import com.web.model.Bank;
import com.web.model.Banktranf;

public interface BankService {
public Bank regform(Bank bank);

Bank balance(Bank bank);

Bank deposite(Bank bank);

Bank withdraw(Bank bank);

void close(Bank bank);

List<Bank> transfer(Banktranf bank);

Bank customerDup(Bank bank);

}
