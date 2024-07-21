package com.prueba.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.spring.service.FactorialService;

@SpringBootTest
class PruebaSpringApplicationTests {
	
	private final FactorialService factorialService = new FactorialService();

	@Test
	void testCalcularFactorial() {
        assertEquals(1, factorialService.calcularFactorial(1));
        assertEquals(120, factorialService.calcularFactorial(5));
    }

    @Test
    public void testCalcularFactorialNumeroNegativo() {
        try {
            factorialService.calcularFactorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Número debe ser no negativo", e.getMessage());
        }
    }

}
