package com.cg.banking.daoservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.banking.beans.Transaction;

public interface TransactionDAO  extends JpaRepository<Transaction, Integer>{

}
