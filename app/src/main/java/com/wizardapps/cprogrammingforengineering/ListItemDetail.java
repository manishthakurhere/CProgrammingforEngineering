package com.wizardapps.cprogrammingforengineering;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ListItemDetail extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);


        ActionBar actionBar=getSupportActionBar();
        assert getSupportActionBar() != null;
        actionBar.setTitle("Programs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        // Here we turn your stringi.xml in an array
        String[] myKeys = getResources().getStringArray(R.array.naya);

        String[] myHeads = getResources().getStringArray(R.array.head);

        TextView myTextView = (TextView) findViewById(R.id.my_textview);
        myTextView.setText(myKeys[position]);


        TextView HeadingTextView = (TextView) findViewById(R.id.heading);
        HeadingTextView.setText(myHeads[position]);

        myTextView.setMovementMethod(new ScrollingMovementMethod());


    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }



}