package edu.patronesdiseno.srp.models;

import java.util.List;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import edu.patronesdiseno.srp.models.interfaces.ITransporte;
import edu.patronesdiseno.srp.models.interfaces.IVehiculo;
import edu.patronesdiseno.srp.models.patterns.OrderState;

public class Order {

    private String id;
    private Double amount;
    private String address;
    private String courier;
    private Double discount;
    private String customer;
    public boolean hasDelivery;

    protected ITransporte transporte;
    protected IVehiculo vehiculo;

    private List<IOrderItem> orderItems;

    private OrderState state;

    public List<IOrderItem> getOrderItems() {
        //List<IOrderItem> ordersItems = new ArrayList<>();
        /*
         * Get logic, ORM, SQL
         */
        return orderItems;
    }

    public void setOrderItems(List<IOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double calculateTotalOrder(IDiscount iDiscount) {
        final List<IOrderItem> ordersItems = this.getOrderItems();

        Double totalPrice = 0.0;

        for (final IOrderItem item : ordersItems) {
            totalPrice += item.getPrice();
        }

        if (iDiscount != null)   {
            this.discount = iDiscount.getDiscount();
            this.amount = totalPrice - this.discount;
        }
        else{
            this.discount = 0.0;
            this.amount = totalPrice;
        }

        return totalPrice;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public Double getDiscount() {
        return discount;
    }




    public void setTransporte(ITransporte transporte){
        this.transporte = transporte;
    }

    public ITransporte getTransporte(){
        return this.transporte;
    }

    public Double calculaTiempoLlegada(){
        return null;
    }

    public void setVehiculo(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public IVehiculo getVehiculo(){
        return this.vehiculo;
    }

    public String detalleVehiculo(){
        return "";
    }



    

    public void setState(OrderState state){
        this.state = state;
    }

    public OrderState getState(){
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

    public boolean gethasDelivery(){
        return this.hasDelivery;
    }
 
    public void sethasDelivery(boolean hasDelivery){
        this.hasDelivery=hasDelivery;
    }
}