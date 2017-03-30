package com.test.uczen.testsms;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by uczen on 2017-03-30.
 */

public class scena2 extends AppCompatActivity {

    Button zadzwon, b1;
    EditText t1;
    TextView t10,t11;

    int flaga = 1;
    int zmienna;

    double liczba1 = 1.4646;
    double liczba2 = 5.4646;
    double wynik;



    String tekst = "Mam kota";
    String tablica[];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena2);

        ArrayList<String> nazwa = new ArrayList<String>();

        wynik = liczba1 * liczba2;

        b1 = (Button) findViewById(R.id.button2);
        t10 = (TextView) findViewById(R.id.textView);
        t11 = (TextView) findViewById(R.id.textView2);

        t10.setText(String.valueOf(wynik));

        Log.d("Wynik:", String.valueOf(wynik));

        zadzwon = (Button) findViewById(R.id.b1);
        t1 = (EditText) findViewById(R.id.editText3);

        zadzwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + t1.getText().toString()));
                if (ActivityCompat.checkSelfPermission(scena2.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;

                }
                startActivity(intent);

            }


        });
        b1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                nazwa.add(t11.getText().toString());
            }
        });

        Log.d("test", tekst);

        tablica = new String[]{"Kasia", "Marysia", "Zosia", "Agata"};

        for(int i=0; i<tablica.length; i++) {
         Log.d("Imiona:", tablica[i])   ;


        }

    }
}