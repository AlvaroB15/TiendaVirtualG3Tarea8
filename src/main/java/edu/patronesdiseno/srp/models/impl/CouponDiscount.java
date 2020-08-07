package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class CouponDiscount implements IDiscount    {

    private Double discount;

    public CouponDiscount() {

        this.discount = 50.0;
    }

    @Override
    public Double getDiscount() {
        
        return this.discount;
    }

    
}