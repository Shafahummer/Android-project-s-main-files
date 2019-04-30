package com.example.quickchanger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout layout;
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.layout);
        radioGroup=findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i){
                    case R.id.btnblue:
                        layout.setBackgroundColor(Color.parseColor("#74B9FF"));
                        break;

                    case R.id.btngreen:
                        layout.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                    case R.id.btnred:
                        layout.setBackgroundColor(Color.parseColor("#E71C23"));
                        break;
                }
            }
        });
    }
}
