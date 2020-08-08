package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class DesactivoState implements CustomerState{
    public DesactivoState(){}
    @Override
    public void next(Customer customer) {
        // TODO Auto-generated method stub
        customer.setState(new ObservadoState());
    }
    
    public void printStatus(){
        System.out.println("El empleado esta en estado desactivo");
    }
}