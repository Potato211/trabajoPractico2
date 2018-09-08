package org.openxava.aulataller;

import javax.persistence.*;

import org.openxava.aulas.*;

@javax.persistence.Entity 
public class AulaTaller extends Aulas{
	
	@Id @Column(length=40)
	public String nombre;
	
	public String setnombre() {
		return nombre;
	}
	
	public void getnombre(String nombre) {
		this.nombre=nombre;
	}

}

