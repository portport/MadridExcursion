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

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.reina_sofia, R.string.reina_sofia_address, R.drawable.reina_sofia));
        places.add(new Place(R.string.norman_foster_foundation, R.string.norman_foster_foundation_address, R.drawable.norman_foster_foundation));
        places.add(new Place(R.string.matadero_madrid, R.string.matadero_madrid_address, R.drawable.matadero_madrid));
        places.add(new Place(R.string.arganzuela_bridge, R.string.arganzuela_bridge_address, R.drawable.arganzuela_bridge));
        places.add(new Place(R.string.carabanchel_housing, R.string.carabanchel_housing_address, R.drawable.carabanchel_public_housing));
        places.add(new Place(R.string.restaurant, R.string.restaurant_address, R.drawable.restaurant));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_four);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
