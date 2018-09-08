package org.openxava.materias;

import javax.persistence.*;

import org.openxava.preceptoria.*;

@javax.persistence.Entity 
public class Materias{
	
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

