package com.example.noticiasbbdd;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VisualitzaNoticies extends Activity {
	private ConexioBBDD conexioBD;
	private SQLiteDatabase db;
	private String[] datos;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vore_noticies);
		conexioBD=new ConexioBBDD(this,"DBNoticias",null,1);
		db=conexioBD.getReadableDatabase();
		llegirnoticies();
		
		ListView llista=(ListView)findViewById(R.id.llista);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, datos);
		llista.setAdapter(adapter);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void llegirnoticies(){
		
		String[] campsNoticies = new String[] {" "};

        Cursor c = db.query("Noticias", campsNoticies, null, null, null, null, null);
        
        datos=new String[c.getCount()];
        System.out.println(c.getCount());
        int pos=0;
        
        if (c.moveToFirst()) {
                do {               		
                		String noticia=c.getString(0);                      
                        System.out.println(noticia);
                        datos[pos]=noticia;
                        pos++;
                } while (c.moveToNext());
        }
        db.close();
	}

}
