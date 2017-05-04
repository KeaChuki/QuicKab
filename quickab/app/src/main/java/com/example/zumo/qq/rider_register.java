package com.example.zumo.qq;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class rider_register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_register);
    }

    public void Ride(View v) {
        if (v.getId() == R.id.ridebt) {
            EditText name = (EditText) findViewById(R.id.namefield);
            EditText cid = (EditText) findViewById(R.id.cid);
            EditText pnum = (EditText) findViewById(R.id.number);
            EditText pas1 = (EditText) findViewById(R.id.pass1);
            EditText pas2 = (EditText) findViewById(R.id.pass2);

            String namestr = name.getText().toString();
            String cidstr=cid.getText().toString();
           /* int cidstr = Integer.parseInt(cid.getText().toString());*/
            String pnumstr = pnum.getText().toString();
            String pass1str = pas1.getText().toString();
            String pass2str = pas2.getText().toString();

            Intent i=new Intent(this, homepage.class);
            startActivity(i);

            /*//cheching pass1=pass2
            if (namestr.equals("") || String.valueOf(cidstr).equals("") || pnumstr.equals("") || pass1str.equals("") || pass2str.equals("")) {
                Toast.makeText(this, "Oops! Make sure every detail is filled.", Toast.LENGTH_SHORT).show();
            } else if (cidstr < 11) {
                Toast.makeText(this, "CID number shouldn't be less than 11 digits.", Toast.LENGTH_SHORT).show();
            } else if (pass1str.length() < 6) {
                Toast.makeText(this, "Password should be minimum 6 digits.", Toast.LENGTH_SHORT).show();
            } else if (!pass1str.equals(pass2str)) {
                //pop up message
                Toast pass = Toast.makeText(rider_register.this, "Password deos not match.", Toast.LENGTH_SHORT);
                pass.show();
            }*/
        }
    }
}

