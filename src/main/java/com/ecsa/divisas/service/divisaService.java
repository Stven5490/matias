package com.ecsa.divisas.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class divisaService {
    private final divisaRepository repository;

    public divisaService(divisaRepository repository) {
        this.repository = repository;
    }
    public List<divisas> listar() {
        return repository.findAll();
    }
    public divisas guardar (divisas divisas) {
        return repository.save(divisas);
    }
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public Optional<divisas> obtenerPorId(Long id) {
        return repository.findById(id);
    }
}
