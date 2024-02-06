package com.example.konverzijavaluti;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.konverzijavaluti.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private double broj1;

    private EditText editTextBroj1;

    private TextView textViewKune, textViewDinari, textViewForinte, textViewMarke, textViewDenar, textViewLek;

    private ImageView Euslika;

    private TextView textViewPoruka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBroj1 = findViewById(R.id.editTextBroj1);
        textViewKune = findViewById(R.id.textViewKune);
        textViewDinari = findViewById(R.id.textViewDinari);
        textViewForinte = findViewById(R.id.textViewForinte);
        textViewMarke = findViewById(R.id.textViewMarke);




    }

    private void takeNumbersFromEditTextAndPutIntoVariables() {
        String tekstBroj1 = editTextBroj1.getText().toString();
        broj1 = Double.parseDouble(tekstBroj1);
    }
    public void ClickButtonIzracun(View view)
    {
        takeNumbersFromEditTextAndPutIntoVariables();
        double kune = broj1 * 7.53450;
        kune = Math.round(kune * Math.pow(10, 2)) / Math.pow(10, 2);
        textViewKune.setText(Double.toString(kune) + " HRK");
        double dinari = broj1 * 117.02;
        dinari = Math.round(dinari * Math.pow(10, 2)) / Math.pow(10, 2);
        textViewDinari.setText(Double.toString(dinari) + " RSD");
        double forinte = broj1 * 386.82;
        forinte = Math.round(forinte * Math.pow(10, 2)) / Math.pow(10, 2);
        textViewForinte.setText(Double.toString(forinte) + " HUF");
        double marke = broj1 * 1.96;
        marke = Math.round(marke * Math.pow(10, 2)) / Math.pow(10, 2);
        textViewMarke.setText(Double.toString(marke) + " BAM");
    }

}