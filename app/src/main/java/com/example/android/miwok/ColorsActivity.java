package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // ArrayList of Word.java objects
        final ArrayList<Word> words = new ArrayList<Word>();
        // Add Word objects to the ArrayList
        words.add(new Word(R.drawable.color_red, "wetetti", "red", R.raw.color_red));
        words.add(new Word(R.drawable.color_green, "chokokki", "green", R.raw.color_green));
        words.add(new Word(R.drawable.color_brown, "takaakki", "brown", R.raw.color_brown));
        words.add(new Word(R.drawable.color_gray, "topoppi", "gray", R.raw.color_gray));
        words.add(new Word(R.drawable.color_black, "kululli", "black", R.raw.color_black));
        words.add(new Word (R.drawable.color_white, "kelelli", "white", R.raw.color_white));
        words.add(new Word(R.drawable.color_dusty_yellow, "topissə", "dusty yellow",
                R.raw.color_dusty_yellow));
        words.add(new Word(R.drawable.color_mustard_yellow, "chiwittə", "mustard yellow",
                R.raw.color_mustard_yellow));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list you file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

        // plays the corresponding audio file when a list item in ListView is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentWord = words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this,
                        currentWord.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
