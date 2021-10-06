package com.ceep.domain;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    //Constructores
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //Hace referencia al constructor de la clase padre
        this.idRaton = ++Raton.contadorRatones;
    }

    //toString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' +super.toString();
        //Para combinar el toString con el de la clase padre
    }

}
