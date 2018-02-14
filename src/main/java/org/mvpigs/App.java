package org.mvpigs;

import org.mvpigs.estacion.Estacion;

public class App {

    public static void main( String[] args )
    {
        System.out.println( "gHello World!" );


    Estacion manacor = new Estacion(1,"Manacor",6);

    manacor.mostrarAnclajes();
    }
}
