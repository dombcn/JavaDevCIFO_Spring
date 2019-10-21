package com.trifulcas.springprueba;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context;
		Codificador miCodificador;
		String texto = "";
		String str = "";
		
		// Entrar texto
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrar texto:");
		texto = sc.nextLine();
		sc.close();
		
		// Context: Palabras-Invertir
		// Cargar el contexto
		context = new AnnotationConfigApplicationContext(ConfigPalabrasInvertir.class);
		// Pedir el bean
		miCodificador = context.getBean("codificador", Codificador.class);
		// TEST1
		System.out.println("EJEMPLO Palabras-Invertir:\n   " + texto);
		str = miCodificador.codificar(texto);
		System.out.println("CODIFICADDO:\n   " + str);
		str = miCodificador.decodificar(str);
		System.out.println("DECODIFICADO:\n   " + str + "\n");
		// Cerrar el contexto
		context.close();
		
		// Context: Palabras-Cesar
		// Cargar el contexto
		context = new AnnotationConfigApplicationContext(ConfigPalabrasCesar.class);
		// Pedir el bean
		miCodificador = context.getBean("codificador", Codificador.class);
		// TEST2
		System.out.println("EJEMPLO Palabras-Cesar:\n   " + texto);
		str = miCodificador.codificar(texto);
		System.out.println("CODIFICADDO:\n   " + str);
		str = miCodificador.decodificar(str);
		System.out.println("DECODIFICADO:\n   " + str + "\n");
		// Cerrar el contexto
		context.close();
		
		// Context: Bloques-Invertir
		// Cargar el contexto
		context = new AnnotationConfigApplicationContext(ConfigBloquesInvertir.class);
		// Pedir el bean
		miCodificador = context.getBean("codificador", Codificador.class);
		// TEST1
		System.out.println("EJEMPLO Bloques-Invertir:\n   " + texto);
		str = miCodificador.codificar(texto);
		System.out.println("CODIFICADDO:\n   " + str);
		str = miCodificador.decodificar(str);
		System.out.println("DECODIFICADO:\n   " + str + "\n");
		// Cerrar el contexto
		context.close();
		
		// Context: Bloques-Cesar
		// Cargar el contexto
		context = new AnnotationConfigApplicationContext(ConfigBloquesCesar.class);
		// Pedir el bean
		miCodificador = context.getBean("codificador", Codificador.class);
		// TEST2
		System.out.println("EJEMPLO Bloques-Cesar:\n   " + texto);
		str = miCodificador.codificar(texto);
		System.out.println("CODIFICADDO:\n   " + str);
		str = miCodificador.decodificar(str);
		System.out.println("DECODIFICADO:\n   " + str + "\n");
		// Cerrar el contexto
		context.close();
		
	}

}
