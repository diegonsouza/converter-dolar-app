package com.example.conversordolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText editValorDolar,editQtdDolar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValorDolar = findViewById(R.id.editValorDolar);
        editQtdDolar = findViewById(R.id.editQtdDolar);
        txtResultado = findViewById(R.id.txtResultado);

    }
    public void caclular(View view){

        double quantDolar = Double.parseDouble(editQtdDolar.getText().toString());
        double valorDolar = Double.parseDouble(editValorDolar.getText().toString());

        double totalReais = valorDolar * quantDolar;

        DecimalFormat decimal= new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalReais);

        txtResultado.setText("R$ " + valorFormatado);
    }
}