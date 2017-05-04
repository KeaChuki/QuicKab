package com.example.zumo.qq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Startpage extends AppCompatActivity {

    public void Login(View v){
        Intent intent= new Intent(this, loginpage.class);
        startActivity(intent);
    }
    public void Register(View r){
        Intent intent= new Intent(this, registration.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_startpage);
    }
}
