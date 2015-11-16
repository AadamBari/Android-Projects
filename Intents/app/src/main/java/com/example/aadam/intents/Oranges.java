package com.example.aadam.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Oranges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oranges);

        //put in onCreate because going to happen everytime activity created
        //getting extra info whenever launched, store in applesData
        Bundle applesData = getIntent().getExtras();

        if (applesData == null)
        {
            //if no data do this
            return;//dont edit text if no data
        }

        //put data from apple activity into new string
        String appleMessage = applesData.getString("appleMessage");

        //create variable which references output field
        final TextView orangeText = (TextView) findViewById(R.id.orangeText);

        //use setText to change text
        orangeText.setText(appleMessage);

    }

    public void onClick(View view){

        //create instance of intent class (how android switches between activities)
        //parameter is the activity you want to launch
        Intent i = new Intent(this, Apples.class);

        //launch activity
        startActivity(i);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_oranges, menu);
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
