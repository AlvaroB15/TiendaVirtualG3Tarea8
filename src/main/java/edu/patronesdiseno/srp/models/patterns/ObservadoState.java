package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ObservadoState implements CustomerState{
    public ObservadoState(){}
    @Override
    public void next(Customer customer) {
        if (customer.getName()!="" && customer.getAddress()!="") {
            customer.setState(new ActivoState());
        }
    }
    
    public void printStatus(){
        System.out.println("El empleado esta en estado observado (ObservadoState)");
    }
}