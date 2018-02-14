package org.mvpigs.estacion;

public class Estacion {
    private int id;
    private String name;
    private int anclajes;

    public Estacion(int id,String name,int anclajes){
        this.setId(id);
        this.setName(name);
        this.setAnclajes(anclajes);
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
        System.out.print("La estacion con id " + this.id + ", llamada " + this.name + ", tiene " + this.anclajes + " anclajes");

    }


}
