package com.egga.layouting;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView teks, btn, beres;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //customfont
        teks=(TextView)findViewById(R.id.teksberes);
        Typeface custom=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks.setTypeface(custom);

        //custombutton
        btn = (Button) findViewById(R.id.buttonoke);
        Typeface custombtn = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        btn.setTypeface(custombtn);

        //menampilkandata
        beres = (TextView) findViewById(R.id.teksberes);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        beres.setText("Beres! Sekarang "+nama+" udah bisa ngecek pengguna HP "+nama+" tiap hari buat bantu "+nama+" ngatur waktu");

    }
    public void Oke(View view) {
        Intent intent = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(intent);

    }
}
