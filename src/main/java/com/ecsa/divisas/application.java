package com.ecsa.divisas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
        try {
            // Abre el navegador en la URL principal
            Desktop.getDesktop().browse(new URI("http://localhost:8080"));
        } catch (Exception e) {
            System.err.println("Error al abrir el navegador: " + e.getMessage());
        }
    }
}
