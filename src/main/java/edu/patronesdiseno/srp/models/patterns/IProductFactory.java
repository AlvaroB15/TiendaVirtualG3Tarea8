package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.Maintenance;
import edu.patronesdiseno.srp.models.Condition;

public interface IProductFactory {

    public LineProduct getLineProduct();

    public Maintenance getMaintenance();

    public Condition getCondition();
}