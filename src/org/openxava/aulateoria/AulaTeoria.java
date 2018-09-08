package org.openxava.aulateoria;

import javax.persistence.*;

import org.openxava.aulas.*;

@javax.persistence.Entity 
public class AulaTeoria extends Aulas{
	
	@Id @Column(length=40)
	public String curso;

	@Column(length=40)
	public boolean estado;

	public String setcurso() {
		return curso;
	}
	
	public void getcurso (String curso) {
		this.curso=curso;
	}
	
	public boolean setestado() {
		return estado;
	}
	
	public void getestado(boolean estado) {
		this.estado=estado;
	}

}

