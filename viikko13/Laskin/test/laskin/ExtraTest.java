package laskin;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin;

    @BeforeClass
    public static void testVirtaON() {
        System.out.println("@BeforeClass Virta ON (ennen ensimmäistä testiä).");
        laskin = new Laskin();
        laskin.virtaON();
    }

    @AfterClass
    public static void testVirtaOFF() {
        System.out.println("@AfterClass Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @Before
    public void testNollaa() {
        System.out.println("Nollaa laskin.");
        laskin.nollaa();
    }

    // Aseta testille maksimi kestoaika
    @Test(timeout = 1000)
    public void testNeliojuuri2() {
        double e = Math.sqrt(2);
        laskin.neliojuuri(2);
        assertEquals("neliojuuri(2)", e, laskin.annaTulos(), 0.001);
    }

    @Test(timeout = 1000)
    public void testNeliojuuri16() {
        laskin.neliojuuri(16);
        assertEquals("neliojuuri(16)", 4, laskin.annaTulos(), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testNeliojuuriError() {
        laskin.neliojuuri(-1);
    }

    @Test
    public void testNelio2() {
        laskin.nelio(2);
        assertEquals("nelio(2) ", 4, laskin.annaTulos(), 0.001);
    }

    @Test
    public void testNelio4() {
        laskin.nelio(4);
        assertEquals("nelio(4) ",16, laskin.annaTulos(), 0.001);
    }

    @Test
    public void testNelio5() {
        laskin.nelio(5);
        assertEquals("nelio(5) ", 25, laskin.annaTulos(), 0.001);
    }
}
