package com.example.gonzalomansilla.testlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmailClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_class);
    }

    public void botonVolver(View view) {
        Intent index = new Intent(this, IndexTab.class);
        startActivity(index);
    }
}
