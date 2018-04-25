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

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Barcelo Market", "Calle Barceló, 6, 28004 Madrid", R.drawable.barcelo_market));
        places.add(new Place("Fundacion Giner Rios", "Paseo del General Martínez Campos, 14, 28010 Madrid", R.drawable.fundacion_giner_rios));
        places.add(new Place("Fundacion de la Sota", "Calle de Bretón de los Herreros, 66, 28003 Madrid", R.drawable.fundacion_de_la_sota));
        places.add(new Place("Torre BBVA", "Paseo de la Castellana, 81, 28046 Madrid", R.drawable.torre_bbva));
        places.add(new Place("Gymnasio Maravillas", "Calle Guadalquivir, 9, 28002 Madrid", R.drawable.gymnasio_maravillas));
        places.add(new Place("Fundacion Higueras Diaz", "Calle del Maestro Lassalle, 36, 28016 Madrid", R.drawable.fundacion_higueras_diaz));
        places.add(new Place("Torres Blancas", "Av. de América, 37, 28002 Madrid", R.drawable.torres_blancas));
        places.add(new Place("Evening in Salamanca", "Salamanca, Madrid", R.drawable.salamanca));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_two);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
