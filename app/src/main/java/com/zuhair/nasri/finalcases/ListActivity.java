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
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity {

    //declare variable
    TextView displaySection;
    ArrayList<String> listOfTopics;
    SearchView searchAll;
    ListView displayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //initialize displaySection gets the text in the button passed with intent and displays at the top
        displaySection = findViewById(R.id.displaySection);
        displaySection.setText(getIntent().getStringExtra("SECTION"));


        //declare and assign the variable displayLis
       displayList = (ListView) findViewById(R.id.displayList);

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

            // TODO to test template. delete after testing
            listOfTopics.add("Template");


            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Medicine long cases")) {

            // medicine long case list
            // TODO add topic list
            listOfTopics.add("Mitral stenosis");

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
            listOfTopics.add("Dysphagia");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");


        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics short cases")) {

            // paed short case list
            // TODO add topic list

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Pediatrics long cases")) {



            // paed long case list
            // TODO add topic list
            listOfTopics.add("Acute fever");
            listOfTopics.add("Prolonged fever");
            listOfTopics.add("Cyanotic heart diseases");
            listOfTopics.add("Asthma");
            listOfTopics.add("Pneumonia");
            listOfTopics.add("Blood and mucus diarrhea");
            listOfTopics.add("Nephrotic syndrome");
            listOfTopics.add("Hematuria");
            listOfTopics.add("Acute flaccid paralysis");
            listOfTopics.add("Meningitis");
            listOfTopics.add("Encephalitis");
            listOfTopics.add("Seizures");
            listOfTopics.add("Anemia");
            listOfTopics.add("Thalalasemia");
            listOfTopics.add("Neonatal sepsis");














            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics short cases")) {

            // obs short case list
            // TODO add topic list


            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Obstetrics long cases")) {

            // obs long case list
            // TODO add topic list

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology short cases")) {

            // gyne short case list
            // TODO add topic list

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }
        if (getIntent().getStringExtra("SECTION").equals("Gynecology long cases")) {

            // gyne long case list
            // TODO add topic list

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");

        }if (getIntent().getStringExtra("SECTION").equals("Psychiatry short cases")) {

            // psych short case list
            // TODO add topic list
            listOfTopics.add("Psychiatry short cases? Really?");

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");


        } if (getIntent().getStringExtra("SECTION").equals("Psychiatry long cases")) {

            // psych long case list
            // TODO add topic list

            //Add the last item to suggest a new topic
            listOfTopics.add("Suggest new topic");


            // TODO add the search function
        }if (getIntent().getStringExtra("SECTION").equals("Search")) {
            //check if the search FAB was clicked

            // hide the list of topics
            displayList.setVisibility(View.GONE);

            // create and display the searchView
            searchAll = findViewById(R.id.searchAll);
            searchAll.setVisibility(View.VISIBLE);

        }





}


}
