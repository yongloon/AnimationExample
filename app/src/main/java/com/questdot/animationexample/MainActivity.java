package com.questdot.animationexample;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.questdot.materialanimationexample.R;


public class MainActivity extends AppCompatActivity {

    Button btnShared,btnTransition,btnView;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        btnShared= (Button)findViewById(R.id.btnShared);
        btnTransition= (Button)findViewById(R.id.btnTransition);
        btnView= (Button)findViewById(R.id.btnViewAnimation);
        imageView= (ImageView)findViewById(R.id.imageView);



        btnShared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SharedElementActivity.class);
                Bundle bundle = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(
                            MainActivity.this,
                            imageView,
                            imageView.getTransitionName())
                            .toBundle();
                    startActivity(intent,bundle);
                }


            }
        });

        btnTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                startActivity(intent);

            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ViewAnimationActivity.class);
                startActivity(intent);
            }
        });
    }


}
