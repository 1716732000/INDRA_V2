package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase_Niveles extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveles);
    }

    public void mostrar_Inicio(View view)
    {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void mostrar_niveles_listado(View listado)
    {
        Intent mnl = new Intent(this, clase_Niveles_Listado.class);
        startActivity(mnl);
    }

    public void mostrar_niveles_gestionar(View view)
    {
        Intent ng = new Intent(this, clase_Niveles_Gestionar.class);
        startActivity(ng);
    }


}
