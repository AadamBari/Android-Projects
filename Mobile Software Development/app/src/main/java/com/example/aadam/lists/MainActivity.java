package com.example.aadam.lists;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Tuna","Chicken", "Peas", "Carrots", "Potatoes" };


        //Use adapter to convert java code to list items that acitvity can use (on screen), array adapter converts array to list items
        //ListAdapter aadamsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, foods );
        ListAdapter aadamsAdapter = new CustomAdapter(this, foods);

        //get a reference to the list
        ListView myListView = (ListView ) findViewById(R.id.myListView);
        //what do you want to convert to list items? convert aadams adapter into myListView S(id of ListView)
        myListView.setAdapter(aadamsAdapter);


        //a listener to see whe you click on an item inside that list
        myListView.setOnItemClickListener(

                //A listener to see when you click an item in the list
                new AdapterView.OnItemClickListener() {

                    //setting up a listen on list, now list waiting for user to click something
                    //also gives information on which item clicked
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        //get value of item at tapped position
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.makeText(Context context, food, 5)).show();


                    }
                }

        );


    }


}
