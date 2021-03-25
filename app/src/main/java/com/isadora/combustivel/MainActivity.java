package com.isadora.combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtAlcool,edtGasolina,edtKmlAlcool,edtKmlGasolina,edtMelhorCombustivel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlcool               = findViewById(R.id.edtAlcool);
        edtGasolina             = findViewById(R.id.edtGasolina);
        edtKmlAlcool            = findViewById(R.id.edtKmlAlcool);
        edtKmlGasolina          = findViewById(R.id.edtKmlGasolina);
        edtMelhorCombustivel    = findViewById(R.id.edtMelhorCombustivel);
    }

    public void formula(){
        Double alcool       = Double.parseDouble(edtAlcool.getText().toString());
        Double gasalina     = Double.parseDouble(edtGasolina.getText().toString());
        Double kmAlcool     = Double.parseDouble(edtKmlAlcool.getText().toString());
        Double kmGasolina   = Double.parseDouble(edtKmlGasolina.getText().toString());

        Double mediaCompustivel = alcool/gasalina;
        Double mediaKm          = kmAlcool/kmGasolina;

        if(mediaCompustivel <= mediaKm){
            edtMelhorCombustivel.setText("Melhor abastecer com Álcool!");

        }else edtMelhorCombustivel.setText("Melhor abastecer com Gasolina!");
    }

    public void calcular(View view){

        formula();
    }

    public void limpar (View view){

        edtAlcool.setText("");
        edtGasolina.setText("");
        edtKmlAlcool.setText("");
        edtKmlGasolina.setText("");
        edtMelhorCombustivel.setText("");
    }

    public void sair(View view){
        finish();
    }
}