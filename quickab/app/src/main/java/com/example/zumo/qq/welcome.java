package com.example.zumo.qq;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.widget.TextView;

public class welcome extends Activity {
          public static int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
               Intent intent=new Intent(welcome.this, Startpage.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}


