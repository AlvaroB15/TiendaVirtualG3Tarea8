package edu.patronesdiseno.srp.models;

import java.util.List;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import edu.patronesdiseno.srp.models.interfaces.ITransporte;
import edu.patronesdiseno.srp.models.patterns.Iagregado;
import edu.patronesdiseno.srp.models.patterns.OrderIterator;
import edu.patronesdiseno.srp.models.patterns.OrderState;

public class Order implements Iagregado {

    private String id;
    private Double amount;
    private String address;
    private String courier;
    private Double discount;
    private String customer;

    protected ITransporte transporte;

    private List<IOrderItem> orderItems;

    private OrderState state;

    public List<IOrderItem> getOrderItems() {
        // List<IOrderItem> ordersItems = new ArrayList<>();
        /*
         * Get logic, ORM, SQL
         */
        return orderItems;
    }

    public void setOrderItems(final List<IOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    public Double calculateTotalOrder(final IDiscount iDiscount) {
        final List<IOrderItem> ordersItems = this.getOrderItems();

        Double totalPrice = 0.0;

        for (final IOrderItem item : ordersItems) {
            totalPrice += item.getPrice();
        }

        if (iDiscount != null) {
            this.discount = iDiscount.getDiscount();
            this.amount = totalPrice - this.discount;
        } else {
            this.discount = 0.0;
            this.amount = totalPrice;
        }

        return totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(final String customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(final String courier) {
        this.courier = courier;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setTransporte(final ITransporte transporte) {
        this.transporte = transporte;
    }

    public ITransporte getTransporte() {
        return this.transporte;
    }

    public Double calculaTiempoLlegada() {
        return null;
    }

    public void setState(final OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return this.state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    @Override
    public OrderIterator getIterator() {
        return new OrderIterator(this);
    }


}