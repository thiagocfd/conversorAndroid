package com.example.desmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText valorKm;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorKm = findViewById(R.id.valorKm);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calcular(View view) {

        double quantKm = Double.parseDouble(valorKm.getText().toString());
        double milha = 0.62137;

        double totalMilhas = quantKm * milha;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalMilhas);

        txtResultado.setText(valorFormatado + " milhas");

    }
}