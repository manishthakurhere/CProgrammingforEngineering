package com.wizardapps.cprogrammingforengineering;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Tips extends AppCompatActivity {

    int random_number;
    Button quote_button ;
    TextView quote_display;
    String myQuotes[] = {"Don't think programming is hard.Believe me it's not, just start getting your hands dirty on it. ",
            "Create your interest in Programming , and you'll feel like doing it all the time. ",
            "Be consistent and learn at least one new thing everyday about programming, i repeat AT LEAST one...WAIT, did you learn something new today?",
            "Don't worry if you don't understand,not everyone does , but don't leave it until you understand.",
            "Remember GOOGLE has every answer, make stack overflow your best friend.",
            "Make account on Competitive Programming sites like HackerRank ,HackerEarth, you'll start getting comfortable with languages.",
            "Practising on competitive Programming Sites,that'll help in logic building.",
            "It's not easy always,road is rough but worth it.",
            "Make your code clean and legible, it'll be helpful to find errors too.",
            "Put comments no matter what, you won't remember your code after an year.",
            "Some might be better than you, but never compare, just keep going.",
            "Humility will help you go ahead, arrogance will pull you down , always help others with programming,it'll help you develop a lot of qualities in you.",
            "Don't be on computer always, there's a world outside as well, remember the childhood phrase about Jack?",
            "Get enrolled into online Courses if they fascinate you, there are many amazing technologies out there.",
            "Don't look for shortcuts, learning process is long.",
            "Patience is  the key ,Don't panic if you take time to learn, just keep going.",
            "Girls are as good programmers as boys, sometimes better maybe, that's a fact.",
            "Don't just watch videos/tutorials, start doing side by side",
            "Projects are important and I can't stress it enough!",
            "Projects will not only give you a sense of achievement but also make you learn so many things.",
            "Mugging up codes for exams won't help in long run, it would be deceiving yourself.",
            "If a programming language fascinates you, go into details, there's lot to explore.",
            "Be a part of communities and help others when you get better eventually.",
            "Read codes of better programmers, it i'll give you a better idea about programming.",
            "Don't lose your calm, keep trying , you'll get through!",
            "You are never good enough, keep learning.",
            "Don't hesitate asking help from others,Programming is a rather social activity.",
            "Code everyday, Don't miss a single day, no matter what. Even a single program would do.",
            "Take breaks, Your minds works better when refreshed.",
            "Surround yourself with people who are learning the same technology, remember programming being a social activity.",
            "Teaching others will make your concepts clearer for sure,hands down.",
            "Ask questions from professors,they are there to help.",
            "Don't freak out if you aren't able to get a desirable output. You can always refer the net.",
            "Buy a good book if you are a book person, otherwise there are a hell lot of resources online.",
            "Always have the thirst for learning, from anyone , anywhere.",
            "Keep experimenting with you code , it's amazing.",
            "Keep the distractions away when studying, always do one task at a time.",
            "Learn how to google things, Google can be great help if exploited efficiently.",
            "Since programming demands concentration and focus, keep a long uninterrupted time of the day for programming.",
            "Start giving meaning names to variables so that you don't get confused later.",
            "Keep a backup of your files or code so that you don't have to start from scratch in case lost.",
            "Don't stay on easy problems , go increasing the difficulty level, challenge yourself and improvement will follow.",
            "Don't quit easily, seek help, devote time and kick the bugs out.!",
            "The official documentation of the language is the best recourse for learning online, do give it a try.",
            "Try to fathom the error messages so that you don't have a hard time fixing bugs.",
            "Find a good programmer , befriend them and draw inspiration, make them your mentor.",
            "Missed Semi-colon might be the bug in your program, check it out.",
            "Programming is like maths, comes only with everyday practice.",
            "Don't mug up, won't help in the long run , understand the concepts."


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        ActionBar actionBar=getSupportActionBar();  // Action Bar on the top
        assert getSupportActionBar() != null;
        actionBar.setTitle("Tips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        quote_button=(Button)findViewById(R.id.button);
        quote_display=(TextView)findViewById(R.id.show_tip);

        quote_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Random random=new Random();
                random_number = random.nextInt(myQuotes.length);
                quote_display.setText(myQuotes[random_number]);

            }
        });
    }


    @Override  //for back arrow on top left
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
