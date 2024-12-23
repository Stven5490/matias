package com.ecsa.divisas.service;

import com.ecsa.divisas.model.transactionModel;
import com.ecsa.divisas.repository.transactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class transactionService {
    private final transactionRepository repository;

    public transactionService(transactionRepository repository) {
        this.repository = repository;
    }
    public List<transactionModel> findAll(){
        return repository.findAll();
    }
    public transactionModel save (transactionModel transactionModel){
        return repository.save(transactionModel);
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
