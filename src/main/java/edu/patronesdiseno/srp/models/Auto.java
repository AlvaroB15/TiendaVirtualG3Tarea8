package edu.patronesdiseno.srp.models;

import java.util.Random;

import edu.patronesdiseno.srp.models.interfaces.ITransporte;
import edu.patronesdiseno.srp.models.interfaces.IVehiculo;

public class Auto implements ITransporte , IVehiculo {

    // por ahora he copiado lo mismo que la moto

    private Double latitude;
    private Double longitude;

    private String placa = "AEF-717";
    private String modelo = "Toyota Corolla";

    public Auto(){
    }

    @Override
    public Double getLatitude() {
        return this.latitude;
    }

    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public Double calculaTiempo(){
        
        Random rn = new Random();
        int intervalo = 120 - 45 + 1;

        return Double.valueOf(rn.nextInt(intervalo) + 45);        
    }

    // Interface Vehiculo

    @Override
    public String detalleVehiculo() {
        return "AUTO  --> Placa = " + this.placa + " -- Modelo: " + this.modelo + " Tiempo : " + this.calculaTiempo() ;
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