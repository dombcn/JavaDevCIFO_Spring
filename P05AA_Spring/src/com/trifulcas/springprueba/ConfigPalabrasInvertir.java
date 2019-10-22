package com.trifulcas.springprueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPalabrasInvertir {

	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}

	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(),invertir());
	}
	
}
