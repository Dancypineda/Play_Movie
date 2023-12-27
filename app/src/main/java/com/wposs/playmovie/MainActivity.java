package com.wposs.playmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

       /* Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);

        ImageView logo = findViewById(R.id.icono);

        logo.setAnimation(animation1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Activity_login.class);
                startActivity(intent);
                finish();
            }
        }, 4000);*/

    }


    public void Login(View view) {
        Intent i = new Intent(this, Activity_login.class );
        startActivity(i);
    }
}