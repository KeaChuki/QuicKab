package com.example.zumo.qq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class driver_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_register);
    }

    public void Drive(View v)
    {
        if(v.getId()==R.id.drivebt)
        {

            EditText name=(EditText)findViewById(R.id.namefield);
            EditText plate=(EditText)findViewById(R.id.plate);
            EditText pnum=(EditText)findViewById(R.id.number);
            EditText pas1=(EditText)findViewById(R.id.pass1);
            EditText pas2=(EditText)findViewById(R.id.pass2);

            String namestr=name.getText().toString();
            String platestr=plate.getText().toString();
            String pnumstr=pnum.getText().toString();
            String pas1str=pas1.getText().toString();
            String pas2str=pas2.getText().toString();

            //checking pass1=pass2

            Intent i=new Intent(this, homepage.class);
            startActivity(i);

            if(!pas1str.equals(pas2str))
            {
                //pop up message

                Toast pass=Toast.makeText(driver_register.this,"Password deos not match", Toast.LENGTH_SHORT);
                pass.show();
            }

        }
    }
}
