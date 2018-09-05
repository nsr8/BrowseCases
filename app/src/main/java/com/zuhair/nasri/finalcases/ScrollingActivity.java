package com.zuhair.nasri.finalcases;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class ScrollingActivity extends Activity {

    //declare varialbes
    TextView tetTexttView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        // TODO get and display topic in test activity
        tetTexttView =findViewById(R.id.testText);
        tetTexttView.setText(getIntent().getStringExtra("TOPIC"));

    }
}
