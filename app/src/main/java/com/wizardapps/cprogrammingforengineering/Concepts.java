package com.wizardapps.cprogrammingforengineering;

import android.content.Intent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concepts extends AppCompatActivity{
    ExpandableListView expandableListView;

    List  <String> concept;
    Map<String,List<String>> topics;
    ExpandableListAdapter listAdapter;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

            ActionBar actionBar=getSupportActionBar();  // Action Bar on the top
            assert getSupportActionBar() != null;
            actionBar.setTitle("Concepts");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        fillData();

        listAdapter=new MyexListadapter(this,concept,topics);
        expandableListView.setAdapter(listAdapter);


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(Concepts.this, concept.get(groupPosition) + " : " + topics.get(concept.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();


                final String selected = (String) listAdapter.getChild(
                        groupPosition, childPosition);

                // Switch case to open selected child element activity on child element selection.

                Intent intent;
                switch (selected) {
                        case "History":
                            intent = new Intent(Concepts.this, History.class);
                            startActivity(intent);
                            break;

                    case "Applications":
                        intent = new Intent(Concepts.this, Applications.class);
                        startActivity(intent);
                        break;

                    case "Advantages":
                        intent = new Intent(Concepts.this, Advantages.class);
                        startActivity(intent);
                        break;

                    case "Skeletal":
                        intent = new Intent(Concepts.this, skeletal.class);
                        startActivity(intent);
                        break;

                    case "Example":
                        intent = new Intent(Concepts.this, Example.class);
                        startActivity(intent);
                        break;

                    case "Syntax":
                        intent = new Intent(Concepts.this, Syntax.class);
                        startActivity(intent);
                        break;

                    case "Data Types":
                        intent = new Intent(Concepts.this, DataTypes.class);
                        startActivity(intent);
                        break;

                    case "Variables":
                        intent = new Intent(Concepts.this, Variables.class);
                        startActivity(intent);
                        break;

                    case "Storage Classes":
                        intent = new Intent(Concepts.this, StorageClass.class);
                        startActivity(intent);
                        break;

                    case "Arithmetic Operators":
                        intent = new Intent(Concepts.this, ArithmeticOperators.class);
                        startActivity(intent);
                        break;

                    case "Relational Operators":
                        intent = new Intent(Concepts.this, RelationalOperators.class);
                        startActivity(intent);
                        break;

                    case "Logical Operators":
                        intent = new Intent(Concepts.this, LogicalOperators.class);
                        startActivity(intent);
                        break;

                    case "Assignment Operators":
                        intent = new Intent(Concepts.this, AssignmentOperators.class);
                        startActivity(intent);
                        break;

                    case "Bitwise Operators":
                        intent = new Intent(Concepts.this, BitwiseOperators.class);
                        startActivity(intent);
                        break;

                    case "if_else,else,elseif Statements":
                        intent = new Intent(Concepts.this, If.class);
                        startActivity(intent);
                        break;

                    case "Nested if_else Statements":
                        intent = new Intent(Concepts.this, NestedIf.class);
                        startActivity(intent);
                        break;

                    case "Switch Statements":
                        intent = new Intent(Concepts.this, SwitchStatements.class);
                        startActivity(intent);
                        break;

                    case "Nested Switch Statements":
                        intent = new Intent(Concepts.this, NestedSwitch.class);
                        startActivity(intent);
                        break;

                    case "while loop":
                        intent = new Intent(Concepts.this, WhileLoop.class);
                        startActivity(intent);
                        break;

                    case "for loop":
                        intent = new Intent(Concepts.this, ForLoop.class);
                        startActivity(intent);
                        break;

                    case "nested loop":
                        intent = new Intent(Concepts.this, NestedLoop.class);
                        startActivity(intent);
                        break;

                    case "break_image Statement":
                        intent = new Intent(Concepts.this, BreakStatement.class);
                        startActivity(intent);
                        break;

                    case "continue Statement":
                        intent = new Intent(Concepts.this, ContinueStatement.class);
                        startActivity(intent);
                        break;

                    case "goto Statement":
                        intent = new Intent(Concepts.this, GotoStatement.class);
                        startActivity(intent);
                        break;

                    case "Infinite loop":
                        intent = new Intent(Concepts.this, InfiniteLoop.class);
                        startActivity(intent);
                        break;

                    case "Arrays":
                        intent = new Intent(Concepts.this, Array.class);
                        startActivity(intent);
                        break;

                    case "Strings":
                        intent = new Intent(Concepts.this, StringClass.class);
                        startActivity(intent);
                        break;

                    case "Pointers":
                        intent = new Intent(Concepts.this, Pointers.class);
                        startActivity(intent);
                        break;

                    case "Structures":
                        intent = new Intent(Concepts.this, Structures.class);
                        startActivity(intent);
                        break;

                    case "Unions":
                        intent = new Intent(Concepts.this, Unions.class);
                        startActivity(intent);
                        break;

                    case "Text Files":
                        intent = new Intent(Concepts.this, Files.class);
                        startActivity(intent);
                        break;


                    case "Opening,Closing files":
                        intent = new Intent(Concepts.this, OpeningClosingFiles.class);
                        startActivity(intent);
                        break;

                    case "Reading,Writing files":
                        intent = new Intent(Concepts.this, ReadingWritingFiles.class);
                        startActivity(intent);
                        break;

                    case "Binary Files":
                        intent = new Intent(Concepts.this,BinaryFiles.class);
                        startActivity(intent);
                        break;

                    case "Macros":
                        intent = new Intent(Concepts.this, Macros.class);
                        startActivity(intent);
                        break;

                    case "Static Memory Allocation":
                        intent = new Intent(Concepts.this, StaticMemoryAllotment.class);
                        startActivity(intent);
                        break;

                    case "Dynamic Memory Allocation":
                        intent = new Intent(Concepts.this, DynamicMemoryAllotment.class);
                        startActivity(intent);
                        break;

                }
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
    concept=new ArrayList<>();
    topics = new HashMap<>();

    concept.add("Introduction");
    concept.add("Structure of a Program");
    concept.add("Basic Syntax,Data types");
    concept.add("Variables,Storage classes");
    concept.add("Operators");
    concept.add("Decision Making");
    concept.add("Loops");
    concept.add("Arrays,Strings");
    concept.add("Pointers");
    concept.add("Structures,Unions");
    concept.add("File Handling");
    concept.add("Preprocessors");
    concept.add("Memory Allocation");

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


    one.add("History");
    one.add("Applications");
    one.add("Advantages");

    two.add("Skeletal");
    two.add("Example");

    three.add("Syntax");
    three.add("Data Types");

    four.add("Variables");
    four.add("Storage Classes");

    five.add("Arithmetic Operators");
    five.add("Relational Operators");
    five.add("Logical Operators");
    five.add("Assignment Operators");
    five.add("Bitwise Operators");

    six.add("if_else,else,elseif Statements");
    six.add("Nested if_else Statements");
    six.add("Switch Statements");
    six.add("Nested Switch Statements");

    seven.add("while loop");
    seven.add("for loop");
    seven.add("nested loop");
    seven.add("break Statement");
    seven.add("continue Statement");
    seven.add("goto Statement");
    seven.add("Infinite loop");

    eight.add("Arrays");
    eight.add("Strings");

    nine.add("Pointers");

    ten.add("Structures");
    ten.add("Unions");

    eleven.add("Text Files");
    eleven.add("Opening,Closing files");
    eleven.add("Reading,Writing files");
    eleven.add("Binary Files");

    twelve.add("Macros");


    thirteen.add("Static Memory Allocation");
    thirteen.add("Dynamic Memory Allocation");





    topics.put(concept.get(0),one);
    topics.put(concept.get(1),two);
    topics.put(concept.get(2),three);
    topics.put(concept.get(3),four);
    topics.put(concept.get(4),five);
    topics.put(concept.get(5),six);
    topics.put(concept.get(6),seven);
    topics.put(concept.get(7),eight);
    topics.put(concept.get(8),nine);
    topics.put(concept.get(9),ten);
    topics.put(concept.get(10),eleven);
    topics.put(concept.get(11),twelve);
    topics.put(concept.get(12),thirteen);







}


}
