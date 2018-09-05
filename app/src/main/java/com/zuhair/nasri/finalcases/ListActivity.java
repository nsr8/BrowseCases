package com.zuhair.nasri.finalcases;

import android.content.Context;
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
        // TODO make the code more efficient by replacing the hard corded stings such as "Medicine short cases" with referene to R.id.......stings


        if (getIntent().getStringExtra("SECTION").equals("Medicine short cases")) {

            // medicine short cases list
            // TODO add topic list
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");
            listOfTopics.add("med s1");
            listOfTopics.add("med s2");
            listOfTopics.add("med s3");

        }
        if (getIntent().getStringExtra("SECTION").equals("Medicine long cases")) {

            // medicine long case list
            // TODO add topic list
            listOfTopics.add("med L1");
            listOfTopics.add("med l2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Surgery short cases")) {

            // surgery short case list
            // TODO add topic list
            listOfTopics.add("sur s1");
            listOfTopics.add("sur s2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Surgery long cases")) {

            // surgery long case list
            // TODO add topic list
            listOfTopics.add("sur L1");
            listOfTopics.add("sur l2");
            listOfTopics.add("sur lasrr");

        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics short cases")) {

            // paed short case list
            // TODO add topic list
            listOfTopics.add("paed s1");
            listOfTopics.add("paed s2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics long cases")) {

            // paed long case list
            // TODO add topic list
            listOfTopics.add("paed L1");
            listOfTopics.add("paed l2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics short cases")) {

            // obs short case list
            // TODO add topic list
            listOfTopics.add("obs s1");
            listOfTopics.add("obs s2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics long cases")) {

            // obs long case list
            // TODO add topic list
            listOfTopics.add("obs L1");
            listOfTopics.add("obs l2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology short cases")) {

            // gyne short case list
            // TODO add topic list
            listOfTopics.add("gyne s1");
            listOfTopics.add("gyne s2");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology long cases")) {

            // gyne long case list
            // TODO add topic list
            listOfTopics.add("med L1");
            listOfTopics.add("med l2");

        }


    }


}
