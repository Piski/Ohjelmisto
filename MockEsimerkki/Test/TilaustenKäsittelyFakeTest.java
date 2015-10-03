package Test;

import MockEsimerkki.*;

public class TilaustenK‰sittelyFakeTest {

    public void testaaK‰sittelij‰WithFakeHinnoittelija() {
        float alkuSaldo = 100.0f;
        float listaHinta = 30.0f;
        float alennus = 20.0f;
        float loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));

        Asiakas asiakas = new Asiakas(alkuSaldo);
        Tuote tuote = new Tuote("TDD in Action", listaHinta);
        Hinnoittelija hinnoittelija = new FakeHinnoittelija(alennus);

        TilaustenK‰sittely k‰sittelij‰ = new TilaustenK‰sittely();
        k‰sittelij‰.setHinnoittelija(hinnoittelija);
        k‰sittelij‰.k‰sittele(new Tilaus(asiakas, tuote));

        assertEquals(loppuSaldo, asiakas.getSaldo(), 0,001);
    }
}
