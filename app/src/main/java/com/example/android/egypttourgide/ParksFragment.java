package com.example.android.egypttourgide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // array of tours
        ArrayList<Tour> tourism = new ArrayList<Tour>();
        tourism.add(new Tour(R.string.name_the_azhar_park, R.string.name_position_cairo, R.string.describe_azhar_park,R.drawable.azharpark));
        tourism.add(new Tour(R.string.name_the_japanese, R.string.name_position_helwan, R.string.describe_japanese,R.drawable.japanesegarden));
        tourism.add(new Tour(R.string.name_the_gabalaya, R.string.name_position_cairo, R.string.describe_azhar_park,R.drawable.grottoaquarium));
        tourism.add(new Tour(R.string.name_the_giza_zoo, R.string.name_position_cairo, R.string.describe_zoo,R.drawable.gizazoo));
        tourism.add(new Tour(R.string.name_the_zoo, R.string.name_position_giza, R.string.describe_zoo,R.drawable.lionszoo));
        tourism.add(new Tour(R.string.name_the_fustat, R.string.name_position_cairo, R.string.describe_fustat,R.drawable.fustat));
        tourism.add(new Tour(R.string.name_the_andalos, R.string.name_position_cairo, R.string.describe_azhar_park,R.drawable.andalos));
        tourism.add(new Tour(R.string.name_the_merryland, R.string.name_position_cairo, R.string.describe_azhar_park,R.drawable.mereland));
        tourism.add(new Tour(R.string.name_the_inter, R.string.name_position_cairo, R.string.describe_inter,R.drawable.intergarden));
        tourism.add(new Tour(R.string.name_the_mokkatom, R.string.name_position_cairo, R.string.describe_mokkatom,R.drawable.mokkatom));
        tourism.add(new Tour(R.string.name_the_azhar_degla, R.string.name_position_cairo, R.string.describe_degla, R.drawable.degla));
        tourism.add(new Tour(R.string.name_the_nile, R.string.name_position_cairo, R.string.describe_nile, R.drawable.nile));
        tourism.add(new Tour(R.string.name_the_desert, R.string.name_position_cairo, R.string.describe_desert, R.drawable.desert));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tourism, R.color.primary_dark_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }



}
