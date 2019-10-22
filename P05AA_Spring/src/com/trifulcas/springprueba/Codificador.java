package com.trifulcas.springprueba;

import java.util.ArrayList;

public class Codificador {
	
	private IProcesar _procesar;
	private ICodificar _codificar;
	
	public Codificador(IProcesar procesar, ICodificar codificar) {
		_procesar = procesar;
		_codificar = codificar;
	}
	
	public String codificar(String cadena) {
		ArrayList<String> al, alc;
		String str;
		
		al = _procesar.dividir(cadena);
		alc = new ArrayList<String>();
		for(String s:al) {
			alc.add(_codificar.codificar(s));
		}
		str = _procesar.unir(alc);
		
		return str;
	}
	
	public String decodificar(String cadena) {
		ArrayList<String> al, ald;
		String str;
		
		al = _procesar.dividir(cadena);
		ald = new ArrayList<String>();
		for(String s:al) {
			ald.add(_codificar.decodificar(s));
		}
		str = _procesar.unir(ald);
		
		return str;
	}
	
}
