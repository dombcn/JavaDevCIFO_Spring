package com.trifulcas.springprueba;

import java.util.ArrayList;

public class Bloques implements IProcesar {
	
	private static final short blocSize = 4;
	
	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> cadenas = new ArrayList<String>();
		String c = cadena;
		
		while(c.length() > blocSize) {
		    cadenas.add(c.substring(0, blocSize));
		    c = c.substring(blocSize);
		}
		if(c.length()>0) cadenas.add(c);
		
		return cadenas;
	}
	
	@Override
	public String unir(ArrayList<String> cadenas) {
		String cadena = "";
		
		for(String c:cadenas) {
			cadena = cadena.concat(c);
		}
		
		return cadena;
	}

}
