package com.example.dicerollerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView mImageView;
Button button;
Random mRandom=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    public void rollDice(){
        int myRandomNumber=mRandom.nextInt(6)+1;

        switch (myRandomNumber){
            case 1:
                mImageView.setImageResource(R.drawable.dice1);
                break;

            case 2:
                mImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                mImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                mImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                mImageView.setImageResource(R.drawable.dice6);
                break;
        }


    }
}
