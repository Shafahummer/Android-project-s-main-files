package com.example.intenttest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Button b2;
TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);

        String name=getIntent().getStringExtra("name");
        textView.setText("Welcome "+name);


    }
    public  void screen1(View view){
        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
