package org.openxava.aulas;

@javax.persistence.Entity 
public class Aulas extends AulaTeoriaAulaTaller
{
	
	public String id;
	
	public String ciclo;
	
	public Preceptoria preceptoria;

	public Aulas(){
	}

}

