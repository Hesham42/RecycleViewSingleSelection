package com.example.android_soleeklab.recycleviewmultyselcetionandsingle;

/**
 * Created by android-soleeklab on 1/17/2018.
 */

public class Person {
    String personName;
    String personAdd;
    String personDsg;
    boolean selected;
    Person(String name, String dsg, String add) {
        this.personName = name;
        this.personAdd = add;
        this.personDsg = dsg;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public String getPersonDsg() {
        return personDsg;
    }
    public void setPersonDsg(String personDsg) {
        this.personDsg = personDsg;
    }
    public String getPersonAdd() {
        return personAdd;
    }
    public void setPersonAdd(String personAdd) {
        this.personAdd = personAdd;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}