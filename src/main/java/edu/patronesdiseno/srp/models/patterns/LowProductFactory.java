package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.*;

public class LowProductFactory implements IProductFactory {

    @Override
    public LineProduct getLineProduct() {

        return new LowRangeLineProduct();
    }

    @Override
    public Maintenance getMaintenance() {

        return new StandardMaintenance();
    }
    
    @Override
    public Condition getCondition() {

        return new UsedCondition();
    }

}