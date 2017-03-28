package com.example.asus_pc.alfred10;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

public class activity {
    String Name;
    Category category;
    double allocated_time;
    double allocated_value;
    String perbasis;
    int priority;

    public activity(String name, Category category, String perbasis, int priority) {
        Name = name;
        this.category = category;
//        this.allocated_value = allocated_value;
        this.perbasis = perbasis;
        this.priority = priority;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPerbasis() {
        return perbasis;
    }

    public void setPerbasis(String perbasis) {
        this.perbasis = perbasis;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
