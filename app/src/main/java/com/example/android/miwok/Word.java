package com.example.android.miwok;

import android.content.Context;

/**
 * Created by m on 2017.05.11..
 * {@link Word} stands for a vocabulary word for learning.
 * It contains a Miwok word and its English equivalent.
 */

public class Word {

    // String value for the Miwok word
    private String mMiwokTranslation;

    // String value for the English word
    private String mDefaultTranslation;

    // Context of the app
    private Context mContext;

    /**
     * Constructs a new Word object with initial values.
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

//    /**
//     * Sets the mMiwokTranslation value.
//     * @param miwokWord the Miwok word.
//     */
//    public void setmMiwokTranslation (String miwokWord){
//        mMiwokTranslation = miwokWord;
//    }
//
//    /**
//     * Sets the mDefaultTranslation value.
//     * @param defaultWord the English equivalent.
//     */
//    public void setmDefaultTranslation (String defaultWord){
//        mDefaultTranslation = defaultWord;
//    }

    /**
     * Gets the Miwok word.
     * @return current mMiwokTranlation String value.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Gets the English equivalent.
     * @return current mDefaultTranslation String value.
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
