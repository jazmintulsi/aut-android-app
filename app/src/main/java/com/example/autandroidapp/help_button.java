package com.example.autandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.autandroidapp.*;

public class help_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_button);

        Intent intent = getIntent();
    }

    public void faqActivity(View view)
    {
        Intent intent = new Intent(this, faq_button.class);
        startActivity(intent);
    }

    public void autcontactActivity(View view)
    {
        Intent intent = new Intent(this, autcontact_button.class);
        startActivity(intent);
    }

    public void contactdevActivity(View view)
    {
        Intent intent = new Intent(this, contactdev_button.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_home:
                Intent homePageIntent= new Intent(this, MainActivity.class);
                this.startActivity(homePageIntent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
