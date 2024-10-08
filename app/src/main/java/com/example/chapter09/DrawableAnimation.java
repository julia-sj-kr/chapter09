package com.example.chapter09;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DrawableAnimation extends AppCompatActivity {
    AnimationDrawable rocketAnimation;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawableanimation);
        ImageView rocketImage=(ImageView) findViewById(R.id.rocket_image);
        rocketImage.setBackgroundResource(R.drawable.rocket);
        rocketAnimation=(AnimationDrawable) rocketImage.getBackground();
    }

    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            rocketAnimation.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}
