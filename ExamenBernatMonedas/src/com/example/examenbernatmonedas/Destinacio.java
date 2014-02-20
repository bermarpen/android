package com.example.examenbernatmonedas;

public class Destinacio {
	
	private String zona;
	private String continent;
	private String preu;
	

	public Destinacio(String zna, String conti, String pr){
		zona = zna;
		continent = conti;
		preu = pr;
	}
	
	public String getZona(){
		return zona;
	}
	
	public String getContinente(){
		return continent;
	}
	
	public String getPrecio(){
		return preu;
	}
	
}

