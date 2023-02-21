package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clase_Materias_Gestionar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias_gestionar);
    }

    public void mostrar_inicio(View inicio)
    {
        Intent mi = new Intent(this, MainActivity.class);
        startActivity(mi);
    }

    public void mostrar_materias(View Materias)
    {
        Intent mm = new Intent(this, clase_Materias.class);
        startActivity(mm);
    }


}
