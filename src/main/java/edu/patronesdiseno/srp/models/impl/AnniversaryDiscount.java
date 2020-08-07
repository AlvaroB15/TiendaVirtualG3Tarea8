package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class AnniversaryDiscount implements IDiscount {

    private Double discount;

    public AnniversaryDiscount() {

        this.discount = 100.0;
    }

    @Override
    public Double getDiscount() {
        
        return this.discount;
    }
    
}