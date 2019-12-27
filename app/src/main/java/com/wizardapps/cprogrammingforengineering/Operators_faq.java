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

public class Operators_faq extends AppCompatActivity{

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
        actionBar.setTitle("Operators");
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

        question.add("What is arithmetic operator in C?");
        question.add("What is the logical operator in C?");
        question.add(" What is the relational operator in C?");
        question.add("What is the bitwise operator in C?");
        question.add("What is assignment operator in C?");
        question.add("What is ternary operator used for?");
        question.add("What is the modulus operator?");
        question.add("What it the return value of a relational operator?");
        question.add("Why is && operator used?");

        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();
        List<String> eight= new ArrayList<>();
        List<String> nine= new ArrayList<>();

        one.add("Arithmetic operators apply standard mathematical operations to their operands.");

        two.add("Logical operators are mainly used to control program flow.\n" +
                "There are three logical operators\n" +
                "&& (AND) Operator\n" +
                "|| (OR) Operator\n" +
                "! (NOT) Operator");


        three.add("Relational operators are used to compare values of two expressions. Relational operators are binary operators because they require two operands to operate.");

        four.add("A bitwise operator is an operator used to perform bitwise operations on bit patterns or binary numerals that involve the manipulation of individual bits.");

        five.add("Assignment operators modify the value of the object.The value of the object on the right is assigned to the one on the left.");

        six.add("Ternary operators are used for decision making in place of conditional statements if and else. The ternary operator is an operator that takes three arguments. The first argument is a comparison argument, the second is the result upon a true comparison, and the third is the result upon a false comparison.");

        seven.add("The modulus operator outputs the remainder of a division operation. It makes use of the percentage (%) symbol.");

        eight.add("It returns zero if expression is true and zero if expression is false.");

        nine.add("The && is also referred to as AND operator. When using this operator, all conditions specified must be TRUE before the next action can be performed. ");







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
