package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class FinalizadoState implements OrderState {

    public FinalizadoState() {
    }

    @Override
    public void next(Order order) {
        System.out.println("This order is already received by a client.");
    }

    @Override
    public void prev(Order order) {
        // order.setState(new ReceivedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Finalizado");
    }

}