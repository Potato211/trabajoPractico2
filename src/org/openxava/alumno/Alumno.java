package org.openxava.alumno;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.persona.*;

@javax.persistence.Entity 
public class Alumno extends Persona {
	
	@Column(length=40) @LabelFormat("Direccion")
	public String direccion;
	
	@Email @Column(length=40) @LabelFormat("Email")
	public String mail;

	public String getdireccion () {
		return direccion;
	}
	
	public void setdireccion (String direccion) {
		this.direccion = direccion;
	}
	
	public String getmail() {
		return mail;
	}
	
	public void setmail(String mail) {
		this.mail = mail;
	}

}

