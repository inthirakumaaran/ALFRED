package com.example.asus_pc.alfred10;

import java.util.List;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

abstract class Category {
    private String name;
    private List<activity> activityList;

    public Category(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<activity> activityList) {
        this.activityList = activityList;
    }

    public String getName() {

        return name;
    }
}
