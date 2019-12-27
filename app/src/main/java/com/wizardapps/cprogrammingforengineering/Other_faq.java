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

public class Other_faq extends AppCompatActivity{

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
        actionBar.setTitle("Other FAQs");
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

        question.add("Can we compile a program without main() function?");
        question.add("What is casting?");
        question.add("Can we have nested comments?");
        question.add("What is type checking?");
        question.add("Is C language case sensitive?");
        question.add("What is a stack?");
        question.add("Can a float variable be assigned to a long integer variable?");
        question.add("What is spaghetti programming?");
        question.add("What is a token?");
        question.add("What is a static function?");
        question.add("What are enumerations?");
        question.add("What is a recursion?");
        question.add("What is an algorithm?");
        question.add("What is data structure?");
        question.add("Is C language easy to learn?");


        List<String> one = new ArrayList<>();
        List<String> two= new ArrayList<>();
        List<String> three= new ArrayList<>();
        List<String> four= new ArrayList<>();
        List<String> five= new ArrayList<>();
        List<String> six= new ArrayList<>();
        List<String> seven= new ArrayList<>();
        List<String> eight= new ArrayList<>();
        List<String> nine= new ArrayList<>();
        List<String> ten= new ArrayList<>();
        List<String> eleven= new ArrayList<>();
        List<String> twelve= new ArrayList<>();
        List<String> thirteen= new ArrayList<>();
        List<String> forteen= new ArrayList<>();
        List<String> fifteen= new ArrayList<>();


        one.add("Yes, we can compile but not execute a C program without main() function.");

        two.add("It is a mechanism through which we can convert a data type to another.");


        three.add("No, nested comments are not allowed.");

        four.add("It is a mechanism in which the compiler checks if correct data types are used.");

        five.add("Yes, C is a case sensitive language.");

        six.add("Stack is an abstract data type with a predefined capacity. It is a simple data structure that allows adding and removing elements in a particular order.");

        seven.add("Yes, but fractional part will be lost.");

        eight.add("Spaghetti programming refers to codes that tend to get tangled and overlapped throughout the program. One should go about coding in a systematic way.");

        nine.add("A token is either a keyword, an identifier, a constant, a string literal, or a symbol.");

        ten.add("The “static” keyword before a function name makes it static. In C, access to static functions is restricted to the file where they are declared. ");

        eleven.add("Enumerations are list of integer constants with name.");

        twelve.add("Recursion is the process of invoking a function itself until some specific-condition occur");

        thirteen.add("An algorithm is a set of instructions required to solve a particular problem");

        forteen.add("A data structure is the organizing of data in the memory and provides a specific logical or mathematical model to access those data efficiently.");

        fifteen.add("It's super easy, just  put consistent efforts, you are gonna do great! \n All the best!");



        answer.put(question.get(0),one);
        answer.put(question.get(1),two);
        answer.put(question.get(2),three);
        answer.put(question.get(3),four);
        answer.put(question.get(4),five);
        answer.put(question.get(5),six);
        answer.put(question.get(6),seven);





    }



}
