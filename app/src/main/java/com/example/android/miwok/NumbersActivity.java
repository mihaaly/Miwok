package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // ArrayList of Word.java objects
        ArrayList<Word> words = new ArrayList<Word>();
        // Add Word objects to the ArrayList
        words.add(new Word(R.drawable.number_one, "lutti", "one"));
        words.add(new Word(R.drawable.number_two, "otiiko", "two"));
        words.add(new Word(R.drawable.number_three, "tolookosu", "three"));
        words.add(new Word(R.drawable.number_four, "oyyisa", "four"));
        words.add(new Word(R.drawable.number_five, "massokka", "five"));
        words.add(new Word(R.drawable.number_six, "temmokka", "six"));
        words.add(new Word(R.drawable.number_seven, "kenekaku", "seven"));
        words.add(new Word(R.drawable.number_eight, "kawinta", "eight"));
        words.add(new Word(R.drawable.number_nine, "wo'e", "nine"));
        words.add(new Word(R.drawable.number_ten, "na'aacha", "ten"));



//        // Create first Word.java object containing "lutti" and "one"
//        Word w1 = new Word("lutti", "one");
//        // Adds w1 object to ArrayList words
//        words.add(w1);

//        // ArrayList of English numbers
//        ArrayList<String> words = new ArrayList<String>();
//        words.add("one");
//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);



//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//        for (int index = 0; index < words.size(); index ++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }



//        int index = 0;
//
//        while (index < words.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//            index ++;
//        }



//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(index));
//        rootView.addView(wordView);
//
//        index += 1;
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(index));
//        rootView.addView(wordView2);
//
//        index ++;
//
//        TextView wordView3 = new TextView(this);
//        wordView3.setText(words.get(index));
//        rootView.addView(wordView3);
//
//        index ++;

//        // Array for English numbers
//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
//
//        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
//        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
//        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
//        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
//        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
//        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
//        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
//        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
//        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
//        Log.v("NumbersActivity", "Word at index 9: " + words[9]);
    }
}
