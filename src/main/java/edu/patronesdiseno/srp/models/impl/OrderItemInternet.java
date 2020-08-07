package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.Order;
import edu.patronesdiseno.srp.models.Product;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public class OrderItemInternet implements IOrderItem {
    //private Order order;
    //private Product product;
    private String idProduct;
    private Integer quantity;
    private Double price;

    public OrderItemInternet(String idProduct,Integer quantity,Double price)  {
        //this.order = order;
        //this.product = product;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemInternet(){

    }

    @Override
    public Double calculatePrice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Double getPrice() {
        // Intenet Promocion
        Double customPrice = 0.0;
        customPrice = this.price * this.quantity * 0.95;
        return customPrice;
    }

    @Override
    public Integer getQuantity() {
        // TODO Auto-generated method stub
        return this.quantity;
    }

    @Override
    public void setOrder(Order order) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getIdProduct() {

        return this.idProduct;
    }
    
}