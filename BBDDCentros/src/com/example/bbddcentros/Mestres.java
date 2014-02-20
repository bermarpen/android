package com.example.bbddcentros;

public class Mestres {

	private String codiCentro;
	private String dni;
	private String cognoms;
	private String especialitat;
	
	
	public Mestres(String cod, String dn, String ape, String esp)
	{
		codiCentro =cod;
		dni =dn;
		cognoms = ape;
		especialitat =esp;
				
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return cognoms;
	}
	public void setApellidos(String apellidos) {
		this.cognoms = apellidos;
	}

	public String getCodCentro() {
		return codiCentro;
	}

	public void setCodCentro(String codCentro) {
		this.codiCentro = codCentro;
	}

	public String getEspecialidad() {
		return especialitat;
	}

	public void setEspecialidad(String especialidad) {
		this.especialitat = especialidad;
	}

	
}
