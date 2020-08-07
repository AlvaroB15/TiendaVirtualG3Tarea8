package edu.patronesdiseno.srp.models.interfaces;

import edu.patronesdiseno.srp.models.*;

public interface IOrderItem {
    //Order order = null;
    //Product product = null;
    String idProduct = null;
    Integer quantity = null;
    Double price = null;

    public Double calculatePrice();

    public Order getOrder();

    public void setOrder(Order order);

    //public Product getProduct();

    public String getIdProduct();

    public Integer getQuantity();

    //public void setQuantity();

    public Double getPrice();

}