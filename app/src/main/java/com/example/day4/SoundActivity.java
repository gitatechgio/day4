package com.example.day4;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SoundActivity extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
        mp=MediaPlayer.create(this,R.raw.unv);
    }

    public void ply(View view) {
        mp.start();
    }

    public void pau(View view) {
        mp.pause();
    }

    public void stp(View view) {
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.unv);
    }
}