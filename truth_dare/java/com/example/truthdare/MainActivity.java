package com.example.truthdare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    Random random=new Random();
    int lastDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);


    }
    public void spin(View view){
        int newDirection=random.nextInt(3600)+360;

        int pivoitX=imageView.getWidth()/2;
        int pivoitY=imageView.getHeight()/2;

        Animation rotate=new RotateAnimation(lastDirection,newDirection,pivoitX,pivoitY);
        rotate.setDuration(2000);
        rotate.setFillAfter(true);

        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.button_disabled);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.custom_button);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        lastDirection=newDirection;
        imageView.startAnimation(rotate);

    }
}
