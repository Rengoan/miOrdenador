package com.ceep.domain;

public class Computadora {

    private final int idComputadora;
    private String nombre;
    Monitor monitor;
    Teclado teclado;
    Raton raton;
    private static int contadorComputadoras;

    //Contructor
    public Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Getter and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    //toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
