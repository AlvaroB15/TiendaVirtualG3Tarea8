package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.interfaces.ITransporte;
import edu.patronesdiseno.srp.models.interfaces.IVehiculo;

public class Moto implements ITransporte , IVehiculo {

    private Double latitude;
    private Double longitude;

    private String placa = "7132-0D";
    private String modelo = "FB Mondial Flat Track 125 2021";

    public Moto(){
    }

    @Override
    public Double getLatitude() {
        return latitude;
    }

    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public Double calculaTiempo(){
        return 30.0;
    }


    @Override
    public String detalleVehiculo() {
        return "MOTO  --> Placa = " + this.placa + " -- Modelo: " + this.modelo  ;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

}
