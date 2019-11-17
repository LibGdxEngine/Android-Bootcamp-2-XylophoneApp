package com.devahmed.xylophoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1 , b2 , b3 , b4 , b5 ,b6 , b7;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create mediaplayer object to play sound on mobile
                mp = MediaPlayer.create(MainActivity.this , R.raw._1);
                //check if mediaplayer is playing sound or not
                //if so ... just stop it and play the new sound
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._2);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._3);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._4);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._5);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._6);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this , R.raw._7);
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp.start();
            }
        });


    }
}
