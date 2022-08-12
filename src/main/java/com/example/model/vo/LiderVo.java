package com.example.model.vo;

public class LiderVo {

    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public LiderVo(){        
    }

    public String getCiudadResidencia() {
        return this.ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdLider() {
        return this.idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

}
