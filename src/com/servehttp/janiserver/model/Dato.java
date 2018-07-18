package com.servehttp.janiserver.model;

import java.util.Date;

/**
 *
 * @author jesus
 */
public class Dato {
    
    private String unidad;
    private String flota;
    private Long idDato;
    private Date fecha;
    private Double odometro;

    //Aux
    private String idUnidad;
    
    public Dato() {
    }

    public Dato(String unidad, String flota, Long idDato, Date fecha, Double odometro) {
        this.unidad = unidad;
        this.flota = flota;
        this.idDato = idDato;
        this.fecha = fecha;
        this.odometro = odometro;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFlota() {
        return flota;
    }

    public void setFlota(String flota) {
        this.flota = flota;
    }

    public Long getIdDato() {
        return idDato;
    }

    public void setIdDato(Long idDato) {
        this.idDato = idDato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getOdometro() {
        return odometro;
    }

    public void setOdometro(Double odometro) {
        this.odometro = odometro;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    @Override
    public String toString() {
        return "\nDato{" + "unidad=" + unidad + ", flota=" + flota + ", idDato=" + idDato + ", fecha=" + fecha + ", odometro=" + odometro + '}';
    }

}
