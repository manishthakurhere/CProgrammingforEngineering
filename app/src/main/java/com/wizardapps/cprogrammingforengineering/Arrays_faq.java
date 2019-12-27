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

public class Arrays_faq extends AppCompatActivity{

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
        actionBar.setTitle("Arrays");
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

        question.add("What is the meaning of base address of the array?");
        question.add("Can we declare array size as a negative number?");
        question.add("What is th meaning of anonymous array?");
        question.add("What are multidimensional arrays?");
        question.add("How can arrays be passed to a user defined function");



        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();



        one.add("The starting address of the array is called as the base address of the array.");

        two.add("No. We cannot declare the negative integer as an array size.\n" +
                "\n" +
                "If we declare, there will be no compile-time error.\n" +
                "\n" +
                "However, we will get NegativeArraySizeException at run time.");


        three.add("An array without a reference is called anonymous array.");

        four.add("Multidimensional arrays are capable of storing data in a two or more dimensional structure.");

        five.add("Pass to it a pointer that will point to the array first element in memory.");








        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);






    }



}
