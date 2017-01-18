package com.questdot.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.questdot.materialanimationexample.R;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        overridePendingTransition(R.anim.slidein, R.anim.slideout);
        setContentView(R.layout.activity_transition);

    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        overridePendingTransition(R.anim.slidein, R.anim.slideout);
    }
}
