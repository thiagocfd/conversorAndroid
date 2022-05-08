package com.example.desmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    EditText valorKm;
    TextView txtResultado;
    Button btn_primeira_tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        valorKm = findViewById(R.id.valorKm);

        txtResultado = findViewById(R.id.txtResultado);

        btn_primeira_tela = (Button) findViewById(R.id.btn_primeira_tela);
        btn_primeira_tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(next);
            }
        });
    }

    public void calcular2(View view) {

        double milha = Double.parseDouble(valorKm.getText().toString());
        double quantKm = 1.60934;

        double totalKm = milha * quantKm;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalKm);

        txtResultado.setText(valorFormatado + " Km");

    }
}