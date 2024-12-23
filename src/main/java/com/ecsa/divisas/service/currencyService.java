package com.ecsa.divisas.service;

import com.ecsa.divisas.model.currencyModel;
import com.ecsa.divisas.repository.currencyRepository;
import org.springframework.stereotype.Service;

import java.util.Currency;
import java.util.List;

@Service
public class currencyService {
    private final currencyRepository repository;
    public currencyService(currencyRepository repository) {
        this.repository = repository;
    }
    public List<currencyModel> findAll() {
        return repository.findAll();
    }
    public currencyModel save(currencyModel currencyModel) {
        return repository.save(currencyModel);
    }
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
