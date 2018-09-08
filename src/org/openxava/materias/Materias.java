package org.openxava.materias;

import javax.persistence.*;

@javax.persistence.Entity 
public class Materias extends MateriasTeoriaMateriasTaller
{
	@Column(length=40)
	public String nombre;
	
	@Column(length=40)
	public String ciclo;
	
	public Preceptoria preceptoria;

	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;	
	}

}

