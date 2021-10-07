package com.ceep.mipc;

import com.ceep.domain.*;

public class PcTest {

    public static void main(String[] args) {

        //Objetos PC
        Teclado t1 = new Teclado("USB", "Razer");
        Raton r1 = new Raton("USB", "Razer");
        Monitor m1 = new Monitor("Dell", 27.0);
        Computadora pc1 = new Computadora("Gaming", m1, t1, r1);

        //Pedido
        Orden o1 = new Orden();

        //Metemos los ordenadores en el pedido
        o1.agregarComputadora(pc1);
        o1.mostrarOrden();

    }
}
