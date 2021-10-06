package com.ceep.domain;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //toString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

}
