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
public class MosquesFragment extends Fragment {


    public MosquesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // array of tours
        ArrayList<Tour> tourism = new ArrayList<Tour>();
        tourism.add(new Tour(R.string.name_the_azhar, R.string.name_position_cairo, R.string.history_azhar,R.drawable.azhar));
        tourism.add(new Tour(R.string.name_the_hussein, R.string.name_position_cairo, R.string.history_hussein,R.drawable.hussien));
        tourism.add(new Tour(R.string.name_the_zainab, R.string.name_position_cairo, R.string.history_zainab,R.drawable.zenab));
        tourism.add(new Tour(R.string.name_the_nafeesah, R.string.name_position_cairo, R.string.history_nafeesah,R.drawable.nafisa));
        tourism.add(new Tour(R.string.name_the_aisha, R.string.name_position_cairo, R.string.history_aisha,R.drawable.aisha));
        tourism.add(new Tour(R.string.name_the_amr, R.string.name_position_cairo, R.string.history_amr,R.drawable.amr));
        tourism.add(new Tour(R.string.name_the_hakim, R.string.name_position_cairo, R.string.history_hakim,R.drawable.alhakim));
        tourism.add(new Tour(R.string.name_the_muayed, R.string.name_position_cairo, R.string.history_muayed,R.drawable.muayed));
        tourism.add(new Tour(R.string.name_the_ali, R.string.name_position_cairo, R.string.history_ali,R.drawable.moali));
        tourism.add(new Tour(R.string.name_the_rifai, R.string.name_position_cairo, R.string.history_rifai,R.drawable.rifai));
        tourism.add(new Tour(R.string.name_the_hassan, R.string.name_position_cairo, R.string.history_hassan, R.drawable.hassan));
        tourism.add(new Tour(R.string.name_the_tulon, R.string.name_position_cairo, R.string.history_tulon, R.drawable.tulon));

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
