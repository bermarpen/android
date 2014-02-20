package com.example.bbddcentros;

public class Centre {
	
	private String codiCentre;
	private String nomCentre;
	private String direccio;
	private String tipusCentre;
	private String telefon;
	private String numeroPlaces;
	public Centre(String codi, String nomC, String direcc, String tipus, String tlf, String numP)
	{
		codiCentre = codi;
		nomCentre =nomC;
		direccio=direcc;
		tipusCentre = tipus;
		telefon = tlf;
		numeroPlaces = numP;
	}
	
	public void setTipo(String tipusCentre ){
		
		this.tipusCentre = tipusCentre;
	}
	
	public void setTelefono(String telefon){
		
		this.telefon = telefon;
	}
	
	public void setNumeroPlazas(String numeroPlaces){
		
		this.numeroPlaces = numeroPlaces;
	}
	
	public void setDireccion(String direccio) {
		
		this.direccio = direccio;
	}
	
	public void setCodCentro(String codCentro) {
		
		this.codiCentre = codCentro;
	}
	
	public void setNomCentro(String nomCentro) {
		
		this.nomCentre = nomCentro;
	}
	
	public String getDireccion() {
		
		return direccio;
	}
	
	public String getCodCentro() {

		return codiCentre;
	}
	
	public String getNomCentro() {

		return nomCentre;
	}
	
	public String getTipo(){
		
		return tipusCentre;
	}
	
	public String getTelefono(){
		
		return telefon;
	}
	
	public String getNumPlazas(){
		
		return numeroPlaces;
	}
	
}


