package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ReportCard mike = new ReportCard(5, 7, 3, 2);
        TextView show = (TextView) findViewById(R.id.textViewTest);
        show.setText(mike.toString());
    }
}
