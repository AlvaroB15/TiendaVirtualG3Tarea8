package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class CreadoState implements CustomerState{
    public CreadoState(){}
    @Override
    public void next(Customer customer) {
        customer.setState(new ActivoState());
    }
    public void printStatus(){
        System.out.println("El empleado fue generado. (CreadoState)");
    }
}