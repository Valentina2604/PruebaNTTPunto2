package com.prueba.spring.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

	public long calcularFactorial(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Número debe ser no negativo");
        return (numero == 0) ? 1 : numero * calcularFactorial(numero - 1);
    }
}
