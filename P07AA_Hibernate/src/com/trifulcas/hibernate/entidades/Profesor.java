package com.trifulcas.hibernate.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesores")
public class Profesor {

	@Id
	@Column(name = "idprofesor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idprofesor;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy="profesor",cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH}) 
	private List<Modulo> modulos;
	
	public Profesor() {
	}
	
	public Profesor(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}
	
	public int getIdprofesor() {
		return idprofesor;
	}
	
	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
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
		if (modulos==null) {
			modulos=new ArrayList<Modulo>();
		}
		modulos.add(modulo);
		modulo.setProfesor(this);
	}
	
	@Override
	public String toString() {
		String mods="";
		for(Modulo m:modulos) {
			mods += m.getNombre()+"|";
		}
		return "Profesor [idprofesor=" + idprofesor + ", dni=" + dni
				+ ", nombre=" + nombre + ", email=" + email + ", modulos=" + mods + "]";
	}
	
}
