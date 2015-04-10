package com.example.calen;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.View.OnClickListener;  
public class Ver extends Activity
{
	 private Spinner spinner1;
	 public void onCreate(Bundle sabeInstanceState)
	{
		String []personas={"henry","jesus","alberto","Gabriela","Margaret"};  
		super.onCreate(sabeInstanceState);
		setContentView(R.layout.ver);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
        List<String> list = new ArrayList<String>();
        list.add("Debo");
        list.add("Me deben");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
        (this, android.R.layout.simple_spinner_item,list);
         
        dataAdapter.setDropDownViewResource
        (android.R.layout.simple_spinner_dropdown_item);
         
        spinner1.setAdapter(dataAdapter);
        ArrayAdapter<String> adapter= new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line,personas);
        AutoCompleteTextView texView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        texView.setThreshold(3);
        texView.setAdapter(adapter);
        // Spinner item selection Listener  
        //addListenerOnSpinnerItemSelection();

        // Button click Listener 
       // addListenerOnButton();
	}
	 public void Agregar(View view)
	    {
		 startActivity(new Intent("android.intent.action.MAIN"));
	    }
}
