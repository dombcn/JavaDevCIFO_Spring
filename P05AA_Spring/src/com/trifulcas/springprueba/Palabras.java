package com.trifulcas.springprueba;

import java.util.ArrayList;
import java.util.Arrays;

public class Palabras implements IProcesar {
	
	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> cadenas = new  ArrayList<String>(Arrays.asList(cadena.split(" ")));
		
		return cadenas;
	}
	
	@Override
	public String unir(ArrayList<String> cadenas) {
		String cadena = "";
		
		for(String c:cadenas) {
			cadena = cadena.concat(c + " ");
		}
		cadena = cadena.stripTrailing();
		
		return cadena;
	}

}
