package com.wizardapps.cprogrammingforengineering;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String_faq extends AppCompatActivity{

    ExpandableListView expandableListView;

    List  <String> question;
    Map<String,List<String>> answer;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

        ActionBar actionBar=getSupportActionBar();  // Action Bar on the top
        assert getSupportActionBar() != null;
        actionBar.setTitle("Strings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        fillData();

        listAdapter=new MyexListadapter(this,question,answer);
        expandableListView.setAdapter(listAdapter);


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {



                return true;
            }
        });
    }

    @Override  //for back arrow on top left
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public void fillData()
    {
        question=new ArrayList<>();
        answer = new HashMap<>();

        question.add("What is the difference between Strings and Arrays?");
        question.add("State the difference between strcmp and stricmp.");
        question.add("How do we determine the length of a string?");
        question.add("How do you convert strings to numbers in C?");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();



        one.add("String is a sequence of characters ending with NULL .it can be treated as a one-dimensional array of characters terminated by a NULL character.");

        two.add("strcmp() compares two strings; but it distinct the uppercase and lowercase letter. That means strcmp() does not ignore the case. On the other hand stricmp() compares two strings without regard to case. That means stricmp() ignores the case.");


        three.add("To get the length of a string value, use the function strlen(). ");

        four.add("One can write your own functions to do 'string to number' conversions");








        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);






    }



}
