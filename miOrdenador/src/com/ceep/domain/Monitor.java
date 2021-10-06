package com.ceep.domain;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    //Constructor
    public Monitor() {
        this.idMonitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamanio) {
        this(); //Llama al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;

    }

    //Getter and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }

    //toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }

}
