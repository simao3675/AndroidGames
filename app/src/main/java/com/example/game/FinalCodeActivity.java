package com.example.game;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FinalCodeActivity extends AppCompatActivity {

    int myGuessNum, minCode, maxCode, answer;
    TextView fTxtMinCode, fTxtMaxCode, fTxtTilde;
    EditText fEdtMyGuess;
    Button fBtnOk;
    ImageView fImgGray;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_code_layout);

        fTxtMinCode = findViewById(R.id.txtMinCode);
        fTxtTilde = findViewById(R.id.txtTilde);
        fTxtMaxCode = findViewById(R.id.txtMaxCode);
        fEdtMyGuess = findViewById(R.id.edtMyGuess);
        fBtnOk = findViewById(R.id.btnOk);
        fImgGray = findViewById(R.id.imgGray);
        minCode = 1;
        maxCode = 1000;
        answer = (int)(Math.random()*1000+1);
    }

    public void pressOk(View view){

        myGuessNum = Integer.parseInt(fEdtMyGuess.getText().toString());
        if(myGuessNum<minCode || myGuessNum>maxCode){
            Toast.makeText(this,"輸入範圍錯誤",Toast.LENGTH_LONG).show();
            fEdtMyGuess.setText("");
        }
        else{
            if(myGuessNum<answer){
                myGuessNum+=1;
                Integer i = new Integer(myGuessNum);
                fTxtMinCode.setText(i.toString());
                minCode = myGuessNum;
                fEdtMyGuess.setText("");
            }
            else if(myGuessNum>answer){
                myGuessNum-=1;
                Integer i = new Integer(myGuessNum);
                fTxtMaxCode.setText(i.toString());
                maxCode = myGuessNum;
                fEdtMyGuess.setText("");
            }
            else{
                fTxtMinCode.setText("");
                fTxtMaxCode.setText("");
                fEdtMyGuess.setText("");
                fTxtTilde.setText("BINGO");
                fTxtTilde.setTextColor(Color.RED);
                fImgGray.setImageResource(R.drawable.bomb_background);
                Toast.makeText(this,"遊戲結束",Toast.LENGTH_LONG).show();
            }
        }

    }
}
