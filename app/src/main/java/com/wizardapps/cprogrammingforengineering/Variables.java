package com.wizardapps.cprogrammingforengineering;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Variables extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables2);

        textView=(TextView)findViewById(R.id.variables);
        String variables="In simple terms a variable is a name to a memory location where you want to store some values.\n" +
                "\n" +
                "Its difficult to remember the actual memory location address value so using a variable is more convenient.\n\n" +
                "Following flow chart pre defined data types for which variables can be used: ";
        textView.setText(variables);
        textView.setMovementMethod(new ScrollingMovementMethod());


        ActionBar actionBar=getSupportActionBar();
        assert getSupportActionBar() != null;
        actionBar.setTitle("Variables");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
