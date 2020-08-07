package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public interface IDiscountFactory {
    
    public IDiscount createDiscount();
}