package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Delivery;

public class HomeDeliveryBuilder implements IDeliveryBuilder {

    private String idOrder;
    private String address;
    private String receptionPersonPhone;
    private String receptionPersonName;
    private String schedule;
    private String date;    

    public HomeDeliveryBuilder( String idOrder )    {

        this.idOrder = idOrder;
    }

    public HomeDeliveryBuilder withAddress(String address)  {
        this.address = address;
        return this;
    }

    public HomeDeliveryBuilder withReceptionPersonPhone(String receptionPersonPhone)  {
        this.receptionPersonPhone = receptionPersonPhone;
        return this;
    }
    
    public HomeDeliveryBuilder withReceptionPersonName(String receptionPersonName)  {
        this.receptionPersonName = receptionPersonName;
        return this;
    }
    
    public HomeDeliveryBuilder withSchedule(String schedule)  {
        this.schedule = schedule;
        return this;
    }

    public HomeDeliveryBuilder withDate(String date)  {
        this.date = date;
        return this;
    }   

    @Override
    public Delivery build() {
 
        Delivery delivery = new Delivery();        
        delivery.setIdOrder(this.idOrder);
        delivery.setAddress(this.address);
        delivery.setReceptionPersonName(this.receptionPersonName);
        delivery.setReceptionPersonPhone(this.receptionPersonPhone);
        delivery.setSchedule(this.schedule);
        delivery.setDate(this.date);
        return delivery;
    }

    
}