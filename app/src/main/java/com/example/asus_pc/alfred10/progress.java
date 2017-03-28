package com.example.asus_pc.alfred10;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

public class progress {
    private activity active;
    private Category category;
    private int week;

    public progress(activity active, Category category) {
        this.active = active;
        this.category = category;
    }

    public activity getActive() {
        return active;
    }

    public void setActive(activity active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
