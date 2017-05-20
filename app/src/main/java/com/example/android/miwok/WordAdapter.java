package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by m on 2017.05.13..
 *
 */

public class WordAdapter extends ArrayAdapter<Word> {

    // Constructor
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of Word.java objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter
        // (the super-class's constructor cf. beneath with the command 'super') is not
        // going to use the second argument (layout resource ID), so it can be any value.
        // Here, we used 0.
        // Instead the modified getView() will inflate the Views, see below...(R.layout.list_item)
        super(context, 0, words); // calls the super-class's constructor (i.e. ArrayAdapter's)
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        // set the list_item.xml as layout for (AdapterView, i.e. ListView) list items
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        // we use Word type return value as the current class declaration
        // (public class WordAdapter extends ArrayAdapter<Word>) expects Word type input as well
        Word currentWord = getItem(position); // getItem() method from ArrayAdapter class, gets index

        // Find the TextView in the list_item.xml layout for the miwok word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok word from the current Word object and set it on the miwokTextView
        miwokTextView.setText(currentWord.getMiwokTranslation()); // getMiwokTranslation() defined in Word.java

        // Find the TextView in the list_item.xml layout for the english word
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the english word from the current Word object and set it on the defaultTextView
        defaultTextView.setText(currentWord.getDefaultTranslation()); // getDefaultTranslation() defined in Word.java

        // Return the whole list item layout (listItemView) (containing 2 TextViews) so that
        // it can be shown in the ListView (word_list.xml   // listItemView will be added as a child to the AdapterView (i.e. now ListView)
        return listItemView;
    }
}
