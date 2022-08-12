
package com.example.model.vo;

public class CasaCampestreVo {
    private Integer idProyecto;
    private String constructora;
    private Integer numeroHabitaciones;
    private String ciudad;

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getNumeroHabitaciones() {
        return this.numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getConstructora() {
        return this.constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getIdProyecto() {
        return this.idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

}
