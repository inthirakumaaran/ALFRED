package com.example.asus_pc.alfred10;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

public class activity {
    private String Name;
    private Category category;
    private double allocated_time;
    private double allocated_value;
    private String perbasis;
    private int priority;

    public double getAllocated_value() {
        return allocated_value;
    }

    public activity(String name, Category category, String perbasis, int priority, Double allocated_value) {
        Name = name;
        this.category = category;
        this.allocated_value = allocated_value;
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
