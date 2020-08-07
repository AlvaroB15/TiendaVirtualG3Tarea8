package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.impl.AnniversaryDiscount;
import edu.patronesdiseno.srp.models.impl.CouponDiscount;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class DiscountFactory {
    
    public static final String DISCOUNT_COUPON = "Coupon";
    public static final String DISCOUNT_ANNIVERSARY = "Anniversary";

    public IDiscount createDiscount(String typeDiscount)   {

        if (typeDiscount.equals(DISCOUNT_COUPON))  {

            return new CouponDiscount();
        }
        if (typeDiscount.equals(DISCOUNT_ANNIVERSARY))  {

            return new AnniversaryDiscount();
        }        
        else {

            return null;
        }
    }
}