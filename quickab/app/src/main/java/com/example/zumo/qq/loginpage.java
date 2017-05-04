package com.example.zumo.qq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
    }

    public void login(View v)
    {
        if(v.getId()==R.id.login)
        {
            EditText a=(EditText)findViewById(R.id.unamefield);
            String str=a.getText().toString();

            Intent i=new Intent(this, homepage.class);
            i.putExtra("Username",str);
            startActivity(i);

        }

    }
    }

