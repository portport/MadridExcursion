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

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Santa Ana y la Esperanza", "Calle de la Cañada, 35, 28030 Madrid", R.drawable.santa_ana_y_la_esperanza));
        places.add(new Place("Cesar Carlos Residence", "3 Calle de Ramón Menéndez Pidal, 28040 Madrid", R.drawable.cesar_carlos_residence));
        places.add(new Place("Zarzuela Racecourse", "A-6, Km 8, 28023 Madrid", R.drawable.hipodromo_de_la_zarzuela));
        places.add(new Place("BBVA new HQ", "Calle Azul, 4, 28050 Madrid", R.drawable.bbva_hq));
        places.add(new Place("Edificio Mirador", "Calle Princesa de Éboli, 19, 28050 Madrid", R.drawable.edificio_mirador));
        places.add(new Place("Night walk in Malasaña", "Malasaña, Madrid", R.drawable.malasana));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_three);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
