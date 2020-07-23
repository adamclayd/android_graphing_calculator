package com.adam.graphingcalculator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.adam.graphingcalculator.R;
import com.adam.graphingcalculator.views.Canvas2D;

import org.mariuszgromada.math.mxparser.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CanvasActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        String function = intent.getStringExtra(MainActivity.FUNCTION);



        Canvas2D canvas2D = new Canvas2D(this, function);

        linearLayout = findViewById(R.id.linearLayout);
        linearLayout.addView(canvas2D);

    }
}