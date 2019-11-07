package com.trifulcas.hibernate.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	@Column(name = "idalumno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idalumno;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "email")
	private String email;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},fetch = FetchType.LAZY)
	@JoinTable(name = "mod_alu",joinColumns = @JoinColumn(name="idalumno"), inverseJoinColumns = @JoinColumn(name="idmodulo"))
	private List<Modulo> modulos;
	
	public Alumno() {
	}
	
	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	public int getIdalumno() {
		return idalumno;
	}
	
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Modulo> getModulos() {
		return modulos;
	}
	
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	public void addModulo(Modulo modulo) {
		if (modulos == null) {
			modulos = new ArrayList<Modulo>();
		}
		modulos.add(modulo);
	}
	
	@Override
	public String toString() {
		String mods="";
		for(Modulo m:modulos) {
			mods += m.getNombre()+"|";
		}
		return "Alumno [idalumno=" + idalumno + ", nombre=" + nombre + ", email=" + email + ", modulos=" + mods + "]";
	}
	
}
