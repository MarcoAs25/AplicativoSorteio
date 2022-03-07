package com.mrcant.aplicativosorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortear(View view){
        TextView textoResultad = findViewById(R.id.txtResult);
        TextView textoErro = findViewById(R.id.txtErrorWarning);
        textoErro.setText("");
        textoResultad.setText("");
        EditText minValue = findViewById(R.id.minValue);
        EditText maxValue = findViewById(R.id.maxValue);
        try{
            int min = Integer.parseInt(minValue.getText().toString());
            int max = Integer.parseInt(maxValue.getText().toString());
            Random rand = new Random();
            int randomNum = rand.nextInt((max - min) + 1) + min;
            textoResultad.setText( Integer.toString(randomNum));
        }catch (Exception e){
            textoErro.setText("Houve um erro ao Sortear o número");
        }



    }
}