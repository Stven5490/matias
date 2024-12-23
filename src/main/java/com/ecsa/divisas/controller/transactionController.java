package com.ecsa.divisas.controller;

import com.ecsa.divisas.model.transactionModel;
import com.ecsa.divisas.service.transactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class transactionController {
    private final transactionService service;

    public transactionController(transactionService service) {
        this.service = service;
    }
    @GetMapping
    public List<transactionModel> getAllTransactions() {
        return service.findAll();
    }
    @PostMapping
    public transactionModel createTransaction(@RequestBody transactionModel transactionModel){
        return service.save(transactionModel);
    }
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        service.deleteById(id);
    }
}
