package org.openxava.materias;

@javax.persistence.Entity 
public class Materias extends MateriasTeoriaMateriasTaller
{

	public String nombre;
	
	public String ciclo;
	
	public Preceptoria preceptoria;

	public Materias(){
	}

}

