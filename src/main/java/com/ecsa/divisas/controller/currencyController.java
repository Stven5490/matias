package com.ecsa.divisas.controller;

import com.ecsa.divisas.model.currencyModel;
import com.ecsa.divisas.service.currencyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currencies")
public class currencyController {
    private final currencyService currencyService;

    public currencyController(com.ecsa.divisas.service.currencyService currencyService) {
        this.currencyService = currencyService;
    }
    @GetMapping
    public List<currencyModel> getAllCurrencies(){
        return currencyService.findAll();
    }
    @PostMapping
    public currencyModel createCurrency(@RequestBody currencyModel currencyModel){
        return currencyService.save(currencyModel);
    }
    @DeleteMapping("/{id}")
    public void deleteCurrency(@PathVariable Long id){
        currencyService.deleteById(id);
    }
}
