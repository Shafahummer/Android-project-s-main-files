package com.example.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(this,"Login failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this,"Login success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"Information",Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"Ooooppss",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty. normal(this,"Upload success",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_arrow_drop_down_circle_black_24dp)).show();
                break;
        }
    }
}
