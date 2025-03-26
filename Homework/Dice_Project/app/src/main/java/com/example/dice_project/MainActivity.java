package com.example.dice_project;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random;
    private String tag = "MyTag";

    private ImageView j_imageview1;
    private ImageView j_imageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        random = new Random();
        j_imageview1 = findViewById(R.id.imageView1);
        j_imageview2 = findViewById(R.id.imageView2);
    }

    public void onClicked(View view) {

        //1. 랜덤숫자 생성하기
        int random1 = random.nextInt(6); // 0~5까지의 랜덤숫자를 생성
        int random2 = random.nextInt(6); // 0~5까지의 랜덤숫자를 생성

        Log.d(tag, "랜덤숫자1: "+random1); //Tag, String
        Log.d(tag, "랜덤숫자2: "+random2); //Tag, String

        //2. 이미지뷰 출력하기
        //ImageView1
        if(random1==0){
            j_imageview1.setImageResource(R.drawable.one);
        }
        else if(random1==1){
            j_imageview1.setImageResource(R.drawable.two);
        }
        else if(random1==2){
            j_imageview1.setImageResource(R.drawable.three);
        }
        else if(random1==3){
            j_imageview1.setImageResource(R.drawable.four);
        }
        else if(random1==4){
            j_imageview1.setImageResource(R.drawable.five);
        }
        else if(random1==5){
            j_imageview1.setImageResource(R.drawable.six);
        }


        //ImageView2
        if(random2==0){
            j_imageview2.setImageResource(R.drawable.one);
        }
        else if(random2==1){
            j_imageview2.setImageResource(R.drawable.two);
        }
        else if(random2==2){
            j_imageview2.setImageResource(R.drawable.three);
        }
        else if(random2==3){
            j_imageview2.setImageResource(R.drawable.four);
        }
        else if(random2==4){
            j_imageview2.setImageResource(R.drawable.five);
        }
        else if(random2==5){
            j_imageview2.setImageResource(R.drawable.six);
        }

    }
}