package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ActivoState implements CustomerState{
    public ActivoState(){}
    @Override
    public void next(Customer customer) {
        customer.setState(new DesactivoState());
    }

    public void printStatus(){
        System.out.println("El empleado esta en estado activo. (ActivoState)");
    }
}