package org.mvpigs;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mvpigs.bicicleta.Bicicleta;
import org.mvpigs.estacion.Estacion;

public class AppTest extends TestCase {

    @Test
    public void testApp() {
        Estacion estacion = new Estacion(0, "Test station", 2);
        Bicicleta bicicleta = new Bicicleta(false, 1000);

        bicicleta.anclarBici(estacion);

        assertTrue(bicicleta.getAnclada());
        assertNotNull(estacion.getFlota()[0]);
    }
}

