package com.codeclan.anotherlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOfThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ManyThings coffeeShops = new ManyThings();
        ArrayList<Thing> list = coffeeShops.getList();

        ManyThingsAdapter thingsAdapter = new ManyThingsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(thingsAdapter);
    }

    public void titleClicked(View textView) {
        TextView name = (TextView) textView;
        Log.d("Name clicked ", name.getText().toString());
    }

    public void itemClicked(View item ){
        Log.d("Item Clicked", "Yay");
    }

}
