package org.openxava.escuela;

@javax.persistence.Entity 
public class Escuela
{
	
	public String nombre;
	
	public String direccion;
	
	public Preceptoria preceptoria;
	
	public Persona persona;

	public Escuela(){
	}

}

