package com.example.sarah.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import java.util.ArrayList;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // getIntent grabs intent started in previous activity
        Intent intent = getIntent();

        ArrayList<String> messageArrayList = new ArrayList<String>();

        //getStringExtra get data from 1st activity
        messageArrayList = intent.getStringArrayListExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        // create a new stringBuilder to combine strings
        StringBuilder buildContinuous = new StringBuilder();
        // create an index & the thing we want to read
        for(String i : messageArrayList) {
            // append - attaches elements together doesn't ADD them together
            // add { container add more to it}
            buildContinuous.append(i);
        }
        // if this is put in the for loop the last element would only would show up
        // setting not displaying
        textView.setText(buildContinuous);

        //adding the text views
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        //Display the textView
        layout.addView(textView);
    }
}


// How to display the rest of the message and the results in a formatted sentence
// How to take multiple text fields in android studio and display them merged with text ??
// How to create an array list???