package org.openxava.alumno;

@javax.persistence.Entity 
public class Alumno
{
	
	public String direccion;
	
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

