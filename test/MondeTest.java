import Univers.Lieux;
import Univers.Monde;
import org.junit.Test;

import static org.junit.Assert.*;

public class MondeTest {

    Monde m = new Monde("m");
    Lieux l1 = new Lieux("l1", m);
    Lieux l2 = new Lieux("l2", m);
    Lieux l3 = new Lieux("l3", m);

    @Test
    public void ajoutLieu() throws Exception {

        m.ajoutLieu(l1);
        m.ajoutLieu(l1);
        m.ajoutLieu(l1);

        assertEquals(m.getLieux().size(), 1);

        m.ajoutLieu(l1);
        m.ajoutLieu(l2);
        m.ajoutLieu(l3);
        m.ajoutLieu(l3);

        assertEquals(m.getLieux().size(), 3);
    }

}