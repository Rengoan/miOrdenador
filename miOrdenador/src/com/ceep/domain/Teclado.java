package com.ceep.domain;

public class Teclado {

    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado() {
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

}
