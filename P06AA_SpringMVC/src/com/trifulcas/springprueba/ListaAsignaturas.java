package com.trifulcas.springprueba;

import java.util.Map;
import java.util.LinkedHashMap;

public class ListaAsignaturas {
	private Map<String,String> listaAsignaturas;
	
	public ListaAsignaturas() {
		listaAsignaturas=new LinkedHashMap<String,String>();
		listaAsignaturas.put("PHP", "PHP");
		listaAsignaturas.put("JAVA", "JAVA");
		listaAsignaturas.put("JS", "JS");
		listaAsignaturas.put(".NET", ".NET");
	}
	
	public Map<String,String> getListaAsignaturas() {
		return listaAsignaturas;
	}
	
}
