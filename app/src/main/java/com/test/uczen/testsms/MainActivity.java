package com.test.uczen.testsms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button przejscie, dzyn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przejscie = (Button) findViewById(R.id.b1);
        dzyn = (Button) findViewById(R.id.b2);

        przejscie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena1.class);
                startActivity(i);

            }


        });

        dzyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), scena2.class);
                startActivity(i);

            }


        });
    }
}
