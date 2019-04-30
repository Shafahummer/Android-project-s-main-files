package com.example.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
    }
    public void screen2(View view){

        String value=editText.getText().toString();

        if(value.length()<1)
            editText.setError("Name is empty!");
        else {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name",value);

//      if there is multiple values then this method can be used
//            Bundle bundle=new Bundle();
//            bundle.putString("name",value);
//            bundle.putString("password",value + "new");
//            intent.putExtras(bundle);

//      or by using ArrayList

            startActivity(intent);
        }
    }
}

