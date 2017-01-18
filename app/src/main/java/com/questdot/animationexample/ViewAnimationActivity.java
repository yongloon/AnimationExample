package com.questdot.animationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.questdot.materialanimationexample.R;

public class ViewAnimationActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);

        imageView =(ImageView)findViewById(R.id.imageView);


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.imageanimation);
        animation.setAnimationListener(this);
        imageView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
