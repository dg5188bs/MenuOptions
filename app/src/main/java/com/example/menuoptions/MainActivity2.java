package com.example.menuoptions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linearLayout = (LinearLayout) findViewById(R.id.color2);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        if(st.equals("red"))
        {
            linearLayout.setBackgroundColor(Color.RED);
        }
        if(st.equals("blue")){
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        if(st.equals("yellow")){
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        if(st.equals("green")){
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0, 0, 1000, "green");
        return true;
    }
    
    public void back(View view) {
        finish();
    }
}