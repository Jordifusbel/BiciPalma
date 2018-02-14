package org.mvpigs.estacion;

import org.mvpigs.bicicleta.Bicicleta;

public class Estacion {
    private int id;
    private String name;
    private int anclajes;
    private Bicicleta[] flota;


    public Estacion(int id,String name,int anclajes){
        this.flota = new Bicicleta[anclajes];
        this.setId(id);
        this.setName(name);
        this.setAnclajes(anclajes);
    }

    public void mostrarAnclajes() {
        for (int n = 0; n < this.flota.length; n++) {
            if (this.flota[n] != null) {
                System.out.println("Anclaje" + (n + 1) + ": " + this.flota[n].getId());
            } else {
                System.out.println("Anclaje" + (n + 1) + ": disponible");
            }
        }
    }

    public Bicicleta[] getFlota() {
        return flota;
    }

    public void setFlota(Bicicleta[] flota) {
        this.flota = flota;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnclajes() {
        return anclajes;
    }

    public void setAnclajes(int anclajes) {
        this.anclajes = anclajes;
    }

    public void consultarEstacion(){
        System.out.println("La estacion con id " + this.id + ", llamada " + this.name + " tiene " + this.anclajes + " anclajes");

    }


}
