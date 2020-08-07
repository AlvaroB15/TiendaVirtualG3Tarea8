package edu.patronesdiseno.srp.models;

import java.util.List;

public abstract class Maintenance {
    
    public abstract String getPeriod();

    public abstract List<String> maintenanceTasks();
}