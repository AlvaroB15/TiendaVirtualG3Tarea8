package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

public interface OrderState {

    void next(Order order);
    void prev(Order order);
    void printStatus();

}
