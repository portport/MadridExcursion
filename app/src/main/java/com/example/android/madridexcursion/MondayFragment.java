package com.example.android.madridexcursion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MondayFragment extends Fragment {

    public MondayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Hotel Victoria 4", "Calle de la Victoria 4, 28015 Madrid", R.drawable.hotel_victoria));
        places.add(new Place("MediaLab Prado", "Calle de la Alameda, 15, 28014 Madrid", R.drawable.medialab_prado));
        places.add(new Place("Caixa Forum", "Paseo del Prado, 36, 28014 Madrid", R.drawable.caixa_forum));
        places.add(new Place("Museo del Prado Extension", "Paseo del Prado, s/n, 28014 Madrid", R.drawable.museo_del_prado));
        places.add(new Place("Evening in La Latina", "La Latina, Madrid", R.drawable.la_latina));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_one);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
