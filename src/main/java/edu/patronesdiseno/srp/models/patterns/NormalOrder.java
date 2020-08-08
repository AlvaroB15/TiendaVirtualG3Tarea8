package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class NormalOrder extends Order {
    
    @Override
    public String detalleVehiculo(){
        return vehiculo.detalleVehiculo();
    }
    
}