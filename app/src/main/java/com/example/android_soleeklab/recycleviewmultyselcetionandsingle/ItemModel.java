package com.example.android_soleeklab.recycleviewmultyselcetionandsingle;

/**
 * Created by android-soleeklab on 1/17/2018.
 */

public class ItemModel {

    private int id;
    private String name;
    private boolean isSelected;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}