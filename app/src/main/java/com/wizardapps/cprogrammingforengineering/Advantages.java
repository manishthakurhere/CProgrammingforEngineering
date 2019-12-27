package com.wizardapps.cprogrammingforengineering;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Advantages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advantages);

        ActionBar actionBar=getSupportActionBar();  // Action Bar on the top
        assert getSupportActionBar() != null;
        actionBar.setTitle("Advantages of C");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override  //for back arrow on top left
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
