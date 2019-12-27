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

public class Syntax_and_Data_types_faq extends AppCompatActivity {
    ExpandableListView expandableListView;

    List<String> question;
    Map<String,List<String>> answer;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

        ActionBar actionBar=getSupportActionBar();
        assert getSupportActionBar() != null;
        actionBar.setTitle("Syntax and Data Types");
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

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void fillData()
    {
        question=new ArrayList<>();
        answer = new HashMap<>();

        question.add(" What is the difference between a statement and a block?");
        question.add("How is a comment formed in C?");
        question.add("What are the entities whose values can be changed called?");
        question.add("Why was C language made?");
        question.add("What is a data type in C?");
        question.add("What are the different data types in C?");
        question.add("Can “int” data type be used to store the value 54321? Why?");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();


        one.add("A statement is a single C expression terminated with a semicolon. A block is a series of statements, the group of which is enclosed in curly-braces. ");

        two.add("Comments in C begin with a slash followed by an asterisk for multiple line comment and double slash for single line comment. Any text may then appear including newlines. The comment is finished with an asterisk followed by a slash. Example:\n" +
                "\n" +
                "  /* This is a comment */ \n");


        three.add("Variables are the data entities whose values can be changed. Constants have a fixed value.");

        four.add("C was designed to be a \"universal\" assembly language. It is used for producing system software such as operation systems, compilers/interpreters, device drivers, editors, DBMS's and similar things. ");

        five.add("C data types are defined as the data storage format that a variable can store a data to perform a specific operation.");

        six.add("The basic data types are int, char, and float. Int is used to declare variables that will be storing integer values. Float is used to store real numbers. Char can store individual character values.");

        seven.add("No. “int” data type is capable of storing values only from -32768 to 32767. ");







        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);
        answer.put(question.get(5),six);
        answer.put(question.get(6),seven);





    }


}
