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
    TextView   displaySection;




        // TODO: check functionlaity of array adapter
        ArrayList<String> movies;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //initialize displaySection
        displaySection=findViewById(R.id.displaySection);
        displaySection.setText(getIntent().getStringExtra("SECTION"));





        // Get the reference of movies
        ListView moviesList=(ListView)findViewById(R.id.displayList);

        movies = new ArrayList<String>();
        getmovies();

        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, movies);
        // Set The Adapter
        moviesList.setAdapter(arrayAdapter);

        // register onClickListener to handle click events on each item
        moviesList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v,int position, long arg3)
            {
                String selectedmovie=movies.get(position);
                Toast.makeText(getApplicationContext(), "Movie Selected : "+selectedmovie,   Toast.LENGTH_LONG).show();
            }
        });





    }
   void getmovies()
    {
        movies.add("X-Men");
        movies.add("IRONMAN");
        movies.add("SPIDY");
        movies.add("NARNIA");
        movies.add("LIONKING");
        movies.add("AVENGERS");
    }



}
