package org.openxava.persona;

import javax.persistence.*;

import org.openxava.escuela.*;

@MappedSuperclass
public class Persona extends ProfesorAlumnoDireccionPreceptoria
{
	@Column(length=40)
	public String nombre;
	
	@Column(length=40)
	public String apellido;
	
	@Id @Column(length=40)
	public int dni;
	
	@Column(length=40)
	public String tel;
	
	@Column(length=40)
	public Escuela escuela;

	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;	
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public void setapellido(String apellido) {
		this.apellido = apellido;	
	}
	
	public int getdni() {
		return dni;
	}
	
	public void setdni(int dni) {
		this.dni = dni;	
	}
	

}

