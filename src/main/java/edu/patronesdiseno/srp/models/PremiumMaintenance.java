package edu.patronesdiseno.srp.models;

import java.util.ArrayList;
import java.util.List;

public class PremiumMaintenance extends Maintenance {

    @Override
    public String getPeriod() {
        
        return "monthly";
    }

    @Override
    public List<String> maintenanceTasks() {
        
        List<String> tasks = new ArrayList<String>();
        tasks.add("warranty review");
        tasks.add("covers damage");
        return tasks;
    }

    
}