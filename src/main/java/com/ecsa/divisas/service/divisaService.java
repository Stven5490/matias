package com.ecsa.divisas.service;

import com.ecsa.divisas.model.divisa;
import com.ecsa.divisas.repository.divisaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class divisaService {
    private final divisaRepository repository;

    public divisaService(divisaRepository repository) {
        this.repository = repository;
    }
    public List<divisa> listar() {
        return repository.findAll();
    }
    public divisa guardar (divisa divisas) {
        return repository.save(divisas);
    }
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
    public Optional<divisa> obtenerPorId(Long id) {
        return repository.findById(id);
    }
}
