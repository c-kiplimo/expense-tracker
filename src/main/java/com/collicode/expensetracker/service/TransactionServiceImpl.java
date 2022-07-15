package com.collicode.expensetracker.service;

import com.collicode.expensetracker.domain.Transaction;
import com.collicode.expensetracker.exceptions.EtBadRequestException;
import com.collicode.expensetracker.exceptions.EtResourceNotFoundException;
import com.collicode.expensetracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId) {
        return transactionRepository.findAll(userId,categoryId);
    }

    @Override
    public Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
        return transactionRepository.findById(userId,categoryId,transactionId);
    }

    @Override
    public Transaction addTransaction(Integer userId, Integer categoryId,Double amount, String note, Long transactionDate) throws EtBadRequestException {
        int transactionId=transactionRepository.create(userId,categoryId,amount, note,transactionDate);
        return transactionRepository.findById(userId,categoryId,transactionId);
    }

    @Override
    public void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException {
        transactionRepository.update(userId,categoryId,transactionId,transaction);
    }

    @Override
    public void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
   transactionRepository.removeById(userId,transactionId,categoryId);
    }
}
