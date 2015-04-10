package com.example.calen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    public void debe(View view)
    {
    	startActivity(new Intent("com.example.calen.Debo"));
    }
    public void ver(View view)
    {
    	startActivity(new Intent("com.example.calen.Ver"));
    }
    public void preste(View view)
    {
    	startActivity(new Intent("com.example.calen.Aquiendebo"));
    }
    public void Agregar_Persona(View view)
    {
    	startActivity(new Intent("com.example.calen.Ver"));
    	
    }
    
}
