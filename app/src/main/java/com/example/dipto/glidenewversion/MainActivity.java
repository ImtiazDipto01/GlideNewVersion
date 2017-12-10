package com.example.dipto.glidenewversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    ImageView imageView ;
    String imagelink = "http://programmerimtiaz.000webhostapp.com/PhotoUploadWithText/uploads/pixza.jpg" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.loadingimageview) ;

        //MUST BE YOU HAVE TO USE GRADLE VERSION 27.0.0 BUT NOT 26.0.0 SERISE
        Glide.with(MainActivity.this).load(imagelink).apply(RequestOptions.placeholderOf(R.drawable.default_profile_pic).dontAnimate()).into(imageView);
    }
}
