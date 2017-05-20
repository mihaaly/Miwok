package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // ArrayList of Word.java objects
        ArrayList<Word> words = new ArrayList<Word>();
        // Add Word objects to the ArrayList
        words.add(new Word("mintu wuksus", "Where are you going?"));
        words.add(new Word("tinnə oyaase'nə", "What is your name?"));
        words.add(new Word("oyaaset...", "My name is..."));
        words.add(new Word("michəksəs?", "How are you feeling?"));
        words.add(new Word("kuchi achit", "I'm feeling good."));
        words.add(new Word ("əənəs'aa?", "Are you coming?"));
        words.add(new Word("həə'əənəm", "Yes, I'm coming."));
        words.add(new Word("əənəm", "I'm coming."));
        words.add(new Word("yoowutis", "Let's go."));
        words.add(new Word("ənni'nem", "Come here."));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list your file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
