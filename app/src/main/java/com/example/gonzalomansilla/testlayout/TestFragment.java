package com.example.gonzalomansilla.testlayout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {


    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    /*public void botonRegistrar(View view) {
        Intent registrar = new Intent(this, Registro.class);
        startActivity(registrar);
    }

    public void sobreKeepol(View view) {
        Intent sobreNosotros = new Intent(this, SobreNosotros.class);
        startActivity(sobreNosotros);
    }


    public void botonIniciarSesion(View view) {
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }*/

}
