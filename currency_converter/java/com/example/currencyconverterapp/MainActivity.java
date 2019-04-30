package com.example.currencyconverterapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView textView;
EditText editText;
Button euro,dollar,pound,yen,dinar,btc,riyal,aus,can;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);


        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        btc=findViewById(R.id.btc);
        riyal=findViewById(R.id.riyal);
        aus=findViewById(R.id.aus);
        can= findViewById(R.id.can);


        euro.setOnClickListener(this);
        dollar.setOnClickListener(this);
        pound.setOnClickListener(this);
        yen.setOnClickListener(this);
        dinar.setOnClickListener(this);
        btc.setOnClickListener(this);
        riyal.setOnClickListener(this);
        aus.setOnClickListener(this);
        can.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        String z=editText.getText().toString();

        if(TextUtils.isEmpty(z))
            //TextUtils is used for getting amazing methods like setError
            editText.setError("Empty User Input!");
        else {
            double n, k;
            n=Double.parseDouble(z);
            textView.setText(null);
            DecimalFormat numberFormat = new DecimalFormat("#.00");
//      it formats the result and give the result having 2 decimal places

        switch (v.getId()){
            case R.id.euro:
                k = n * 0.013;
                textView.setText("" + numberFormat.format(k));

//              textView.setText(""+k);
//              if DecimalFormat is not used  then the above statement can be executed
                break;

            case R.id.dollar:
                k=n*0.014 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.pound:
                k=n*0.011 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.yen:
                k=n*1.60 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.dinar:
                k=n*17.04 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.btc:
                k=n*0.0000028 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.riyal:
                k=n*0.054 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.aus:
                k=n*0.020 ;
                textView.setText(""+numberFormat.format(k));
                break;
            case R.id.can:
                k=n*0.019 ;
                textView.setText(""+numberFormat.format(k));
                break;
            }

        }
    }
}
