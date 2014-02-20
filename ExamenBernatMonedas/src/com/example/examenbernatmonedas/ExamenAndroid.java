package com.example.examenbernatmonedas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class ExamenAndroid extends Activity {

	private Destinacio[] destinos = new Destinacio[]{
    		new Destinacio("Zona A", "Asia", "30"),
    		new Destinacio("Zona A", "Oceania", "30"),
    		new Destinacio("Zona B", "America", "20"),
    		new Destinacio("Zona B", "Africa", "20"),
    		new Destinacio("Zona C", "Europa", "10")};


RadioButton botonormal, botourgent;
static double tarifa;
int peso = 0;
int precio;
String zona, continent, resultat, clase, decoracio;
CheckBox tarjeta, regal;


class AdaptadorDestino extends ArrayAdapter<Destinacio> {
	
	Activity a;
	AdaptadorDestino(Activity b) {
	super(b, R.layout.activity_pantallacalcul, destinos);
	this.a = b;
	}
	
	public View getDropDownView ( int position, View convertView, ViewGroup parent){
		return getView (position, convertView, parent);
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = a.getLayoutInflater();
		View item = inflater.inflate(R.layout.activity_pantallacalcul, null);
		
		final TextView lblZona = (TextView)item.findViewById(R.id.LabelZona);
		lblZona.setText(destinos[position].getZona());
		
		final TextView lblContinente = (TextView)item.findViewById(R.id.LabelContinente);
		lblContinente.setText(destinos[position].getContinente());
		
		final TextView lblPrecio = (TextView)item.findViewById(R.id.LabelPrecio);
		lblPrecio.setText(destinos[position].getPrecio());	
		
		return(item);
	}
}


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_examen_android);
	
	 	
        final Spinner cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);
        
        AdaptadorDestino adaptador = new AdaptadorDestino(this);
        
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         
        cmbOpciones.setAdapter(adaptador);
        	        
        cmbOpciones.setOnItemSelectedListener(
        	new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> parent,
                    android.view.View v, int position, long id) {
                	zona = destinos[position].getZona();
                	continent = destinos[position].getContinente();
                	precio = Integer.parseInt(destinos[position].getPrecio());      
                }
                public void onNothingSelected(AdapterView<?> parent) {
                    
                }
        });
    

	final Button btnBoton1 = (Button)findViewById(R.id.BotoCalcular);
	botourgent=(RadioButton)findViewById(R.id.botourgent);
    botonormal=(RadioButton)findViewById(R.id.botonormal);
    tarjeta = (CheckBox) findViewById(R.id.checktarjeta);
	regal = (CheckBox) findViewById(R.id.checkregal);
	
  	final RadioGroup radiog = (RadioGroup)findViewById(R.id.radiogroup1);
    final EditText txtpeso = (EditText)findViewById(R.id.textpeso);

		btnBoton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String pes = txtpeso.getText().toString();
				peso = Integer.parseInt(pes);

				if (peso <= 5){
					tarifa = precio + peso;
				}else {
					if (peso >= 6 && peso <= 10){
						tarifa = precio + (peso * 1.5);
					}else {
						if (peso > 10){
							tarifa = precio + (peso * 2);
						}
					}
				}
				
				if (regal.isChecked() && !(tarjeta.isChecked())){
					decoracio = "Con caja regalo";
				}else {
					if (tarjeta.isChecked() && !(regal.isChecked())){
						decoracio = "Con tarjeta dedicada";
					}else {
						if (regal.isChecked() && tarjeta.isChecked()){
							decoracio = " Con caja regalo y dedicatoria";
						}else {
							decoracio = "Sin decoracion";
						}
					}
				}
				
				
				if (botourgent.isChecked()){
	                tarifa = tarifa + (tarifa * 0.3);
	                clase = "urgente";
	            }else {
	            	clase = "normal";
	            }
				
				
				resultat = ("Zona: " + zona + " ," + continent + "\nTarifa: " + clase + "\nPeso: " + peso +
						" Kg" + "\n\nDecoracion: " + decoracio + "\nCoste total: " + tarifa + " euros");
				
				
				Intent intent = new Intent(ExamenAndroid.this, PantallaCalcul.class);

					Bundle b = new Bundle();
					b.putString("Tarifa", resultat);
					b.putDouble("Precio", tarifa);

					intent.putExtras(b);
					  					
					startActivity(intent);				
				  				
			}
		});	

}

}
