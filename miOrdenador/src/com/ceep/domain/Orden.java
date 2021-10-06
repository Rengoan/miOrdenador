package com.ceep.domain;

public class Orden {

    private final int idOrden;
    Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 4;

    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.maxComputadoras];
        contadorComputadoras = 0;

    }

    //Metodo
    public void agregarComputadora(Computadora computadora) {
        if (Orden.contadorComputadoras < Orden.maxComputadoras) {
            computadoras[Orden.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has alcanzado el maximo de computadoras por orden de pedido: " + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Id de Orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);

        }
    }

}
