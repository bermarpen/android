package com.example.noticiasbbdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class ConexioBBDD extends SQLiteOpenHelper {
		
	public ConexioBBDD(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	
	String novataula = "CREATE TABLE IF NOT EXISTS Guardarnoticies (codi INTEGER PRIMARY KEY, noticia varchar(300))";
	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL(novataula);
	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}