package com.example.joseeduardo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    Button ingresar;
    EditText usuario,contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar =(Button)findViewById(R.id.ingresar);
        usuario = (EditText)findViewById(R.id.nomb_pers);
        contraseña = (EditText)findViewById(R.id.contra_pers);




    }

    public void ingresar(View v) {
        switch (v.getId()) {
            case R.id.ingresar:

                if (usuario.getText().toString().equals("user") && contraseña.getText().toString().equals("user123")) {
                    Intent intent = new Intent(this, interface_amigos.class);
                    startActivity(intent);

                } else {
                    Toast toast;
                    toast = Toast.makeText(this, "La contraseña es incorrecta", Toast.LENGTH_SHORT);
                    toast.show();
                }

        }
    }






     @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
