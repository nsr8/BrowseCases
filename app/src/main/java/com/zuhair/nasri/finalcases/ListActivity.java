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
                String selectedTopic = listOfTopics.get(position);

                // TODO default toast. remove after completion
                //Toast.makeText(getApplicationContext(), "your selected topic is : " + selectedTopic, Toast.LENGTH_LONG).show();


                // TODO make an intent to display the topic in scroll view
                Intent sendTopic = new Intent(ListActivity.this, ScrollingActivity.class);

                //send text on the button as extra
                sendTopic.putExtra("SECTION", selectedTopic);

                startActivity(sendTopic);

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
            listOfTopics.add("Examine the cardiovascular system");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Medicine long cases")) {

            // medicine long case list
            // TODO add topic list
            listOfTopics.add("Infective mitral stenosis");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");


        }
        if (getIntent().getStringExtra("SECTION").equals("Surgery short cases")) {

            // surgery short case list
            // TODO add topic list
            listOfTopics.add("Goiters");


            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Surgery long cases")) {

            // surgery long case list
            // TODO add topic list
            listOfTopics.add("Benign prostatic hyperplasia");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");


        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics short cases")) {

            // paed short case list
            // TODO add topic list
            listOfTopics.add("Examine the respiratory system");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics long cases")) {

            // paed long case list
            // TODO add topic list
            listOfTopics.add("Cerebral palsy");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics short cases")) {

            // obs short case list
            // TODO add topic list
            listOfTopics.add("O negative mother");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics long cases")) {

            // obs long case list
            // TODO add topic list
            listOfTopics.add("Pregnancy induced hypertension");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology short cases")) {

            // gyne short case list
            // TODO add topic list
            listOfTopics.add("Uterine fibroid");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology long cases")) {

            // gyne long case list
            // TODO add topic list
            listOfTopics.add("Uterine prolapse");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }


    }


}
