package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public interface CustomerState {
    public void next(Customer customer);
    public void printStatus();
}