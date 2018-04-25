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
public class ThursdayFragment extends Fragment {


    public ThursdayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Museo Reina Sofia", "Calle de Santa Isabel, 52, 28012 Madrid", R.drawable.reina_sofia));
        places.add(new Place("Norman Foster Foundation", "Calle del Monte Esquinza, 48, 28010 Madrid", R.drawable.norman_foster_foundation));
        places.add(new Place("Matadero Madrid", "Paseo de la Chopera, 14, 28045 Madrid", R.drawable.matadero_madrid));
        places.add(new Place("Arganzuela Bridge", "Av del Manzanares, 134, 28019 Madrid", R.drawable.arganzuela_bridge));
        places.add(new Place("Carabanchel Public Housing", "Calle de los Morales, 25, 28054 Madrid", R.drawable.carabanchel_public_housing));
        places.add(new Place("Restaurant XY", "to be defined", R.drawable.restaurant));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_four);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
