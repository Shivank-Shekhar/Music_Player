package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView lv;
    String arr[]={"Service Demo"};
    Class c[]={MyService.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String>adp=new ArrayAdapter<String>
        (this, android.R.layout.simple_expandable_list_item_1,arr);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String str=arr[i];
                //Toast.makeText(getApplicationContext(),""+str,Toast.LENGTH_LONG).show();
                try {
                    Intent obj=new Intent(MainActivity.this,c[i]);
                    startActivity(obj);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

            }
        });
    }
}