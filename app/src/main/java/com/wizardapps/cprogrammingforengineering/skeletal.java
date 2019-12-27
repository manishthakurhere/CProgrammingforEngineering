package com.wizardapps.cprogrammingforengineering;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class skeletal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skeletal);

        ActionBar actionBar=getSupportActionBar();  // Action Bar on the top
        assert getSupportActionBar() != null;
        actionBar.setTitle("Skeletal");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override  //for back arrow on top left
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
