package com.example.examenbernatmonedas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaCalcul extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantallacalcul);

		 TextView tarifa = (TextView)findViewById(R.id.LblTarifa);
    	 TextView cambio = (TextView)findViewById(R.id.LabelCanvi);
    	 
    	 // recuperamos informacion del intent
    	 Bundle b = this.getIntent().getExtras();
    	 
    	 tarifa.setText(b.getString("Tarifa"));
    	 
    	 double precio = b.getDouble("Precio");
    	 
    	 int ent=(int)precio;
    	 
    	 int bitllets500, bitllets200, bitllets100, bittllets50, bitllets20, bitllets10, bittlets5, monedes2, monedes1;
    	    	 
    	 //billets de 500 
    	 bitllets500 = ent / 500;
    	 ent = ent % 500;
    	 //billets de 200
    	 bitllets200 = ent / 200; 
    	 ent = ent % 200;
    	 //billets de 100
    	 bitllets100 = ent / 100; 
    	 ent = ent % 100; 
    	 //billets de 50
    	 bittllets50 = ent / 50; 
    	 ent = ent % 50;
    	 //billets de 20
    	 bitllets20 = ent / 20;
    	 ent = ent % 20;
    	 //billets de 10
    	 bitllets10 = ent / 10;
    	 ent = ent % 10;
    	 //billets de 5
    	 bittlets5 = ent / 5; 
    	 ent = ent % 5;
    	 //monedes de 2
    	 monedes2 = ent / 2; 
    	 ent = ent % 2;
    	 //monedes de 1€
    	 monedes1 = ent / 1;
    	 ent = ent % 1; 

    	 String totalCanvi = "";
    	 if (bitllets500 != 0){ totalCanvi += "Billetes de 500 euros: " + bitllets500;} 
    	 if (bitllets200 != 0){ totalCanvi += "\nBilletes de 200 euros: " + bitllets200;} 
    	 if (bitllets100 != 0){ totalCanvi += "\nBilletes de 100 euros: " + bitllets100;} 
    	 if (bittllets50 != 0){ totalCanvi += "\nBilletes de 50 euros: " + bittllets50;} 
    	 if (bitllets20 != 0){ totalCanvi += "\nBilletes de 20 euros: " + bitllets20;} 
    	 if (bitllets10 != 0){ totalCanvi += "\nBilletes de 10 euros: " + bitllets10;} 
    	 if (bittlets5 != 0){ totalCanvi += "\nBilletes de 5 euros: " + bittlets5;} 
    	 if (monedes2 != 0){ totalCanvi += "\nMonedas de 2 euros: " + monedes2;} 
    	 if (monedes1 != 0){ totalCanvi += "\nMondeas de 1 euro: " + monedes1;} 
    	 
    	 cambio.setText(totalCanvi);
    	 

	}

}