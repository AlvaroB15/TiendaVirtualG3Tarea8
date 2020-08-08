package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public interface IteratorO {
    IOrderItem primero();
    IOrderItem siguiente();
    IOrderItem actual();
    boolean haymas();
}