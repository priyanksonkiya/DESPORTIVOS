package com.example.desportivos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SportAdapter extends ArrayAdapter<Sport> {

    public SportAdapter(Context context, ArrayList<Sport> sportsList){
        super(context, 0, sportsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Sport currentSport = getItem(position);

        TextView sportTextView = (TextView) listItemView.findViewById(R.id.sport_text_view);
        sportTextView.setText(currentSport.getSportName());

        if(currentSport.hasImage()==true){

            ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);

            image.setImageResource(currentSport.getmImageResourceId());}

        else {
            ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
            image.setVisibility(View.GONE);
        }

        return listItemView;

    }
}

