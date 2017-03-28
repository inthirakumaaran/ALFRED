package com.example.asus_pc.alfred10;

/**
 * Created by ASUS-PC on 3/28/2017.
 */

public class ProgressController {

    static void createprogress(activity act){
        progress p =new progress(act,act.getCategory());
        p.setActive(act);
    }

    static void createactivity(String name,Category cat,double value_time,int priority,String basis){
        activity act =new activity(name,cat,basis,priority);
        createprogress(act);
    }

}
