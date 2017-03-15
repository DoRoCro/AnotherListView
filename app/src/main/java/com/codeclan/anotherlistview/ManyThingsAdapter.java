package com.codeclan.anotherlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

class ManyThingsAdapter extends ArrayAdapter<Thing> {

    public ManyThingsAdapter(Context context, ArrayList<Thing> things) {
    super(context, 0, things);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list,
                    parent,
                    false);
        }

        Thing currentThing = getItem(position);   // getItem from ArrayAdapter

        TextView ranking = (TextView) convertView.findViewById(R.id.ranking);
        ranking.setText(currentThing.getRanking().toString());

        TextView name = (TextView)  convertView.findViewById(R.id.name);
        name.setText(currentThing.getName());

        TextView url = (TextView)  convertView.findViewById(R.id.url);
        url.setText(currentThing.getUrl());


        return convertView;
    }

}
