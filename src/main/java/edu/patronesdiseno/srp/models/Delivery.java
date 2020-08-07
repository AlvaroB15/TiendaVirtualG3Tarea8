package edu.patronesdiseno.srp.models;

public class Delivery {

    private String idOrder;
    private String address;
    private String receptionPersonPhone;
    private String receptionPersonName;
    private String schedule;
    private String date;
    private String tienda;

    public Delivery() {

    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getReceptionPersonPhone() {
        return receptionPersonPhone;
    }

    public void setReceptionPersonPhone(String receptionPersonPhone) {
        this.receptionPersonPhone = receptionPersonPhone;
    }

    public String getReceptionPersonName() {
        return receptionPersonName;
    }

    public void setReceptionPersonName(String receptionPersonName) {
        this.receptionPersonName = receptionPersonName;
    }

    @Override
    public String toString() {
        
        return idOrder + "-" + receptionPersonName + "-" +  receptionPersonPhone + "-" +  address + "-" +  date + "-" + schedule;
    }
}

