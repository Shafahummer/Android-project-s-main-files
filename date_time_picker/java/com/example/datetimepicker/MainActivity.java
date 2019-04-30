package com.example.datetimepicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
TimePicker timePicker;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker=findViewById(R.id.timePicker);
        textView=findViewById(R.id.textView);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText("Hour: "+hourOfDay + "\nMinute: "+minute);
            }
        });
    }
    public void datePick(View view){
        Intent intent=new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }
}
