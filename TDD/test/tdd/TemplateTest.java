package tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TemplateTest {

    @Test
    public void yksiMuuttuja() {
        Template template = new Template("Terve, ${nimi}");
        template.korvaa("nimi", "Ilari");
        assertEquals("Terve, Ilari", template.evaluoi());
    }

    @Test
    public void uusiArvo() {
        Template template = new Template("Terve, ${nimi}");
        template.korvaa("nimi", "Olga");
        assertEquals("Terve, Olga", template.evaluoi());
    }

    @Test
    public void uusiTemplate() {
        Template template = new Template("Soon nääs moro, ${nimi}");
        template.korvaa("nimi", "Olga");
        assertEquals("Soon nääs moro, Olga", template.evaluoi());
    }

    @Test
    public void montaMuuttuja() {
        Template template = new Template("${yyy}, ${kaa}, ${koo}");
        template.korvaa("yyy", "1");
        template.korvaa("kaa", "2");
        template.korvaa("koo", "3");
        assertEquals("1, 2, 3", template.evaluoi());
    }
}
