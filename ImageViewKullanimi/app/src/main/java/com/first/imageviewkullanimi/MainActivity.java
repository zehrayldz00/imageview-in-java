package com.first.imageviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private ImageView imgTest;
    private CheckBox checkBoxT;
    private RadioButton radioE, radioK;
    private Switch swTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgTest = (ImageView)findViewById(R.id.imageViewTest);
        checkBoxT = (CheckBox)findViewById(R.id.checkBoxText);
        radioE = (RadioButton)findViewById(R.id.radioBtnE);
        radioK = (RadioButton)findViewById(R.id.radioBtnK);
        swTest = (Switch)findViewById(R.id.switchTest);

        //----------IMAGEVIEW OZELLIKLERI----------

        //ImageView Arkaplan Rengini Degistirme:
        imgTest.setBackgroundColor(Color.RED);

        //ImageView setBackgroundResource ile arkaplan resmini degistirme:
        //imgTest.setBackgroundResource(R.drawable.girl);

        //ImageView setImageBitmap ile arkaplan resmini degistirme
        //Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.girl);
        //imgTest.setImageBitmap(bitmap);

        //ImageViewe yön ekleme:
        //imgTest.setRotation(33.5f);


        //----------CHECKBOX OZELLIKLERI---------

        // CheckBox setChecked Özelliği:
        //checkBoxT.setChecked(true);

        // CheckBox yazı değiştirme:
        //checkBoxT.setText("Test");

        // Size verme:
        checkBoxT.setTextSize(19);

        /*checkBoxT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    System.out.println("Toplam = " + (5+2));
                else
                    System.out.println("Toplama İşlemi Kapalı");
            }
        });*/


        //---------- RADIOBUTTON --------
        /*radioE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    System.out.println("Cinsiyet Erkek");
            }
        });
        radioK.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    System.out.println("Cinsiyet Kadın");
            }
        }); */



        //---------- Switch --------
        swTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    System.out.println("Ses Açık");
                else
                    System.out.println("Ses Kapalı");
            }
        });


    }
}