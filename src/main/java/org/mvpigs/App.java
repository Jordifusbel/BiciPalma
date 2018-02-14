package org.mvpigs;

import org.mvpigs.bicicleta.Bicicleta;
import org.mvpigs.estacion.Estacion;

public class App {

    public static void main( String[] args )
    {
        System.out.println( "gHello World!" );


    Estacion manacor = new Estacion(1,"Manacor",6);
    manacor.consultarEstacion();
    Bicicleta mountainBike = new Bicicleta(false,1234);
    Bicicleta brokenBike = new Bicicleta(false,4323);


    manacor.mostrarAnclajes();
    mountainBike.anclarBici(manacor);
    manacor.mostrarAnclajes();

    }
}
