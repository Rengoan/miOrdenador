package com.ceep.domain;

public class Raton {

    private final int idRaton;
    private static int contadorRatones;

    //Constructores
    public Raton() {
        this.idRaton = ++Raton.contadorRatones;
    }

    //toString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }

}
