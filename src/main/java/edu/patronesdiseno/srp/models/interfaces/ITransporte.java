package edu.patronesdiseno.srp.models.interfaces;

public interface ITransporte {

    Double latitude = 0.0;
    Double longitude = 0.0;

    Double getLatitude();
    Double getLongitude();

    Double calculaTiempo();

}
