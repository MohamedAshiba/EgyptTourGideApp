package com.example.android.egypttourgide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by MohamedAshiba on 28/9/2018.
 */


/**
 * A simple {@link Fragment} subclass.
 */
public class TourismFragment extends Fragment {


    public TourismFragment() {
        // Required empty public constructor
    }

    ArrayList<String> tourism = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);



        // array of tours
        ArrayList<Tour> tourism = new ArrayList<Tour>();
        tourism.add(new Tour(R.string.name_the_pyramids, R.string.name_position_giza, R.drawable.pyramids));
        tourism.add(new Tour(R.string.name_the_khan, R.string.name_position_cairo, R.drawable.khan));
        tourism.add(new Tour(R.string.name_the_tour, R.string.name_position_cairo, R.drawable.cairotower));
        tourism.add(new Tour(R.string.name_the_palace_baron, R.string.name_position_cairo, R.drawable.baronpalace));
        tourism.add(new Tour(R.string.name_the_palace_abdeen, R.string.name_position_cairo, R.drawable.abdeenpalace));
        tourism.add(new Tour(R.string.name_the_aswan, R.string.name_position_aswan, R.drawable.aswan));
        tourism.add(new Tour(R.string.name_the_luxor, R.string.name_position_luxor, R.drawable.luxor));
        tourism.add(new Tour(R.string.name_the_wahat, R.string.name_position_wahat, R.drawable.whahat));
        tourism.add(new Tour(R.string.name_the_sharm, R.string.name_position_sharm, R.drawable.sharm));
        tourism.add(new Tour(R.string.name_the_gharda, R.string.name_position_gharda, R.drawable.hargada));
        tourism.add(new Tour(R.string.name_the_gona, R.string.name_position_gharda, R.drawable.gonaa));
        tourism.add(new Tour(R.string.name_the_alam, R.string.name_position_alam, R.drawable.marsa));

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
