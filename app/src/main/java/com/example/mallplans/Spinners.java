package com.example.mallplans;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class Spinners extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinners);

        spinner= findViewById(R.id.idspinner);
        String [] malls={"Mall1","Mall2","Mall3","Mall4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,malls);
        spinner.setAdapter(adapter);


    }
}
