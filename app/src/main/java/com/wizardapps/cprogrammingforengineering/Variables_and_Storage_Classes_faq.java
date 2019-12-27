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

public class Variables_and_Storage_Classes_faq extends AppCompatActivity {

    ExpandableListView expandableListView;

    List  <String> question;
    Map<String,List<String>> answer;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

        ActionBar actionBar=getSupportActionBar();
        assert getSupportActionBar() != null;
        actionBar.setTitle("Variables/Storage Classes");
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

        question.add("What are the entities whose values can be changed called?");
        question.add("Can a variable be both constant and volatile?");
        question.add("What are local static variables? What is their use?");
        question.add("What is variable initialization?");
        question.add("What are storage classes in C?");
        question.add("When should we use the register storage specifier?");
        question.add("What is the purpose of extern storage specifier?");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();


        one.add("Variables are the data entities whose values can be changed. Constants have a fixed value.");

        two.add("Yes, the constant means that the variable cannot be assigned a new value. The value can be changed by pointer. ");


        three.add("Local static variable are variables whose scope finishes after its block and they retain their values once they are initialized .");

        four.add("Initializing a variable means specifying an initial value to assign to it (i.e., before it is used at all).");

        five.add("A storage class defines the scope (visibility) and life-time of variables and/or functions within a C Program. \n" +
                " four different storage classes in a C program −\n" +
                "\n" +
                "auto\n" +
                "register\n" +
                "static\n" +
                "extern");

        six.add("If a variable is used most frequently then it should be declared using register storage specifier, then possibly the compiler gives CPU register for its storage to speed up the look up of the variable.");

        seven.add("The extern storage class specifier lets you declare objects that several source files can use. An extern declaration makes the described variable usable by the succeeding part of the current source file");







        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);
        answer.put(question.get(5),six);
        answer.put(question.get(6),seven);





    }


}
