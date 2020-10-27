package com.example.practicalscape;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;

    private Boolean direccio=true;

    private MediaPlayer mplayer;


    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator3;
    ObjectAnimator objectAnimator4;
    ObjectAnimator objectAnimator5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(ImageView) findViewById(R.id.image1);
        image2=(ImageView) findViewById(R.id.image2);
        image3=(ImageView) findViewById(R.id.image3);
        image4=(ImageView) findViewById(R.id.image4);
        image5=(ImageView) findViewById(R.id.image5);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mplayer = MediaPlayer.create(MainActivity.this,R.raw.queen);
                mplayer.start();

                if(direccio) {
                    direccio=false;
                    AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.frontanimator);
                    set.setTarget(v);
                    set.start();
                }else{
                    direccio=true;
                    AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.backanimator);
                    set.setTarget(v);
                    set.start();

                }

            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(direccio){
                direccio=false;
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.frontanimator_x);
                set.setTarget(v);
                set.start();
            }else{
                direccio=true;
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.backanimator_x);
                set.setTarget(v);
                set.start();

            }

            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}