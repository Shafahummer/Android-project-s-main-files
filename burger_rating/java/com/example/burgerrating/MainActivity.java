package com.example.burgerrating;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
RatingBar ratingBar;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }
    @SuppressLint("SetTextI18n")
    public void submit(View view){
        float ratingValue=ratingBar.getRating();
        if(ratingValue<2 && ratingValue>0){
            textView.setText("Rating: "+ratingValue+"\nWe will try better next time!");
        } else if (ratingValue<=3 && ratingValue>=2) {
            textView.setText("Rating: "+ratingValue+"\nWe are constantly improving!");
        }
        else if(ratingValue<=4 && ratingValue>=3){
            textView.setText("Rating: "+ratingValue+"\nThank you for your response!");
        }
        else if(ratingValue==5){
            textView.setText("Rating: "+ratingValue+"\nWe deserve it!!!");
        }
        else  textView.setText("Please give your rating!");
    }
}
