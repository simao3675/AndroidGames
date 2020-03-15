package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton mImgBtnPrs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgBtnPrs = findViewById(R.id.imgBtnPrs);
    }

    public void pressPrs(View view){
        Intent mIntent = new Intent();
        mIntent.setClass(MainActivity.this, RpsActivity.class);
        startActivity(mIntent);
    }

    public void pressBomb(View view){
        Intent mIntent = new Intent(this,FinalCodeActivity.class);
        startActivity(mIntent);
    }
}
