package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public class PaidderState implements OrderState {

    public PaidderState(){}

    @Override
    public void next(Order order) {
        //Pregunta 2
        if(order.hasDelivery == true){
            order.setState(new DeliveredState());
        }else{
            order.setState(new FinalizadoState());
        }
    }

    // @Override
    // public void prev(Order order) {
    // //     System.out.println("Segundo Estado ");
    // //     //Pregunta 2
    // //     order.setState(new OrderedState());
    // }

    @Override
    public void printStatus() {
        System.out.println("-----------------------");
        System.out.println("Gestion de Pedido de Orden delivery o presencial. (PaidderState)");

    }
    
}