package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase_Niveles_Listado extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveles_listado);
    }

    public void mostrar_inicio(View inicio)
    {
        Intent mi = new Intent(this, MainActivity.class);
        startActivity(mi);
    }

    public void mostrar_niveles(View listado)
    {
        Intent mn = new Intent(this, clase_Niveles.class);
        startActivity(mn);
    }
}
