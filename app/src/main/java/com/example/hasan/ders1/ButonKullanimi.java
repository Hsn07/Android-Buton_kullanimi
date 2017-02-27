package com.example.hasan.ders1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.Toast;

public class ButonKullanimi extends AppCompatActivity {
    Button buton1,buton2;
    RotateAnimation ra=new RotateAnimation(0.0f,360.0f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buton_kullanimi);
        buton1=(Button)findViewById(R.id.button1);
        buton2=(Button)findViewById(R.id.button8);
        ra.setDuration(500);
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ButonKullanimi.this, "Butona dokunuldu", Toast.LENGTH_SHORT).show();

            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buton2.startAnimation(ra);
            }
        });
    }
}
