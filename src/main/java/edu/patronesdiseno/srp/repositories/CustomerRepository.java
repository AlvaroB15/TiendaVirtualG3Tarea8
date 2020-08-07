package edu.patronesdiseno.srp.repositories;
import edu.patronesdiseno.srp.models.Customer;

import java.util.List;

public interface CustomerRepository {
    void create(Customer customer);

    Customer find(String id);

    List<Customer> findAll();

    Customer update(Customer post, String id);

    void delete(String id);
}