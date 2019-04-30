package com.example.examtimer;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=MediaPlayer.create(this,R.raw.three);

        final TextView textView2=findViewById(R.id.textView2);
        final TextView textView3=findViewById(R.id.textView3);

        new CountDownTimer(10000,1000){

            @SuppressLint("SetTextI18n")
            public void onTick(long millisecondsUntilDone){
                textView2.setText("Time: "+ millisecondsUntilDone / 1000);
            }
            @SuppressLint("SetTextI18n")
            public void onFinish(){
                textView3.setText("Done !!!");
                m1.start();
            }

        }.start();
    }
}
