import Personnages.Hero;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonnageTest {

    Hero h = new Hero("name", 50, 5, null, null);
    Hero h2 = new Hero("name", 0, 5, null, null);

    @Test
    public void baisseSante() throws Exception {

        int degats = 30000000;

        h2.baisseSante(degats);
        assertEquals(h2.getSante(), 0);
        assertEquals(h2.estMort(), true);


    }

    @Test
    public void estMort() throws Exception {
        assertEquals(h2.estMort(), true);
        assertEquals(h.estMort(), false);

    }

    @Test
    public void setSante() throws Exception {
        int s = -5;
        int santeDepart = h.getSante();
        int s2 = 10;

        h.setSante(s);
        assertEquals(h.getSante(), santeDepart);

        h2.setSante(s2);
        assertEquals(h2.getSante(), s2);

    }


}