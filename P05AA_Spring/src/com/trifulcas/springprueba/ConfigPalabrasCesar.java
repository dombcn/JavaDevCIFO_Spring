package com.trifulcas.springprueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.trifulcas.springprueba")
public class ConfigPalabrasCesar {

	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}

	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(),cesar());
	}
	
}
