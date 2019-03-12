package com.example.freewaresys.fraba;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                ImageView iv=(ImageView)findViewById(R.id.imageView);
                TextView tv=(TextView)findViewById(R.id.textView2);
                ProgressBar pb=(ProgressBar)findViewById(R.id.progressBar) ;
                Animation anifade=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                Animation move=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                iv.startAnimation(anifade);
                tv.startAnimation(move);
                pb.setVisibility(View.GONE);





            }
        }, SPLASH_DISPLAY_LENGTH);


    }
}
