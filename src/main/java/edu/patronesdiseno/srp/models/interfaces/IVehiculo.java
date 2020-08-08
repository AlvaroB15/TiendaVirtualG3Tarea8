package edu.patronesdiseno.srp.models.interfaces;

public interface IVehiculo {

    String placa = "";
    String modelo = "";

    String getPlaca();
    String getModelo();

    String detalleVehiculo();
}