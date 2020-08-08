package edu.patronesdiseno.srp.models.patterns;

import java.util.List;

import edu.patronesdiseno.srp.models.Order;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public class OrderIterator implements IteratorO {
    private List<IOrderItem> list;
    private int posicion;

    public OrderIterator(Order orden){
        this.list=orden.getOrderItems();
        this.posicion=0;
    }
    
    @Override
    public IOrderItem primero(){
        if(list.get(0) != null) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public IOrderItem siguiente() {
        
        if(haymas()){
            return list.get(++posicion);
        }
        return null;
    }

    @Override
    public IOrderItem actual() {
        
        return list.get(posicion);
    }

    @Override
    public boolean haymas() {

        return   posicion<list.size();
    }
    
}   