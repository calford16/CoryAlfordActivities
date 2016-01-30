package com.example.cory.coryalfordactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayTwoMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_two_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message2 = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE);
        String message3 = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE2);
        TextView textView2 = (TextView) findViewById(R.id.message2);
        TextView textView3 = (TextView) findViewById(R.id.message3);

        textView2.setTextSize(40);
        textView2.setText(message2);
        textView3.setTextSize(40);
        textView3.setText(message3);
    }

}
