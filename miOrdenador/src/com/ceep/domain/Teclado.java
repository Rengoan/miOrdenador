package com.ceep.domain;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //Hace referencia al constructor de la clase padre
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}' + super.toString();
        //Para combinar el toString con el de la clase padre
    }

}
