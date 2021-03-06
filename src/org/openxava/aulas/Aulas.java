package org.openxava.aulas;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.preceptoria.*;

@javax.persistence.Entity 

public class Aulas{
	
	@Id @Column(length=40) @LabelFormat("ID")
	public String id;
	
	@Column(length=40) @LabelFormat("Ciclo"")
	public String ciclo;
	
	public Preceptoria preceptoria;

	public String getid() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;	
	}
	
	public String getciclo() {
		return ciclo;
	}
	
	public void setciclo(String ciclo) {
		this.ciclo = ciclo;	
	}

}

