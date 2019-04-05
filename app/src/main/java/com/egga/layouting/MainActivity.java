package com.egga.layouting;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teks, btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //customfont
        teks=(TextView)findViewById(R.id.teksawal);
        Typeface custom=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks.setTypeface(custom);

        //custombutton
        btn=(Button)findViewById(R.id.button);
        Typeface custombtn=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        btn.setTypeface(custombtn);

    }

    public void Mulai(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
}
