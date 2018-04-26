package com.example.android.madridexcursion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WednesdayFragment extends Fragment {


    public WednesdayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.santa_ana, R.string.santa_ana_address, R.drawable.santa_ana_y_la_esperanza));
        places.add(new Place(R.string.cesar_carlos, R.string.cesar_carlos_address, R.drawable.cesar_carlos_residence));
        places.add(new Place(R.string.hipodromo_zarzuela, R.string.hipodromo_zarzuela_address, R.drawable.hipodromo_de_la_zarzuela));
        places.add(new Place(R.string.edificio_mirador, R.string.edificio_mirador_address, R.drawable.edificio_mirador));
        places.add(new Place(R.string.malasana, R.string.malasana_address, R.drawable.malasana));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_three);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
