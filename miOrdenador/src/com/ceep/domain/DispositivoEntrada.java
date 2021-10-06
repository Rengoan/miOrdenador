package com.ceep.domain;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    //Contructores
    public DispositivoEntrada(String tipoEntrada, String marca) {
        super();
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //Getter ands Setters
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //to String
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }

}
