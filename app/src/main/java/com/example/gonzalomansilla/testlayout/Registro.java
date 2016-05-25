package com.example.gonzalomansilla.testlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void botonCondiciones(View view) {
        Intent condicion = new Intent(this, Condicion.class);
        startActivity(condicion);
    }

    public void botonVolver(View view) {
        Intent index = new Intent(this, MainActivity.class);
        startActivity(index);
    }


    public void registrarValidar(View view) {

//        EditText nombreEditText = (EditText)findViewById(R.id.usuario);
//        EditText emailEditText = (EditText)findViewById(R.id.codigoPid);
        EditText passwordEditText = (EditText)findViewById(R.id.Psw1);
//        EditText confirmarPasswordEditText = (EditText)findViewById(R.id.Psw2);
//        CheckBox aceptarCondicionesCheckBox = (CheckBox)findViewById(R.id.condiciones);

        String pasw1 = passwordEditText.getText().toString();


        if( pasw1.length() < 8 ) {
            passwordEditText.setError("La contraseña es muy corta");
            return;
        }
        Intent tabActi = new Intent(this, IndexTab.class);
        startActivity(tabActi);


    }


}
