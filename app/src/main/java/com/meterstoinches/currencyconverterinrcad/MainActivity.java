package com.meterstoinches.currencyconverterinrcad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inredt,cadedt;
    Button inrtocad,cadtoinr,reset;
    double indianCurrency,total,canadianCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inredt=(EditText) findViewById(R.id.inrID);
        cadedt=(EditText) findViewById(R.id.cadID);
        inrtocad=(Button) findViewById(R.id.inrTOCadBtnID);
        cadtoinr=(Button) findViewById(R.id.cadTOInrBtnID);
        reset=(Button) findViewById(R.id.resetBtnID);
    }

    public void inrtocadMethod(View view) {
        inrtocad.setEnabled(false);
        if(inredt.getText().toString().equals("") && cadedt.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some amount",Toast.LENGTH_LONG).show();
        }else{
            indianCurrency=Double.parseDouble(inredt.getText().toString());
            total=indianCurrency/54.45;
            cadedt.setText(String.valueOf(total+" CAD"));
        }

    }

    public void cadtoinrMethod(View view) {
        inrtocad.setEnabled(false);
        if(inredt.getText().toString().equals("") && cadedt.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some amount",Toast.LENGTH_LONG).show();
        }else{
            canadianCurrency=Double.parseDouble(cadedt.getText().toString());
            total=canadianCurrency*54.45;
            inredt.setText(String.valueOf(total+" Rupee"));

        }

    }

    public void resetMethod(View view) {
        inrtocad.setEnabled(true);
        cadtoinr.setEnabled(true);
        inredt.setText("");
        cadedt.setText("");
    }



}
