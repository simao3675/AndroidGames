package com.example.game;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RpsActivity extends AppCompatActivity {

    int tieNum, winNum, loseNum;
    String tieText, winText, loseText;
    ImageButton rImgBtnScissorsRight, rImgBtnRockRight, rImgBtnPaperRight;
    ImageView rImgViewPaperLeft;
    TextView rCalcWin, rCalcTie, rCalcLose;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rps_layout);

        rImgBtnScissorsRight = findViewById(R.id.imgBtnScissorsRight);
        rImgBtnRockRight = findViewById(R.id.imgBtnRockRight);
        rImgBtnPaperRight = findViewById(R.id.imgBtnPaperRight);
        rImgViewPaperLeft = findViewById(R.id.imgViewPaperLeft);
        rCalcWin = findViewById(R.id.calcWin);
        rCalcTie = findViewById(R.id.calcTie);
        rCalcLose = findViewById(R.id.calcLose);
        tieText = getResources().getString(R.string.tie);
        winText = getResources().getString(R.string.win);
        loseText = getResources().getString(R.string.lose);

    }
    //電腦出拳
    public int comPlay(){
        //1是剪刀, 2是石頭, 3是布
        return (int)(Math.random()*3+1);
    }
    public void pressScissors(View view){

        switch(comPlay()){
            case 1:
                rImgViewPaperLeft.setImageResource(R.drawable.scissors_left);
                tieNum+=1;
                rCalcTie.setText(tieText+tieNum);
                break;
            case 2:
                rImgViewPaperLeft.setImageResource(R.drawable.rock_left);
                loseNum+=1;
                rCalcLose.setText(loseText+loseNum);
                break;
            case 3:
                rImgViewPaperLeft.setImageResource(R.drawable.paper_left);
                winNum+=1;
                rCalcWin.setText(winText+winNum);
                break;
        }
    }

    public void pressRock(View view){
        switch(comPlay()){
            case 1:
                rImgViewPaperLeft.setImageResource(R.drawable.scissors_left);
                winNum+=1;
                rCalcWin.setText(winText+winNum);
                break;
            case 2:
                rImgViewPaperLeft.setImageResource(R.drawable.rock_left);
                tieNum+=1;
                rCalcTie.setText(tieText+tieNum);
                break;
            case 3:
                rImgViewPaperLeft.setImageResource(R.drawable.paper_left);
                loseNum+=1;
                rCalcLose.setText(loseText+loseNum);
                break;
        }
    }

    public void pressPaper(View view){
        switch(comPlay()){
            case 1:
                rImgViewPaperLeft.setImageResource(R.drawable.scissors_left);
                loseNum+=1;
                rCalcLose.setText(loseText+loseNum);
                break;
            case 2:
                rImgViewPaperLeft.setImageResource(R.drawable.rock_left);
                winNum+=1;
                rCalcWin.setText(winText+winNum);
                break;
            case 3:
                rImgViewPaperLeft.setImageResource(R.drawable.paper_left);
                tieNum+=1;
                rCalcTie.setText(tieText+tieNum);
                break;
        }
    }
}