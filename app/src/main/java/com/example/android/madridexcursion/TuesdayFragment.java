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
public class TuesdayFragment extends Fragment {


    public TuesdayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.barcelo_market, R.string.barcelo_market_address, R.drawable.barcelo_market));
        places.add(new Place(R.string.fundacion_giner, R.string.fundacion_giner_address, R.drawable.fundacion_giner_rios));
        places.add(new Place(R.string.de_la_sota, R.string.lde_la_sota_address, R.drawable.fundacion_de_la_sota));
        places.add(new Place(R.string.torre_bbva, R.string.torre_bbva_address, R.drawable.torre_bbva));
        places.add(new Place(R.string.gymnasio_maravillas, R.string.gymnasio_maravillas_address, R.drawable.gymnasio_maravillas));
        places.add(new Place(R.string.higueras_fundacion, R.string.higueras_fundacion_address, R.drawable.fundacion_higueras_diaz));
        places.add(new Place(R.string.torres_blancas, R.string.torres_blancas_address, R.drawable.torres_blancas));
        places.add(new Place(R.string.salamanca, R.string.salamanca_address, R.drawable.salamanca));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_two);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
