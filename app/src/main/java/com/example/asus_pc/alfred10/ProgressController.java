package com.example.asus_pc.alfred10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.asus_pc.alfred10.dataBase.DBactivity;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

public class ProgressController extends AppCompatActivity {
    private DBactivity DB;


    public void createprogress(activity act){
        progress p =new progress(act,act.getCategory());
        p.setActive(act);
    }

    public void createactivity(String name,String cat,double value_time,int priority,String basis){
        activity act =new activity(name,createcategory(cat),basis,priority,value_time);
        createprogress(act);
//        addactivity(act);
    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DB = new DBactivity(this);
    }

    public void addactivity(activity act){
        DB.addactivity(act.getName(),act.getCategory().getName(),act.getAllocated_value(),act.getPerbasis(),act.getPriority());
    }
    public Category createcategory(String name){
        Category cat ;
        if(name.equals("HEALTH")){
            cat = new Health_social("HEALTH");
        }else if(name.equals("SOCIAL")){
            cat = new Health_social("SOCIAL");
        }else if(name.equals("ACADEMIC")){
            cat = new Academic("ACADEMIC");
        }else if(name.equals("NON-ACADEMIC")){
            cat = new Nonacademic("NON-ACADEMIC");
        }else if(name.equals("EXPENSE")) {
            cat = new Expense("EXPENSE");
        }else {
            cat=new Nonacademic("NON-ACADEMIC");
        }
        return cat;
    }

}
