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
	
	@Column(length=40)
	public int dni;
	
	@Column(length=40)
	public String tel;
	
	@Column(length=40)
	public Escuela escuela;


	public Persona(){
	}

}

