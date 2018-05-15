package com.ashwani.simpledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView logoImage;

    TextView tvOne,tvTwo,tvThree;

    Animation zoomIn, buttonsZoomIn;

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImage = (ImageView)findViewById(R.id.logo);
        tvOne = (TextView) findViewById(R.id.tvOne);
        tvTwo = (TextView) findViewById(R.id.tvTwo);
        tvThree = (TextView) findViewById(R.id.tvThree);

        zoomIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_in);

        logoImage.setVisibility(View.GONE);

        zoomIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                logoImage.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                tvOne.setVisibility(View.VISIBLE);
                tvOne.startAnimation(buttonsZoomIn);

                tvTwo.setVisibility(View.VISIBLE);
                tvTwo.startAnimation(buttonsZoomIn);

                tvThree.setVisibility(View.VISIBLE);
                tvThree.startAnimation(buttonsZoomIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
                logoImage.setVisibility(View.VISIBLE);
                logoImage.startAnimation(zoomIn);

        //for buttons
        buttonsZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_in);

        buttonsZoomIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {




            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

  /*  public TextView returnView(int count){
        switch (count){
            case 1: return tvOne;
            case 2: return tvTwo;
            case 3: return tvThree;
            default: return null;
        }
    }*/
}
