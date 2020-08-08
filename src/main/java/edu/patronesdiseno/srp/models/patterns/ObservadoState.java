package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ObservadoState implements CustomerState{
    public ObservadoState(){}
    @Override
    public void next(Customer customer) {
        // TODO Auto-generated method stub
        if (customer.getName()!=null && customer.getAddress()!=null) {
            customer.setState(new ActivoState());
        }
    }
    
    public void printStatus(){
        System.out.println("El empleado esta en estado observado");
    }
}