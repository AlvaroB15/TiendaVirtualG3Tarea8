package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.patterns.CreadoState;
import edu.patronesdiseno.srp.models.patterns.CustomerState;

public class Customer {
    private String id;
    private String name = "";
    private String address = "";
    // private CustomerState state = new CreadoState();
    private CustomerState state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerState getState(){
        return state;
    }


    //

    public void setState(CustomerState state){
        this.state=state;
    }

    public void next(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }

    @Override
    public String toString() {
        return "Customer [address=" + address + ", id=" + id + ", name=" + name + ", state=" + state + "]";
    }



    
}