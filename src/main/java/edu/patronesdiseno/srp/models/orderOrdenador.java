package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.patterns.Iagregado;
import edu.patronesdiseno.srp.models.patterns.OrderIterator;

public class orderOrdenador extends Order implements Iagregado {

    public orderOrdenador(){
        super();
    }
    @Override
    public OrderIterator getIterator() {
        return new OrderIterator(this);
    }


}
