package org.openxava.preceptoria;

import javax.persistence.*;

import org.openxava.aulas.*;
import org.openxava.escuela.*;
import org.openxava.materias.*;

@javax.persistence.Entity 
public class Preceptoria
{
	@Column(length=40)
	public String nombre;

	@Column(length=40)
	public String ciclo;
	
	public Aulas aulas;
	
	public Materias programas;
	
	public Escuela escuela;

	public String setnombre() {
		return nombre;
	}
	
	public void getnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String setciclo() {
		return ciclo;
	}
	
	public void getciclo(String ciclo) {
		this.ciclo=ciclo;
	}

}

