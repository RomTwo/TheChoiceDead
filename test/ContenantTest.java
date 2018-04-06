import Contenants.Contenant;
import Objets.Arme;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContenantTest {

    Contenant c = new Contenant("c1");
    Arme a = new Arme("a1", 10, 5, 5);

    @Test
    public void testAjoutObjet() throws Exception {
        c.ajoutObjet(a);
        assertSame(c.getObjet(), a);
        assertSame(a.getContenant(), c);
    }

    @Test
    public void supprimerObjet() throws Exception {
        c.ajoutObjet(a);
        c.supprimerObjet(a);
        assertNull(c.getObjet());
        assertNull(a.getContenant());
    }

}