package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4,B5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=findViewById(R.id.btn_1);
        B1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1=new Intent(MainActivity.this,UC1Activity.class);
                startActivity(intent1);
            }
        });
        B2=findViewById(R.id.btn_2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,UC2Activity.class);
                startActivity(intent2);
            }
        });
        B3=findViewById(R.id.btn_3);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,UC3Activity.class);
                startActivity(intent3);
            }
        });
        B4=findViewById(R.id.btn_4);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,UC4Activity.class);
                startActivity(intent4);
            }
        });
        B5=findViewById(R.id.btn_5);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,UC5Activity.class);
                startActivity(intent5);
            }
        });

    }
}