package com.trifulcas.hibernate.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "modulos")
public class Modulo {

	@Id
	@Column(name = "idmodulo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmodulo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},fetch=FetchType.LAZY)
	@JoinColumn(name="idprofesor")
	private Profesor profesor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},fetch=FetchType.LAZY)
	@JoinTable(name = "mod_alu", joinColumns = @JoinColumn(name="idmodulo"), inverseJoinColumns = @JoinColumn(name="idalumno"))
	private List<Alumno> alumnos;
	
	public Modulo() {
	}
	
	public Modulo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public int getIdmodulo() {
		return idmodulo;
	}
	
	public void setIdmodulo(int idmodulo) {
		this.idmodulo = idmodulo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void addAlumno(Alumno alumno) {
		if (alumnos == null) {
			alumnos = new ArrayList<Alumno>();
		}
		alumnos.add(alumno);
	}
	
	@Override
	public String toString() {
		String alus="";
		for(Alumno a:alumnos) {
			alus += a.getNombre()+"|";
		}
		return "Modulo [idmodulo=" + idmodulo + ", nombre=" + nombre + ", profesor=" + profesor + ", alumnos=" + alus + "]";
	}
	
}
