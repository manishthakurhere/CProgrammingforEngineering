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

public class Loops_faq extends AppCompatActivity{

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
        actionBar.setTitle("Loops");
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

        question.add("What is a loop?");
        question.add("Differentiate between for loop and a while loop?");
        question.add("What are the types of loop control statements?");
        question.add("What is an infinite loop?");
        question.add("What is the difference between while and do-while loop");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();



        one.add("Loops are used in C programming to execute a block of code repeatedly until a specified condition is false");

        two.add("For executing a set of statements fixed number of times we use for loop while when the number of iterations to be performed is not known in advance we use while loop.");


        three.add("They are,\n" +
                "for\n" +
                "while\n" +
                "do-while\n");

        four.add("A loop that repeats indefinitely and never terminates is called an Infinite loop.");

        five.add("While loop is executed only when given condition is true. " +
                "Whereas, do-while loop is executed for first time irrespective of the condition. After executing while loop for first time, then condition is checked.\n");









        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);





    }



}
