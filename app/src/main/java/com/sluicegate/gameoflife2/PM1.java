package com.sluicegate.gameoflife2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

public class PM1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm1);

        setTitle("Proactive Minimalism");

        TextView link = (TextView) findViewById(R.id.textView5);
        String linkText = "For more info, visit the <a href='https://www.smashwords.com/books/view/351628'>Proactive Minimalism</a> web page.";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected void npsRedirect (View view) {


        Intent i = new Intent(getApplicationContext(), NPS.class);
        startActivity(i);

    }
}
