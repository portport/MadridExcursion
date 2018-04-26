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
public class MondayFragment extends Fragment {

    public MondayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.hotel_victoria, R.string.hotel_victoria_address, R.drawable.hotel_victoria));
        places.add(new Place(R.string.medialab_prado, R.string.medialab_prado_address, R.drawable.medialab_prado));
        places.add(new Place(R.string.caixa_forum, R.string.caixa_forum_address, R.drawable.caixa_forum));
        places.add(new Place(R.string.museo_del_prado, R.string.museo_del_prado_address, R.drawable.museo_del_prado));
        places.add(new Place(R.string.la_latina, R.string.la_latina_address, R.drawable.la_latina));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.day_one);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
