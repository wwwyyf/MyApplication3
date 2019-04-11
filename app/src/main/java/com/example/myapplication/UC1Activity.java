package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class UC1Activity extends AppCompatActivity {

    private Button B11,B12,B13,B14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        B14=findViewById(R.id.btn_14);
        B14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });

        B11=findViewById(R.id.btn_11);
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll=findViewById(R.id.ll1);
                ll.setOrientation(LinearLayout.HORIZONTAL);
                ll.setGravity(Gravity.CENTER);

            }
        });

        B12=findViewById(R.id.btn_12);
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll=findViewById(R.id.ll1);
                ll.setOrientation(LinearLayout.VERTICAL);
                ll.setGravity(Gravity.CENTER);

            }
        });

        B13=findViewById(R.id.btn_13);
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll=findViewById(R.id.ll1);
                ll.setGravity(Gravity.LEFT);
            }
        });
    }
}
