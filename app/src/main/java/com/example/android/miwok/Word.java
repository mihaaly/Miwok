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

    // integer value containing the image ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

//    // integer for keeping track which constructor was used
//    // 0 stands for two-String input constructor
//    // 1 stands for two-String, one int input constructor (layout with image)
//    private int mConstructorType;

    // constant for keeping track if no image is needed in the layout
    private static final int NO_IMAGE_PROVIDED = -1;

    // Context of the app
    private Context mContext;

    /**
     * Constructs a new Word object with initial values.
     * Takes only two inputs, used for PhraseActivity.
     * @param miwokTranslation the word in Miwok language
     * @param defaultTranslation the word in English
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;

//        mConstructorType = 0;
    }

    /**
     * Constructs a new Word object with initial values.
     * Takes three inputs, used for activities that take in pictures.
     * @param imageResourceId drawable resource ID of the image associated with the word
     * @param miwokTranslation the word in Miwok language
     * @param defaultTranslation the word in English
     */
    public Word(int imageResourceId, String miwokTranslation, String defaultTranslation) {
        mImageResourceId = imageResourceId;
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
//        mConstructorType = 1;
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

    /**
     * Gets the image resourece ID
     * @return current mImageResourceId
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

//    /**
//     * Gets the value of mConstructorType
//     * @return mConstructorType
//     */
//    public int getConstructorType(){
//        return mConstructorType;
//    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
