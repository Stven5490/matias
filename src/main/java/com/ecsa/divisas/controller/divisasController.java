package com.ecsa.divisas.controller;

import org.springframework.web.bind.annotation.*;
import com.ecsa.divisas.service.divisaService;
import com.ecsa.divisas.model.divisa;

import java.util.List;


@RestController
@RequestMapping("/api/divisa")
public class divisasController {
    private final divisaService service;
    public divisasController(divisaService service) {
        this.service = service;
    }
    @GetMapping
    public List<divisa> listar() {
        return service.listar();
    }
    @PostMapping
    public divisa guardar(@RequestBody divisa divisa) {
        return service.guardar(divisa);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
