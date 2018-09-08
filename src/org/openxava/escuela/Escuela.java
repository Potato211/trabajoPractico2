package org.openxava.escuela;

import javax.persistence.*;

import org.openxava.annotations.*;

@javax.persistence.Entity 
public class Escuela
{
	@Column(length=40) @LabelFormat("Nombre")
	public String nombre;
	
	@Column(length=40) @LabelFormat("Direccion")
	public String direccion;
	
	public Preceptoria preceptoria;
	
	public Persona persona;

	public String setnombre() {
		return nombre;
	}
	
	public void getnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String setdireccion() {
		return direccion;
	}
	
	public void getdireccion(String direccion) {
		this.direccion=direccion;
	}

}

