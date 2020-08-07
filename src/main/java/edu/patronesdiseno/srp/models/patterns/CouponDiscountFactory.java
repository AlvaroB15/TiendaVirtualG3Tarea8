package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class CouponDiscountFactory implements IDiscountFactory {

    @Override
    public IDiscount createDiscount() {
        
        return new CouponDiscount();
    }


    
}