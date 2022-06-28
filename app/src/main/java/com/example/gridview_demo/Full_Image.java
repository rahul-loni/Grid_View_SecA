package com.example.gridview_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;

public class Full_Image extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);


        getSupportActionBar().setTitle("Full Screen");

        img=findViewById(R.id.full_image);


        Intent i=getIntent();
        int position=i.getExtras().getInt("id");

        ImageAdapter imageAdapter=new ImageAdapter(this);
        img.setImageResource(imageAdapter.image[position]);
    }
}