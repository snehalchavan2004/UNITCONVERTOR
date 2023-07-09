package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.newimg);
        img.animate().translationXBy(-1200).setDuration(10000);

    }
    public void kgTog(View view){
        EditText userInputText;


        userInputText=findViewById(R.id.value);


        String userInputString=userInputText.getText().toString();

        double userInputDouble=Double.parseDouble(userInputString);

        double outputDouble=(userInputDouble*1000);

        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of unit from kilogram  to gram is "+outputString,Toast.LENGTH_LONG).show();

    }

    public void gTokg(View view){
        EditText userInputText;


        userInputText=findViewById(R.id.value);


        String userInputString=userInputText.getText().toString();
        double userInputDouble=Double.parseDouble(userInputString);
        double outputDouble=(userInputDouble*0.001);
        String outputString=Double.toString(outputDouble);

        Toast.makeText(this,"Conversion of unit from gram to kilogram is "+outputString,Toast.LENGTH_LONG).show();

    }
}