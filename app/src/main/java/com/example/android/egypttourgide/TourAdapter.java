package com.example.android.egypttourgide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    /** Resource ID for the background color for this list of tours */
    private int mColorResourceID;

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Tour}s to be displayed.
     */
    public TourAdapter(Context context, ArrayList<Tour> words, int colorResourceID) {
        super(context, 0, words);
        this.mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Tour currentWord = getItem(position);

        // Find the TextView in the item_list.xml layout with the ID name_text.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text);
        // Get the name from the currentWord object and set this text on
        // the name TextView.
        nameTextView.setText(currentWord.getmNameTextViewID());

        // Find the TextView in the item_list.xml layout with the ID position_text.
        TextView positionTextView = (TextView) listItemView.findViewById(R.id.position_text);
        // Get the position text from the currentWord object and set this text on
        // the position TextView.
        positionTextView.setText(currentWord.getmPositionTextViewID());

        // Find the TextView in the item_list.xml layout with the ID history_text.
        TextView histortTextView = (TextView) listItemView.findViewById(R.id.history_text);
        // Get the history from the currentWord object and set this text on
        // the history TextView.

        if (currentWord.hasImage()) {
            histortTextView.setText(currentWord.getmHistoryTextID());
            histortTextView.setVisibility(View.VISIBLE);
        } else {
            histortTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image_view.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        imageView.setImageResource(currentWord.getmImageResourceID());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
