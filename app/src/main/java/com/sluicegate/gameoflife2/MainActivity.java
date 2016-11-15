package com.sluicegate.gameoflife2;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.animation.Animator;
import android.graphics.drawable.AnimationDrawable;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;


public class MainActivity extends AppCompatActivity {

    public void randomize(View view) {

        Button randomButton = (Button) findViewById(R.id.button);

        randomButton.setEnabled(false);


        TextView proactiveMinimalism = (TextView) findViewById(R.id.PM1);
        TextView fortyeightTwelve = (TextView) findViewById(R.id.F82);
        TextView freezeTag = (TextView) findViewById(R.id.FT3);
        TextView twelveFortyEight = (TextView) findViewById(R.id.T48);
        TextView doEverything = (TextView) findViewById(R.id.DE0);
        TextView roomByRoom = (TextView) findViewById(R.id.RBR);
        TextView oneMinuteMonitor = (TextView) findViewById(R.id.OMM);
        TextView abcLoop = (TextView) findViewById(R.id.ABC);
        TextView eatTheFrog = (TextView) findViewById(R.id.ETF);

        TextView spatialRelations = (TextView) findViewById(R.id.SR0);
        TextView bigLoop = (TextView) findViewById(R.id.BL0);
        TextView shadowPuppet = (TextView) findViewById(R.id.SP0);
        TextView dropTheMic = (TextView) findViewById(R.id.DTM);
        TextView zenosParadox = (TextView) findViewById(R.id.ZP0);
        TextView phantomCall = (TextView) findViewById(R.id.PC0);

        TextView riverCity = (TextView) findViewById(R.id.RC0);
        TextView thirdStep = (TextView) findViewById(R.id.TS0);
        TextView geometricProgression = (TextView) findViewById(R.id.GP0);
        TextView observeThyself = (TextView) findViewById(R.id.OT0);


        int n = 25;

        ObjectAnimator anim = ObjectAnimator.ofFloat(proactiveMinimalism, "alpha", 0f, 1f);
        anim.setDuration(n);

        ObjectAnimator animf = ObjectAnimator.ofFloat(proactiveMinimalism, "alpha", 1f, 0f);
        animf.setDuration(n);

        ObjectAnimator anim2 = ObjectAnimator.ofFloat(fortyeightTwelve, "alpha", 0f, 1f);
        anim2.setDuration(n);

        ObjectAnimator anim2f = ObjectAnimator.ofFloat(fortyeightTwelve, "alpha", 1f, 0f);
        anim2f.setDuration(n);

        ObjectAnimator anim3 = ObjectAnimator.ofFloat(freezeTag, "alpha", 0f, 1f);
        anim3.setDuration(n);

        ObjectAnimator anim3f = ObjectAnimator.ofFloat(freezeTag, "alpha", 1f, 0f);
        anim3f.setDuration(n);

        ///

        ObjectAnimator anim4 = ObjectAnimator.ofFloat(twelveFortyEight, "alpha", 0f, 1f);
        anim4.setDuration(n);

        ObjectAnimator anim4f = ObjectAnimator.ofFloat(twelveFortyEight, "alpha", 1f, 0f);
        anim4f.setDuration(n);

        ObjectAnimator anim5 = ObjectAnimator.ofFloat(doEverything, "alpha", 0f, 1f);
        anim5.setDuration(n);

        ObjectAnimator anim5f = ObjectAnimator.ofFloat(doEverything, "alpha", 1f, 0f);
        anim5f.setDuration(n);

        ObjectAnimator anim6 = ObjectAnimator.ofFloat(roomByRoom, "alpha", 0f, 1f);
        anim6.setDuration(n);

        ObjectAnimator anim6f = ObjectAnimator.ofFloat(roomByRoom, "alpha", 1f, 0f);
        anim6f.setDuration(n);

        //

        ObjectAnimator anim7 = ObjectAnimator.ofFloat(oneMinuteMonitor, "alpha", 0f, 1f);
        anim7.setDuration(n);

        ObjectAnimator anim7f = ObjectAnimator.ofFloat(oneMinuteMonitor, "alpha", 1f, 0f);
        anim7f.setDuration(n);

        ObjectAnimator anim8 = ObjectAnimator.ofFloat(abcLoop, "alpha", 0f, 1f);
        anim8.setDuration(n);

        ObjectAnimator anim8f = ObjectAnimator.ofFloat(abcLoop, "alpha", 1f, 0f);
        anim8f.setDuration(n);

        ObjectAnimator anim9 = ObjectAnimator.ofFloat(eatTheFrog, "alpha", 0f, 1f);
        anim9.setDuration(n);

        ObjectAnimator anim9f = ObjectAnimator.ofFloat(eatTheFrog, "alpha", 1f, 0f);
        anim9f.setDuration(n);


        //

        ObjectAnimator anim10 = ObjectAnimator.ofFloat(spatialRelations, "alpha", 0f, 1f);
        anim10.setDuration(n);

        ObjectAnimator anim10f = ObjectAnimator.ofFloat(spatialRelations, "alpha", 1f, 0f);
        anim10f.setDuration(n);

        ObjectAnimator anim11 = ObjectAnimator.ofFloat(bigLoop, "alpha", 0f, 1f);
        anim11.setDuration(n);

        ObjectAnimator anim11f = ObjectAnimator.ofFloat(bigLoop, "alpha", 1f, 0f);
        anim11f.setDuration(n);

        ObjectAnimator anim12 = ObjectAnimator.ofFloat(shadowPuppet, "alpha", 0f, 1f);
        anim12.setDuration(n);

        ObjectAnimator anim12f = ObjectAnimator.ofFloat(shadowPuppet, "alpha", 1f, 0f);
        anim12f.setDuration(n);


        //
        ObjectAnimator anim13 = ObjectAnimator.ofFloat(dropTheMic, "alpha", 0f, 1f);
        anim13.setDuration(n);

        ObjectAnimator anim13f = ObjectAnimator.ofFloat(dropTheMic, "alpha", 1f, 0f);
        anim13f.setDuration(n);

        ObjectAnimator anim14 = ObjectAnimator.ofFloat(zenosParadox, "alpha", 0f, 1f);
        anim14.setDuration(n);

        ObjectAnimator anim14f = ObjectAnimator.ofFloat(zenosParadox, "alpha", 1f, 0f);
        anim14f.setDuration(n);

        ObjectAnimator anim15 = ObjectAnimator.ofFloat(phantomCall, "alpha", 0f, 1f);
        anim15.setDuration(n);

        ObjectAnimator anim15f = ObjectAnimator.ofFloat(phantomCall, "alpha", 1f, 0f);
        anim15f.setDuration(n);

//

        ObjectAnimator anim16 = ObjectAnimator.ofFloat(riverCity, "alpha", 0f, 1f);
        anim16.setDuration(n);

        ObjectAnimator anim16f = ObjectAnimator.ofFloat(riverCity, "alpha", 1f, 0f);
        anim16f.setDuration(n);

        ObjectAnimator anim17 = ObjectAnimator.ofFloat(geometricProgression, "alpha", 0f, 1f);
        anim17.setDuration(n);

        ObjectAnimator anim17f = ObjectAnimator.ofFloat(geometricProgression, "alpha", 1f, 0f);
        anim17f.setDuration(n);

        ObjectAnimator anim18 = ObjectAnimator.ofFloat(observeThyself, "alpha", 0f, 1f);
        anim18.setDuration(n);

        ObjectAnimator anim18f = ObjectAnimator.ofFloat(observeThyself, "alpha", 1f, 0f);
        anim18f.setDuration(n);

        ObjectAnimator anim19 = ObjectAnimator.ofFloat(thirdStep, "alpha", 0f, 1f);
        anim19.setDuration(n);

        ObjectAnimator anim19f = ObjectAnimator.ofFloat(thirdStep, "alpha", 1f, 0f);
        anim19f.setDuration(n);


        final AnimatorSet wheel = new AnimatorSet();
        wheel.playSequentially(anim, animf, anim2, anim2f, anim3, anim3f, anim4, anim4f, anim5, anim5f, anim6, anim6f, anim7, anim7f,
                anim8, anim8f, anim9, anim9f, anim10, anim10f, anim11, anim11f, anim12, anim12f,
                anim13, anim13f, anim14, anim14f, anim15, anim15f, anim16, anim16f, anim17, anim17f,
                anim18, anim18f, anim19, anim19f);


        wheel.start();


        wheel.addListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                wheel.start();
            }

        });
        wheel.start();
    }


    public void randomNumberChooser(View view) {

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(1);


        if (randomNumber == 0) {
            TextView proactiveMinimalism = (TextView) findViewById(R.id.PM1);
            proactiveMinimalism.animate().alpha(1f).setDuration(1);


            Intent i = new Intent(getApplicationContext(), PM1.class);
            startActivity(i);

        } else if (randomNumber == 1) {

            // Intent i = new Intent(getApplicationContext(), F82.class);
            // startActivity(i);

        } else if (randomNumber == 2) {

            //Intent i = new Intent(getApplicationContext(), FT3.class);
            // startActivity(i);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}