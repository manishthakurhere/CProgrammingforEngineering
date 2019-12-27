package com.wizardapps.cprogrammingforengineering;

import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Faqs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        ListView listView = (ListView) findViewById(R.id.listView1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                if(position == 0) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), Syntax_and_Data_types_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 1) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Variables_and_Storage_Classes_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 2) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Operators_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 3) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Decision_making_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 4) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(),Loops_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 5) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Arrays_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 6) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), String_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 7) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Pointer_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 8) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Structures_Unions_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 9) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), File_Handeling_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 10) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Preprocessor_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 11) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Memory_Allocation_faq.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 12) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Other_faq.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
        ActionBar actionBar=getSupportActionBar();
        assert getSupportActionBar() != null;
        actionBar.setTitle("FAQs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
