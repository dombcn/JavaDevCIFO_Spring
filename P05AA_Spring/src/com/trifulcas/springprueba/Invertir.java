package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Invertir implements ICodificar {

	@Override
	public String codificar(String cadena) {
		return reverse(cadena);
	}
	
	@Override
	public String decodificar(String cadena) {
		return reverse(cadena);
	}
	
	private String reverse(String str) {
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
		
		return rev;
	}
	
}
