package com.prueba.spring.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.spring.service.FactorialService;

@RestController
@RequestMapping("/api")
public class ControllerHola {
	
	@Autowired
	private FactorialService factorialService;
	
	public ControllerHola(FactorialService factorialService) {
        this.factorialService = factorialService;
    }
	
	@GetMapping("/hola")
    public Map<String, String> saludo() {
        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Hola los saluda el equipo de desarrollo Valen y sus amigos");
        return response;
    }
	
	@GetMapping("/factorial/{numero}")
	public Map<String, Object> calcularFactorial(@PathVariable int numero) {
	    Map<String, Object> response = new HashMap<>();
	    response.put("nume", numero);
	    response.put("factorial", factorialService.calcularFactorial(numero));
	    return response;
	}
}
