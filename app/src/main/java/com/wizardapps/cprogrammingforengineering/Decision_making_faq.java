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

public class Decision_making_faq extends AppCompatActivity{

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
        actionBar.setTitle("Decision Making");
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

        question.add(" What are the decision control statements?");
        question.add("How can data be printed without using semi-colon?");
        question.add("What are the valid places for the keyword \'break\' to appear?");
        question.add("What does a break statement do?");
        question.add("What is the difference between a break and continue statement??");
        question.add("What happens if break statement is not used in switch case?");



        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();


        one.add("The 3 types of decision making control statements are,\n" +
                "\n" +
                "if statements\n" +
                "if else statements\n" +
                "nested if statements\n");

        two.add("printf can be put inside the switch statement.");


        three.add("Break can appear only in the looping control and switch statement. The purpose of the break is to bring the control out from the said blocks.");

        four.add("The break statement unconditionally ends the execution of the smallest enclosing while, do, for or switch statement.");

        five.add("The break terminates the loop. The continue branches immediately to the test portion of the loop. ");

        six.add("If we do not use break statement at the end of each case, program will execute all consecutive case statements until it finds next break statement or till the end of switch case block.");









        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);
        answer.put(question.get(5),six);





    }



}
