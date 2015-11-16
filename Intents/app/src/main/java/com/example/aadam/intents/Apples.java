package com.example.aadam.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }


    //this is the method whenever user clicks the button
    //References to onClick yoke in XML file
    //View is responsible for drawing  an event handling.
    public void onClick(View view){

        //create instance of intent class (how android switches between activities)
        //parameter is the activity you want to launch
        Intent i = new Intent(this, Oranges.class);

        //get text from input
        //reference to input field
        final EditText applesInput = (EditText) findViewById(R.id.applesInput);

        //get the data entered
        //anything entered is converted to string and stored in userMessage variable
        String userMessage = applesInput.getText().toString();

        //transfer string to Oranges activity
        //parameters ("WhatToCallInformationBeingPassed", WhatInformationToPass)
        i.putExtra("appleMessage", userMessage);

        //launch activity
        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_apples, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
