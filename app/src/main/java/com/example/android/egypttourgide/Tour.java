package com.example.android.egypttourgide;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */


public class Tour {

    /** name for the tour */
    private int mNameTextViewID;

    /** position for the tour */
    private int mPositionTextViewID;

    /** history for the tour */
    private int mHistoryTextID = NO_HISTORY_PROVIDED;

    /** image for the tour */
    private int mImageResourceID;

    /** Constant value that represents no image was provided for this tour */
    private static final int NO_HISTORY_PROVIDED = 0;


    /**
     * Create a new Tour object.
     *
     * @param nameTextViewID is the tour in a app for the name
     * @param positionTextViewID is the tour in the tourGide
     * @param historyTextID is the tour in the tourGide
     * @param imageResourceID is the resouce of image in the tourGide
     */
    public Tour(int nameTextViewID, int positionTextViewID, int historyTextID, int imageResourceID) {

        this.mNameTextViewID = nameTextViewID;
        this.mPositionTextViewID = positionTextViewID;
        this.mHistoryTextID = historyTextID;
        this.mImageResourceID = imageResourceID;

    }

    /**
     * Create a new Tour object.
     *
     * @param nameTextViewID is the tour in a app for the name
     * @param positionTextViewID is the tour in the tourGide
     * @param imageResourceID is the resouce of image in the tourGide
     */
    public Tour(int nameTextViewID, int positionTextViewID, int imageResourceID) {

        this.mNameTextViewID = nameTextViewID;
        this.mPositionTextViewID = positionTextViewID;
        this.mImageResourceID = imageResourceID;

    }
    /**
     * Get the name of the tour.
     */
    public int getmNameTextViewID() {
        return mNameTextViewID;
    }

    /**
     * Get the position of the tour.
     */
    public int getmPositionTextViewID() {
        return mPositionTextViewID;
    }

    /**
     * Get the image resource ID for this tour.
     */
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Get the history of the tour.
     */
    public int getmHistoryTextID() {
        return mHistoryTextID;
    }

    /**
     * Returns whether or not there is an history for this tour.
     */
    public boolean hasImage() {
        return mHistoryTextID != NO_HISTORY_PROVIDED;
    }
}
