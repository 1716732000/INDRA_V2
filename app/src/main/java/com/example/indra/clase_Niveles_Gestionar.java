package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase_Niveles_Gestionar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveles_gestionar);
    }

    public void mostrar_niveles_listado(View listado)
    {
        Intent mnl = new Intent(this, clase_Niveles.class);
        startActivity(mnl);
    }

    public void mostrar_niveles_gestionar(View view)
    {
        Intent mng = new Intent(this, clase_Niveles_Gestionar.class);
        startActivity(mng);
    }

    public void mostrar_inicio(View inicio)
    {
        Intent mi = new Intent(this, MainActivity.class);
        startActivity(mi);
    }

    public void mostrar_niveles(View niveles)
    {
        Intent mn = new Intent(this, clase_Niveles.class);
        startActivity(mn);
    }
}
