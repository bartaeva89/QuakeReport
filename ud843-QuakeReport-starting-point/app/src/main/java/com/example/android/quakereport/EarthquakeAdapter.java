package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Barta Eva Anna on 2018.06.14..
 */

public class EarthquakeAdapter extends ArrayAdapter {
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake= (Earthquake) getItem(position);
        TextView magnitudeText = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeText.setText(currentEarthquake.getMagnitude());
        TextView locationText = (TextView) listItemView.findViewById(R.id.location);
        locationText.setText(currentEarthquake.getLocation());
        TextView dateText = (TextView) listItemView.findViewById(R.id.date);
        dateText.setText(currentEarthquake.getDate());
        return listItemView;
    }

}

