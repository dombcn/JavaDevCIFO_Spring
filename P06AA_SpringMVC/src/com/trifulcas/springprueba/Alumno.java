package com.trifulcas.springprueba;

import java.util.Map;
import java.util.LinkedHashMap;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

import com.trifulcas.springprueba.validation.ValidarDni;

public class Alumno {
	
	@NotNull
	@Size(min = 3, message = "Debe introducir el nombre del alumno.")
	private String nombre;
	
	@ValidarDni
	private String dni;
	
	@Pattern(regexp="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}|",message="e-mail incorrecto")
	private String email;
	
	private String becado;
	private String[] asignaturas;
	
	private Map<String,String> opcBecado;
	private ListaAsignaturas listaAsignaturas;
	
	public Alumno() {
		super();
		opcBecado = new LinkedHashMap<String,String>();
		opcBecado.put("Sí","Sí");
		opcBecado.put("No","No");
		listaAsignaturas = new ListaAsignaturas();
		becado = "No";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBecado() {
		return becado;
	}
	
	public void setBecado(String becado) {
		this.becado = becado;
	}
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public Map<String,String> getOpcBecado() {
		return opcBecado;
	}
	
	public Map<String,String> getListaAsignaturas() {
		return listaAsignaturas.getListaAsignaturas();
	}
	
}

