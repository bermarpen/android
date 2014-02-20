package com.example.bbddcentros;

public class Personal {
	
	private String codCentro;
		private String dni;
		private String cognom;
		private String funcio;
		private String salari;
		
		
		public Personal(String cod, String dn, String ape, String fun, String sal)
		{
			codCentro =cod;
			dni =dn;
			cognom = ape;
			funcio =fun;
			salari =sal;
			
		}
		
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getApellido() {
			return cognom;
		}
		public void setApellido(String apellido) {
			this.cognom = apellido;
		}

		public String getCodCentro() {
			return codCentro;
		}

		public void setCodCentro(String codCentro) {
			this.codCentro = codCentro;
		}

		public String getFuncion() {
			return funcio;
		}

		public void setFuncion(String funcion) {
			this.funcio = funcion;
		}

		public String getSalario() {
			return salari;
		}

		public void setSalario(String salario) {
			this.salari = salario;
		}
		
	}

