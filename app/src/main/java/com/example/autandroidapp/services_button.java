package com.example.autandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.autandroidapp.*;

public class services_button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_button);

        Intent intent = getIntent();
    }

    public void medicalActivity(View view)
    {
        Intent intent = new Intent(this, medical_button.class);
        startActivity(intent);
    }

    public void childcareActivity(View view)
    {
        Intent intent = new Intent(this, childcare_button.class);
        startActivity(intent);
    }

    public void chineseActivity(View view)
    {
        Intent intent = new Intent(this, chinese_button.class);
        startActivity(intent);
    }

    public void counsellingActivity(View view)
    {
        Intent intent = new Intent(this, counselling_button.class);
        startActivity(intent);
    }

    public void disabilityActivity(View view)
    {
        Intent intent = new Intent(this, disability_button.class);
        startActivity(intent);
    }

    public void athleteActivity(View view)
    {
        Intent intent = new Intent(this, athlete_button.class);
        startActivity(intent);
    }

    public void careerActivity(View view)
    {
        Intent intent = new Intent(this, career_button.class);
        startActivity(intent);
    }

    public void internationalActivity(View view)
    {
        Intent intent = new Intent(this, international_button.class);
        startActivity(intent);
    }

    public void rainbowActivity(View view)
    {
        Intent intent = new Intent(this, rainbow_button.class);
        startActivity(intent);
    }

    public void maoristudActivity(View view)
    {
        Intent intent = new Intent(this, maoristud_button.class);
        startActivity(intent);
    }

    public void pacificActivity(View view)
    {
        Intent intent = new Intent(this, pacific_button.class);
        startActivity(intent);
    }

    public void religiousActivity(View view)
    {
        Intent intent = new Intent(this, religious_button.class);
        startActivity(intent);
    }

    public void studenthubActivity(View view)
    {
        Intent intent = new Intent(this, studenthub_button.class);
        startActivity(intent);
    }

    public void studiesupportActivity(View view)
    {
        Intent intent = new Intent(this, studiesupport_button.class);
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
