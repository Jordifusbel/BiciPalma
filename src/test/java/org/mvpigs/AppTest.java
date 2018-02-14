package org.mvpigs;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mvpigs.estacion.Estacion;

public class AppTest
    extends TestCase {

    /**
     * @Test
    public void testConsEst(){
        Assert.assertEquals(Estacion.consultarEstacion(), "La estacion con id 1, llamada Manacor tiene 6 anclajes" );
    }**/

    public AppTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
}

