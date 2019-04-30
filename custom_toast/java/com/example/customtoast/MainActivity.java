package com.example.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnPressed(View view){
//        Toast.makeText(this,"OK",Toast.LENGTH_SHORT).show();
        showCustomToast();
       }
    public void showCustomToast(){
        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.linear_layout));


        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    public void clickMe(View view){
        showAndroid("I am android");
    }
    public void showAndroid(String andro){
        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.clickme,(ViewGroup)findViewById(R.id.linear_layout2));

        TextView toastText=layout.findViewById(R.id.text2);
        toastText.setText(andro);

        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}

