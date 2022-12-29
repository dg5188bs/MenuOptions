package com.example.menuoptions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Linear layout.
     */
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.color);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
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
        return true;
    }

    /**
     * Next.
     *
     * @param view the view
     */
    public void next(View view) {
        Intent gi = new Intent(this,MainActivity2.class);
        startActivity(gi);
    }


}