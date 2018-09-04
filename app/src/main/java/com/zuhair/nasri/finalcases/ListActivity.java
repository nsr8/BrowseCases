package com.zuhair.nasri.finalcases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    //declare variable
    TextView   displaySection;


    //test button
    Button testBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //initialize displaySection
        displaySection=findViewById(R.id.displaySection);
        displaySection.setText(getIntent().getStringExtra("SECTION"));


        //test button
        testBtn= findViewById(R.id.testBtn);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(ListActivity.this, ScrollingActivity.class);
                startActivity(testIntent);
            }
        });
    }
}
