package com.example.android.miwok;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;




public class NumbersActivity extends AppCompatActivity {

//    /** Handles playback of all the sound files */
//    private MediaPlayer mMediaPlayer;
//
//    /** Handles audio focus when playing a sound file */
//    private AudioManager mAudioManager;
//
//    /**
//     * This listener gets triggered whenever the audio focus changes
//     * (i.e., we gain or lose audio focus because of another app or device).
//     */
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
//            new AudioManager.OnAudioFocusChangeListener() {
//                @Override
//                public void onAudioFocusChange(int focusChange) {
//                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                        // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
//                        // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
//                        // our app is allowed to continue playing sound but at a lower volume. We'll treat
//                        // both cases the same way because our app is playing short sound files.
//
//                        // Pause playback and reset player to the start of the file. That way, we can
//                        // play the word from the beginning when we resume playback.
//                        mMediaPlayer.pause();
//                        mMediaPlayer.seekTo(0);
//                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                        // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
//                        mMediaPlayer.start();
//                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                        // The AUDIOFOCUS_LOSS case means we've lost audio focus and
//                        // Stop playback and clean up resources
//                        releaseMediaPlayer();
//                    }
//                }
//    };
//
//    /**
//     * This listener gets triggered when the {@link MediaPlayer} has completed
//     * playing the audio file.
//     */
//    private MediaPlayer.OnCompletionListener mCompletionListener =
//            new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer) {
//                    // Now that the sound file has finished playing, release the media player resources.
//                    releaseMediaPlayer();
//                }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}



//        // Create and setup the {@link AudioManager} to request audio focus
//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        // ArrayList of Word.java objects
//        final ArrayList<Word> words = new ArrayList<Word>();
//        // Add Word objects to the ArrayList
//        words.add(new Word(R.drawable.number_one, "lutti", "one", R.raw.number_one));
//        words.add(new Word(R.drawable.number_two, "otiiko", "two", R.raw.number_two));
//        words.add(new Word(R.drawable.number_three, "tolookosu", "three", R.raw.number_three));
//        words.add(new Word(R.drawable.number_four, "oyyisa", "four", R.raw.number_four));
//        words.add(new Word(R.drawable.number_five, "massokka", "five", R.raw.number_five));
//        words.add(new Word(R.drawable.number_six, "temmokka", "six", R.raw.number_six));
//        words.add(new Word(R.drawable.number_seven, "kenekaku", "seven", R.raw.number_seven));
//        words.add(new Word(R.drawable.number_eight, "kawinta", "eight", R.raw.number_eight));
//        words.add(new Word(R.drawable.number_nine, "wo'e", "nine", R.raw.number_nine));
//        words.add(new Word(R.drawable.number_ten, "na'aacha", "ten", R.raw.number_ten));


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


//        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
//        // adapter knows how to create layouts for each item in the list, using the
//        // simple_list_item_1.xml layout resource defined in the Android framework.
//        // This list item layout contains a single {@link TextView}, which the adapter will set to
//        // display a single word.
//        // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
//        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);
//
//        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in the
//        // word_list layout file.
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
//        // {@link ListView} will display list items for each word in the list of words.
//        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
//        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
//        listView.setAdapter(itemsAdapter);
//
//        // plays the corresponding audio file when a list item in ListView is clicked
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Release the media player if it currently exists because we are about to
//                // play a different sound file.
//                // So if I do not wait for the sound to complete and click on another list item...
//                releaseMediaPlayer();
//
//                // Get the {@link Word} object at the given position the user clicked on
//                Word currentWord = words.get(position);
//
//                // Request audio focus so in order to play the audio file. The app needs to play a
//                // short audio file, so we will request audio focus with a short amount of time
//                // with AUDIOFOCUS_GAIN_TRANSIENT.
//                int resultFocus = mAudioManager.requestAudioFocus(
//                        mOnAudioFocusChangeListener,
//                        AudioManager.STREAM_MUSIC,
//                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if (resultFocus == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    // We have audio focus now.
//
//                    // Create and setup the {@link MediaPlayer} for the audio resource associated
//                    // with the current word
//                    mMediaPlayer = MediaPlayer.create(NumbersActivity.this, currentWord.getAudioResourceId());
//
//                    // Start the audio file
//                    mMediaPlayer.start();
//
//                    // Setup a listener on the media player, so that we can stop and release the
//                    // media player once the sound has finished playing.
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//                }
//            }
//        });
//    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//    }

//    /**
//     * Clean up the media player by releasing its resources.
//     */
//    public void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//
//            // Regardless of whether or not we were granted audio focus, abandon it. This also
//            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }
//    }

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


