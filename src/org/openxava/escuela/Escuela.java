package org.openxava.escuela;

@javax.persistence.Entity 
public class Escuela
{
	
	public String nombre;
	
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

