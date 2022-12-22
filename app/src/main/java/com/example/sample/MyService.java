package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyService extends AppCompatActivity implements View.OnClickListener{
    Button p,s;

    Intent obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service);

        p=findViewById(R.id.button10);
        s=findViewById(R.id.button11);
        p.setOnClickListener(this);
        s.setOnClickListener(this);

        obj=new Intent(MyService.this,MusicDemo.class);
    }

    @Override
    public void onClick(View view) {
        if (p==view){
            startService(obj);
        }
        else if (s==view)
        {
            stopService(obj);
        }

    }
}