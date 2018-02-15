package org.mvpigs.bicicleta;

import org.mvpigs.estacion.Estacion;

public class Bicicleta {

    private Boolean anclada;
    private int id;

    public Bicicleta(Boolean anclada, int id){
        this.setAnclada(anclada);
        this.setId(id);
    }

    public Boolean getAnclada() {
        return anclada;
    }

    public void setAnclada(Boolean anclada) {
        this.anclada = anclada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void anclarBici(Estacion actual) {
        Bicicleta[] flotaActual = actual.getFlota();
        if (!this.anclada){
            for (int n=0; n<flotaActual.length && !this.anclada; n++){
                if (flotaActual[n] == null){
                    flotaActual[n] = this;
                    this.anclada = true;
                }
            }
        }
    }

    public void sacarBiciConcreta(Estacion actual) {
        Bicicleta[] flotaActual = actual.getFlota();
        for (int n=0; n<flotaActual.length; n++)
            if (flotaActual[n]==this){
            flotaActual[n] = null;
            this.anclada = false;
            }
    }

}
