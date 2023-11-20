package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.model.Bank;

public interface Bankrepo extends CrudRepository<Bank, Integer> {

}
