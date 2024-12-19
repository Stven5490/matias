package com.ecsa.divisas;

import com.ecsa.divisas.model.divisa;
import com.ecsa.divisas.repository.divisaRepository;
import com.ecsa.divisas.service.divisaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class divisaServiceTest {
    private final divisaRepository repository = Mockito.mock(divisaRepository.class);
    private final divisaService service = new divisaService(repository);

    @Test
    public void testGuardar() {
        divisa divisa = new divisa();
        divisa.setMonedaOrigen("USD");
        divisa.setMonedaDestino("EUR");
        divisa.setMonto(BigDecimal.valueOf(1000));
        divisa.setTasa(BigDecimal.valueOf(0.85));

        when(repository.save(divisa)).thenReturn(divisa);

        divisa result = service.guardar(divisa);
        assertEquals("USD", result.getMonedaOrigen());
        verify(repository, times(1)).save(divisa);
    }

    @Test
    public void testListar() {
        divisa divisa = new divisa();
        divisa.setMonedaOrigen("USD");
        divisa.setMonedaDestino("EUR");

        when(repository.findAll()).thenReturn(List.of(divisa));

        List<divisa> divisas = service.listar();
        assertEquals(1, divisas.size());
        verify(repository, times(1)).findAll();
    }
}
