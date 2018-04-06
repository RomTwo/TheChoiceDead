import Objets.Arme;
import Objets.Munition;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArmeTest {

    private Arme a = new Arme("a", 20, 5, 5);
    private Munition m = new Munition("m", 3);
    private Munition m2 = null;

    @Test
    public void tirer() throws Exception {
        a.tirer();
        assertSame(a.getCapacite(), 4);

        a.tirer();
        a.tirer();
        a.tirer();
        a.tirer();
        assertEquals(a.getCapacite(), 0);
        a.tirer();
        assertEquals(a.getCapacite(), 0);


    }

    @Test
    public void recharger() throws Exception {

        a.recharger(m2);
        assertEquals(a.getCapacite(), 5);

        a.tirer();
        a.recharger(m);
        assertEquals(a.getCapacite(), 5);

    }

}