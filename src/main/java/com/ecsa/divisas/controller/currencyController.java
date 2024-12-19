package com.ecsa.divisas.controller;

import com.ecsa.divisas.model.currency;
import com.ecsa.divisas.repository.currencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class currencyController {
    @Autowired
    private currencyRepository currencyRepository;
    @GetMapping
    public List<currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }
    @PostMapping
    public currency createCurrency(@RequestBody currency currency) {
        return currencyRepository.save(currency);
    }
    @PutMapping("/{id}")
    public currency updateCurrency(@PathVariable Long id, @RequestBody currency currency) {
        currency.setId(id);
        return currencyRepository.save(currency);
    }
    @DeleteMapping("/{id}")
    public void deleteCurrency(@PathVariable Long id) {
        currencyRepository.deleteById(id);
    }
}
