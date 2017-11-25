package com.androidapp.slabyf.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private String words = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed feugiat, libero vitae vehicula sodales, sem massa posuere mi, non imperdiet felis erat id nunc. Suspendisse potenti. Nunc tempus vel elit vel consectetur. Quisque sagittis sit amet ex sit amet porta. Praesent vestibulum mollis bibendum. Praesent volutpat arcu et vestibulum auctor. Nulla massa purus, vulputate non vulputate a, ornare at mauris. Aliquam erat volutpat. Morbi ultrices lacus risus, at imperdiet mi vehicula vel. Proin bibendum purus leo. Fusce consectetur dolor tellus, at dignissim lectus aliquet et.\n" +
            "\n" +
            "Ut pellentesque urna in ex mattis ultricies. Sed a lorem eu mi tincidunt molestie. Mauris molestie nisi augue, sed aliquet nisl fermentum id. Vestibulum consequat tortor nec est semper fringilla. Sed semper volutpat fermentum. Suspendisse vel molestie tortor, in gravida nisl. Quisque porta velit elit, in efficitur ipsum finibus vel. Maecenas commodo lorem augue, sit amet euismod sapien rhoncus nec. Donec posuere blandit felis quis auctor. Aenean quis urna non dui bibendum sodales. In eget mauris sagittis, viverra velit in, venenatis libero. Praesent lobortis vel urna ut sollicitudin. Etiam vel nisl purus. Ut rhoncus lacus vitae blandit molestie. Ut sed magna bibendum lacus varius sagittis ac non urna.";

    private String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout keys = (LinearLayout) findViewById(R.id.keys);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        for (int i = 0; i < abc.length(); i++) {


            char c = abc.toCharArray()[i];
            Button b = new Button(this);
            b.setId(i);
            b.setText("" + c);
            b.setLayoutParams(lp);
            keys.addView(b);
        }

    }
}
