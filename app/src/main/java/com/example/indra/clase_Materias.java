package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase_Materias extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias);
    }

    public void mostrar_Inicio(View view)
    {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void mostrar_materias_listado(View listado)
    {
        Intent mml = new Intent(this, clase_Materias_Listado.class);
        startActivity(mml);
    }

    public void mostrar_materias_gestionar(View view)
    {
        Intent mmg = new Intent(this, clase_Materias_Gestionar.class);
        startActivity(mmg);
    }
}
