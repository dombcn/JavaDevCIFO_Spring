package com.trifulcas.springprueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.trifulcas.springprueba")
public class ConfigBloquesInvertir {

	@Bean
	public IProcesar bloques() {
		return new Bloques();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}

	@Bean
	public Codificador codificador() {
		return new Codificador(bloques(),invertir());
	}
	
}
