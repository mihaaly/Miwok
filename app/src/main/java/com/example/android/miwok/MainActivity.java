/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when numbers category is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the view that shows family  category
        TextView family = (TextView) findViewById(R.id.family);

        // Set click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when family category is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the view that shows colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when colors category is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the view that shows phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when phrases category is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }

    public void toTestView(View v) {
        Intent goToTestView = new Intent(MainActivity.this, TestActivity.class);
        startActivity(goToTestView);
    }
}
