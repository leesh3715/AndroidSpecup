package com.example.user.myapplication;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap;

/*
 * Created by leesh3715 on 2018-11-16.
 */

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    private Activity context;

    public CustomInfoWindowAdapter(Activity context){
        this.context = context;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
    @Override
    public View getInfoContents(Marker marker) {
        View view = context.getLayoutInflater().inflate(R.layout.customwindow, null);

        TextView Title = (TextView) view.findViewById(R.id.custom1);
        TextView SubTitle = (TextView) view.findViewById(R.id.custom2);

        Title.setText(marker.getTitle());
        SubTitle.setText(marker.getSnippet());
        return view;
    }
}