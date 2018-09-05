package com.zuhair.nasri.finalcases;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare the variables here
    Button medicineS;
    Button medicineL;
    Button surgeryS;
    Button surgeryL;
    Button paedS;
    Button paedL;
    Button obsS;
    Button obsL;
    Button gyneS;
    Button gyneL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize all variables
        medicineS = findViewById(R.id.medicineS);
        medicineL = findViewById(R.id.medicineL);
        surgeryS = findViewById(R.id.surgeryS);
        surgeryL = findViewById(R.id.surgeryL);
        paedS = findViewById(R.id.paedS);
        paedL = findViewById(R.id.paedL);
        obsS = findViewById(R.id.obsS);
        obsL = findViewById(R.id.obsL);
        gyneS = findViewById(R.id.gyneS);
        gyneL = findViewById(R.id.gyneL);


//set onClickListner for medicineS
        medicineS.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                //send the text on the button as stringExtra "SECTION"
                sendSection.putExtra("SECTION", medicineS.getText().toString());

                //send 1 for medicineS as intExtra "SECTION_NUMBER"
                sendSection.putExtra("SECTION_NUMBER",1);
                startActivity(sendSection);

            }
        });

 //set onClickListner for medicineL
        medicineL.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

               //send text on the button as extra
                sendSection.putExtra("SECTION", medicineL.getText().toString());

                //send 2 for medicineL
                sendSection.putExtra("SECTION_NUMBER",2);

                startActivity(sendSection);

            }
        });
//set onClickLisner for surgeryS
        surgeryS.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", surgeryS.getText().toString());

                startActivity(sendSection);

            }
        });
//set onClickLisner for surgeryL
        surgeryL.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", surgeryL.getText().toString());

                startActivity(sendSection);

            }
        });
//set onClickLisner for paedS
        paedS.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", paedS.getText().toString());

                startActivity(sendSection);

            }
        });
 //set onClickListner for paedL
        paedL.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", paedL.getText().toString());

                startActivity(sendSection);

            }
        });

        //set onClickListner for obaS
        obsS.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", obsS.getText().toString());

                startActivity(sendSection);

            }
        });

        //set onClickListner for obsL
        obsL.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", obsL.getText().toString());

                startActivity(sendSection);

            }
        });

        //set onClickListner for gyneS
        gyneS.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", gyneS.getText().toString());

                startActivity(sendSection);

            }
        });
        //set onClickListner for gyneL
        gyneL.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent sendSection = new Intent(MainActivity.this, ListActivity.class);

                sendSection.putExtra("SECTION", gyneL.getText().toString());

                startActivity(sendSection);

            }
        });

    }
}
