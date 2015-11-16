package com.example.aadam.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aadam on 12-Nov-15.
 */

//working with String data so put <String> here
class CustomAdapter extends ArrayAdapter<String>{

    //when you make an array adapter, you need to use a constructor

    //context is behind-the-scenes, background info
    public CustomAdapter(Context context, String[] foods) {
        //whenever you make a customAdapter class you're going to accept a string of type foods
        //for the layout, each row is gonna use custom_row
        super(context, R.layout.custom_row , foods);
    }

    //this is how to layout the strings passed in
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Inflate just means prepare for rendering, its how android deals with laying things out in your activity
        //context is just background information
        LayoutInflater martysInflater = LayoutInflater.from(getContext());

        //customView is going to be eq ual to one custom_row.xml
        View customView = martysInflater.inflate(R.layout.custom_row, parent, false);

        //reference to the string element (foods), the text and the image
        String singleFoodItem = getItem(position);
        TextView textItem = (TextView) customView.findViewById(R.id.martysText);
        ImageView imageItem = (ImageView) customView.findViewById(R.id.myImage);

        //change the text dynamically to each item froom string (foods)
        textItem.setText(singleFoodItem);
        //changes image dynamically (but only one image)
        imageItem.setImageResource(R.drawable.ok);

        return customView;

    }

}
