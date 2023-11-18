package com.fag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProjetoDadosApplication {

	public static void main(String[] args) {
		SpingApplication.run(ProjetoDadosApplication.class, args)
	}

}

@RestController
class RolagemController {
	@GetMapping("/rolar-Dados")
	public int rolarDados(@RequestParam int NumeroDeLados){
		return (int) (Math.random() * NumeroDeLados) + 1; 
	}
}
