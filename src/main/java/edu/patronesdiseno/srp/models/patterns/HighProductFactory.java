package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.*;

public class HighProductFactory implements IProductFactory {

    @Override
    public LineProduct getLineProduct() {
        
        return new HighEndLineProduct();
    }

    @Override
    public Maintenance getMaintenance() {
        
        return new PremiumMaintenance();
    }

    @Override
    public Condition getCondition() {

        return new NewCondition();
    }

    
}