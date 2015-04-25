package com.example.luismurrillo.exemaps;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Luis Murrillo on 25/04/2015.
 */
public class SegundaActivity extends ActionBarActivity {


    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //Localizar los controles
        txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        ListView lista1 = (ListView) findViewById(R.id.miLista);


        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtSaludo.setText("Lugar:" + bundle.getString("NOMBRE"));

        // registra una accion para el evento click
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                /// Obtiene el valor de la casilla elegida
                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();

                // muestra un mensaje
                Toast.makeText( getApplicationContext(), "Haz hecho click en " + itemSeleccionado, Toast.LENGTH_SHORT).show();

            }
        });



    }




}
