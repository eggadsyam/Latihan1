package com.egga.layouting;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    TextView teks, btn;
    EditText name;
    Button btnSend;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //customfont
        teks = (TextView) findViewById(R.id.teksnama);
        Typeface custom = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        teks.setTypeface(custom);

        teks = (TextView) findViewById(R.id.teksumur);
        Typeface custom2 = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        teks.setTypeface(custom2);

        //customedittext
        teks = (EditText) findViewById(R.id.edittextnama);
        Typeface customedittext = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        teks.setTypeface(customedittext);

        teks = (EditText) findViewById(R.id.edittextumur);
        Typeface customedittext2 = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        teks.setTypeface(customedittext2);

        //custombutton
        btn = (Button) findViewById(R.id.buttonselanjutnya);
        Typeface custombtn = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        btn.setTypeface(custombtn);

        name = (EditText) findViewById(R.id.edittextnama);
        btnSend = (Button) findViewById(R.id.buttonselanjutnya);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = name.getText().toString();
                    if (nama != null && nama != ""){
                        Intent i = new Intent(Main3Activity.this, Main4Activity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                }

            }
        });

    }
}
