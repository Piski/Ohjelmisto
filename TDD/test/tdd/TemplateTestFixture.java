package tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TemplateTestFixture {

    private static Template template = new Template("lol");
    private int luku;
    private int tulos;

    @Parameters
    public static List testiTapaukset() {
        return Arrays.asList(new Object[][]{
                    {0, 0},
                    {1, 1},
                    {2, 4},
                    {4, 16},
                    {5, 25},
                    {6, 36},
                    {7, 49}
                });
    }

    // Konstruktori, jota JUnit kutsuu kullekin listan testitapaukselle.
    // Parametrien kytkentä sijainnin / järjestyksen perusteella:
    // ekana syötetty luku, toisena odotettu arvo
    public TemplateTestFixture(int luku, int tulos) {
        this.luku = luku;
        this.tulos = tulos;
    }

    @Test
    public void testTemplate() {
        //String messu = luku + " * " + luku;
        //template.nelio(luku);
        //assertEquals(messu, tulos, template.annaTulos(), 0.001);
    }
}
