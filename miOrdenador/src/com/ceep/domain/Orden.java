package com.ceep.domain;

public class Orden {

    private final int idOrden;
    Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras = 0;
    private static final int maxComputadoras = 10;

    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.maxComputadoras];

    }

    //Metodo
    public void agregarComputadora(Computadora computadora) {
        if (Orden.contadorComputadoras < Orden.maxComputadoras) {
            computadoras[Orden.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has alcanzado el maximo de computadoras por orden de " + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Id de Orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorOrdenes; i++) {
            System.out.println("Nombre del Ordenador[" + i + "] -> " + computadoras[i].getNombre());
            System.out.println("Monitor[" + i + "] -> " + computadoras[i].getMonitor());
            System.out.println("Teclado[" + i + "] -> " + computadoras[i].getTeclado());
            System.out.println("Raton[" + i + "] -> " + computadoras[i].getRaton());

        }
    }

}
