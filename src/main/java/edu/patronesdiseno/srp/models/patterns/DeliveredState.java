package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class DeliveredState implements OrderState {

    public DeliveredState(){}

    @Override
    public void next(Order order) {
        order.setState(new ReceivedState());
    }

    @Override
    public void prev(Order order) {
        // order.setState(new OrderedState());
        //Pregunta 2
        // order.setState(new PaidderOrder());
    }

    @Override
    public void printStatus(){
        System.out.println("-----------------------");
        System.out.println("Delivered!. (DeliveredState)");
    }
}