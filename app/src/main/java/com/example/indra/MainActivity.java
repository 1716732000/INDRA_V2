package com.example.indra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar_Niveles(View view)
    {
        Intent mn = new Intent(this, clase_Niveles.class);
        startActivity(mn);
    }

    public void mostrar_Materias(View view)
    {
        Intent mm = new Intent(this, clase_Materias.class);
        startActivity(mm);
    }
}