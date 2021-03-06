package com.example.desmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText valorKm;
    TextView txtResultado;
    Button btn_segunda_tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorKm = findViewById(R.id.valorKm);

        txtResultado = findViewById(R.id.txtResultado);

        btn_segunda_tela = (Button) findViewById(R.id.btn_primeira_tela);
        btn_segunda_tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(next);
            }
        });



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