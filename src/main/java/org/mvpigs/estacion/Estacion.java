package org.mvpigs.estacion;

import org.mvpigs.bicicleta.Bicicleta;
import java.util.Arrays;

public class Estacion {
    private int id;
    private String name;
    private int anclajes;
    private Boolean[] estadoAnclajes;
    private Bicicleta[] flota;


    public Estacion(int id,String name,int anclajes){
        this.estadoAnclajes = new Boolean[anclajes];
        Arrays.fill(this.estadoAnclajes, true);
        this.setId(id);
        this.setName(name);
        this.setAnclajes(anclajes);
    }

    public void mostrarAnclajes(){
        for (int n = 0; n < this.estadoAnclajes.length ; n++){
            System.out.println("Anclaje" + n + ":" + this.estadoAnclajes[n]);
        }
    }


    public Bicicleta[] getFlota() {
        return flota;
    }

    public void setFlota(Bicicleta[] flota) {
        this.flota = flota;
    }

    public Boolean[] getEstadoAnclajes() {
        return estadoAnclajes;
    }

    public void setEstadoAnclajes(Boolean[] estadoAnclajes) {
        this.estadoAnclajes = estadoAnclajes;
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
        System.out.print("La estacion con id " + this.id + ", llamada " + this.name + " tiene " + this.anclajes + " anclajes");

    }


}
