package com.example.zumo.qq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registration extends AppCompatActivity {

    public void Ride(View r){
        Intent intent= new Intent(this, rider_register.class);
        startActivity(intent);
    }
    public void Drive(View d){
        Intent intent= new Intent(this, driver_register.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
}
