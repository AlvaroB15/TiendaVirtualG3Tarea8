package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class FastOrder extends Order {

    @Override
    public Double calculaTiempoLlegada(){
        return transporte.calculaTiempo();
    }
}
