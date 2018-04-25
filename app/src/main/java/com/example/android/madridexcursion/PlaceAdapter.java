package com.example.android.madridexcursion;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorId) {
        super(context, 0, places);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentPlace.getPlaceName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getPlaceAdress());

        ImageView thumbnailView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            thumbnailView.setImageResource(currentPlace.getImageResourceId());
            thumbnailView.setVisibility(View.VISIBLE);
        } else {
            thumbnailView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
