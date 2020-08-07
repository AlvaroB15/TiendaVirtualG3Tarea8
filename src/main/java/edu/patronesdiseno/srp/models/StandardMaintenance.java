package edu.patronesdiseno.srp.models;

import java.util.ArrayList;
import java.util.List;

public class StandardMaintenance extends Maintenance {
    

    @Override
    public String getPeriod() {
        
        return "annual";
    }

    @Override
    public List<String> maintenanceTasks() {
        
        List<String> tasks = new ArrayList<String>();
        tasks.add("warranty review");
        tasks.add("covers general failure");
        return tasks;
    }

}