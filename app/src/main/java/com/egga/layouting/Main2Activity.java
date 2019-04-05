package com.egga.layouting;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView teks, teks2, btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //customfont
        teks=(TextView)findViewById(R.id.tekskodekeluarga);
        Typeface custom=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks.setTypeface(custom);

        teks2=(TextView)findViewById(R.id.teksketik);
        Typeface custom2=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2.setTypeface(custom2);

        teks2=(TextView)findViewById(R.id.teksbelum);
        Typeface custom3=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2.setTypeface(custom3);

        teks2=(TextView)findViewById(R.id.teksdengan);
        Typeface custom4=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2.setTypeface(custom4);
        TextView view=(TextView)findViewById(R.id.teksdengan);
        String aa="Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> kami";
        view.setText(Html.fromHtml(aa));

        //customedittext
        teks=(EditText)findViewById(R.id.edit1);
        Typeface customedittext=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks.setTypeface(customedittext);

        //custombutton
        btn=(Button)findViewById(R.id.buttonbeli);
        Typeface custombutton=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        btn.setTypeface(custombutton);

        btn=(Button)findViewById(R.id.buttonmasuk);
        Typeface custombutton2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        btn.setTypeface(custombutton2);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);

    }
}
