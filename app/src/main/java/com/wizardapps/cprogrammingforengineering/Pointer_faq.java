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

public class Pointer_faq extends AppCompatActivity{

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
        actionBar.setTitle("Pointers");
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

        question.add("What is a pointer?");
        question.add("What is a pointer on pointer?");
        question.add("What is a NULL pointer?");
        question.add("What is a dangling pointer?");
        question.add("What is a huge pointer?");
        question.add("Difference between pass by reference and pass by value?");
        question.add("When do we use -> (arrow) operator.");
        question.add("What is wild pointer in C?");
        question.add("What is file pointer in C?");



        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();
        List<String> eight= new ArrayList<>();
        List<String> nine= new ArrayList<>();


        one.add("Pointers are variables which store the address of another variable.");

        two.add("It’s a pointer variable which can hold the address of another pointer variable. It de-refers twice to point to the data held by the designated pointer variable.");


        three.add("A pointer pointing to nothing is called NULL Pointer.");

        four.add("A pointer initially holding valid address, but later the held address is released or freed. Then such a pointer is called as dangling pointer.");

        five.add("Huge pointer is 32-bit long containing segment address and offset address.");

        six.add("Pass by reference passes a pointer to the value. This allows the caller to modify the variable directly.Pass by value gives a copy of the value to the caller. This allows the callee to modify the value without modifying the variable. ");

        seven.add("If the structure/union variable is a pointer variable, to access structure/union elements the arrow operator is used.");

        eight.add("Uninitialized pointers are called as wild pointers in C which points to arbitrary (random) memory location. This wild pointer may lead a program to behave wrongly or to crash.");

        nine.add("File pointer is a pointer which is used to handle and keep track on the files being accessed.");






        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);
        answer.put(question.get(5),six);
        answer.put(question.get(6),seven);
        answer.put(question.get(7),eight);
        answer.put(question.get(8),nine);



    }



}
