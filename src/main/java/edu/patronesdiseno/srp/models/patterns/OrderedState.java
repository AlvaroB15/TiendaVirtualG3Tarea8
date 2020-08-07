package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class OrderedState implements OrderState {

    public OrderedState(){}

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void prev(Order order) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order ordered, not delivered to the address yet.");
    }
}
