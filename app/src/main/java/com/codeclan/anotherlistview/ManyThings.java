package com.codeclan.anotherlistview;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class ManyThings {

    private ArrayList<Thing> list;

    public ManyThings() {
        list = new ArrayList<Thing>();
        list.add(new Thing(1, "The Old Post Office (Chapel of Garioch", "/ "));
        list.add(new Thing(2, "Formartines", "/ "));
        list.add(new Thing(3, "Alford Bistro", "/ "));
        list.add(new Thing(4, "Tease", "/ "));
        list.add(new Thing(5, "Brown Sugar", "/ "));
        list.add(new Thing(6, "Rock Salt and Snail", "/ "));
        list.add(new Thing(7, "Food Story", "http://foodstorycafe.co.uk"));
        list.add(new Thing(8, "Old Post Office Auchenblae", "/ "));
        list.add(new Thing(9, "Deeside Activity Centre", "/ "));
        list.add(new Thing(10, "Bird's Nest", "/ "));
        list.add(new Thing(11, "Gordon Arms, Monymusk", "/ "));
        list.add(new Thing(12, "Drumoak Garden Centre", "/ "));
        list.add(new Thing(13, "Raemoir Garden Centre", "/ "));
        list.add(new Thing(14, "Clatterin Brig", "/ "));
        list.add(new Thing(15, "Little Art Gallery, Edzell", "/ "));
        list.add(new Thing(16, "Cup", "/ "));
        list.add(new Thing(17, "The Coffee House","http://coffeehouseabz.com/" ));
        list.add(new Thing(18, "Books and Beans", "http://www.booksandbeans.co.uk/menu"));
        list.add(new Thing(19, "Platform 22", "/ "));
        list.add(new Thing(20, "Forest Cafe", "/ "));
    }

    public ArrayList<Thing> getList() {
        return new ArrayList<Thing>(list);
    }

}

