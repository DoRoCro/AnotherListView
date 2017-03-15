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

    public ManyThingsAdapter(Context context, ArrayList<Thing> coffeeshops) {
    super(context, 0, coffeeshops);
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

        TextView title = (TextView)  convertView.findViewById(R.id.name);
        title.setText(currentThing.getName());

        TextView year = (TextView)  convertView.findViewById(R.id.url);
        year.setText(currentThing.getUrl());


        return convertView;
    }

}
