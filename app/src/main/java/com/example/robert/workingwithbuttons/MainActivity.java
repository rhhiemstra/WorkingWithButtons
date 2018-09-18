package com.example.robert.workingwithbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clickButtonEn;
    Button clickButtonFr;
    Button clickButtonSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtVar = (TextView) findViewById(R.id.txtId);
        final ImageView imgVar = (ImageView) findViewById(R.id.flagImg);
       clickButtonEn = (Button) findViewById(R.id.english);
       clickButtonSp = (Button) findViewById(R.id.spanish);
       clickButtonFr = (Button) findViewById(R.id.english);

       

        clickButtonSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Hola Android");
                imgVar.setImageResource(R.drawable.mexico);

            }
        });

        clickButtonEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Hello Android");
                imgVar.setImageResource(R.drawable.american);
                clrBtn("Fr");
            }
        });



        clickButtonFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Bonjour Android");
                imgVar.setImageResource(R.drawable.french);
                clrBtn("Fr");
            }
        });

    }
    public void clrBtn(String str){
        int redClr=android.R.color.holo_red_light;
        int grayClr=android.R.color.darker_gray;
        int clrEn = grayClr;
        int clrFR = grayClr;
        int clrSp = grayClr;

        if(str.equals("En")){
            clrEn = redClr;
        }
        else if(str.equals("Fr")){
            clrFR = redClr;
        }
        else if(str.equals("Sp")){
            clrSp = redClr;
        }


    }

}
