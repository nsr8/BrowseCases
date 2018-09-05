package com.zuhair.nasri.finalcases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    //declare variable
    TextView displaySection;

    // TODO: new array populated with the list of topics
    ArrayList<String> listOfTopics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //initialize displaySection gets the text in the button passed with intent and displays at the top
        displaySection = findViewById(R.id.displaySection);
        displaySection.setText(getIntent().getStringExtra("SECTION"));


        //declare and assign the variable displayLis
        ListView displayList = (ListView) findViewById(R.id.displayList);

        //assign the array of topics to listOfTopics
        listOfTopics = new ArrayList<String>();

        //call getTopics method. Method is created outside onCreate method
        getTopics();

        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfTopics);

        // Set The Adapter
        displayList.setAdapter(arrayAdapter);

        // register onClickListener to handle click events on each item
        displayList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                String selectedmovie = listOfTopics.get(position);
                Toast.makeText(getApplicationContext(), "your selected topic is : " + selectedmovie, Toast.LENGTH_LONG).show();
            }
        });


    }

    //this method gets the stringExtra passed with the intent
    //compares against the button
    //populates the lis with topics on that section
    void getTopics() {

       /* //Compare the strings works after commenting out // TODO remove this when working
        if (getIntent().getStringExtra("SECTION_NUMBER").equals("1")) {
            listOfTopics.add("case 1");
            listOfTopics.add("case 2");
            listOfTopics.add("case 3");

        }else if (getIntent().getStringExtra("SECTION_NUMBER").equals("2")){
            listOfTopics.add("surS 1");
            listOfTopics.add("srS 2");

        } else {*/


            listOfTopics.add("X-Men");
            listOfTopics.add("IRONMAN");
            listOfTopics.add("SPIDY");
            listOfTopics.add("NARNIA");
            listOfTopics.add("LIONKING");
            listOfTopics.add("AVENGERS");

       //missing closing bracket } here


    }


}
