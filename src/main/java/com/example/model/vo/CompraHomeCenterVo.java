package com.example.model.vo;

public class CompraHomeCenterVo {
    private Integer idCompra;
    private String constructora;
    private String bancoVinculado;

    public CompraHomeCenterVo(){

    }

    public String getBancoVinculado() {
        return this.bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    public String getConstructora() {
        return this.constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

}
