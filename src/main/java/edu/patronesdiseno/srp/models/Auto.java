package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.interfaces.ITransporte;

public class Auto implements ITransporte {

    // por ahora he copiado lo mismo que la moto

    private Double latitude;
    private Double longitude;

    public Auto(){
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
        return 45.0;
    }
    
}