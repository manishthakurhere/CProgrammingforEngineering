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

public class Structures_Unions_faq extends AppCompatActivity {


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
        actionBar.setTitle("Structures/Unions");
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

        question.add("What is difference between a structure and a union?");
        question.add("What is a self-referential structure?");
        question.add("What is a nested structure?");
        question.add(" What is the differences between structures and arrays?");
        question.add("What are bit fields?");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();


        one.add("There are two main differences between a structure and a union.\n" +
                "\n" +
                "(i)      A structure allocates separate memory space for each of its members.\n" +
                "\n" +
                "On the other hand a union allocates a single memory space for all of its members.\n" +
                "\n" +
                "(ii)    A structure can store value for all of its members at a time.\n" +
                "\n" +
                "But, a union can only store value for its one member at time. The union can only remember the last stored value of its member.");

        two.add("A structure containing the same structure pointer variable as its element is called as self-referential structure");


        three.add("A structure containing an element of another structure as its member is called nested structure.");

        four.add("Structure is a collection of heterogeneous data type but the array is a collection of homogeneous data types.");

        five.add("We can create integer structure members of differing size apart from non-standard size using bit fields. Such structure size is automatically adjusted with the multiple of integer size of the machine.");






        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);





    }

}
