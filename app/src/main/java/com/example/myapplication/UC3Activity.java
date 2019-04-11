package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

public class UC3Activity extends AppCompatActivity {
    private AdapterViewFlipper adapterViewFlipper;
    private Button BB1;
    private int img[]=new int[]{R.drawable.aaa_1,R.drawable.aaa_2,R.drawable.aaa_3,R.drawable.aaa_4,R.drawable.aaa_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        BB1=findViewById(R.id.btn_31);
        BB1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
        adapterViewFlipper=findViewById(R.id.id_avf);
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return img.length;
            }

            @Override
            public Object getItem(int i) {
                return img[i];
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                ImageView imageView=new ImageView(UC3Activity.this);
                imageView.setImageResource(img[i]);
                return imageView;
            }
        };
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setFlipInterval(500);
        adapterViewFlipper.setAutoStart(true);
    }
}
