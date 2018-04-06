import Contenants.Contenant;
import Personnages.Monstre;
import Sortie.Sortie;
import Univers.Lieux;
import org.junit.Test;

import static org.junit.Assert.*;

public class LieuxTest {

    Sortie s = new Sortie("test", null);
    Lieux l = new Lieux("test", null);
    Monstre z = new Monstre("z", 10, 10, l);
    Contenant c = new Contenant("ds");

    @Test
    public void ajoutSortie() throws Exception {
        l.ajoutSortie(s);
        l.ajoutSortie(s);
        assertEquals(l.getLesSortie().size(), 1);

    }

    @Test
    public void ajoutPersonnage() throws Exception {
        l.ajoutPersonnage(z);
        l.ajoutPersonnage(z);
        assertEquals(l.getLesPersonnages().size(), 1);
    }

    @Test
    public void ajoutContenant() throws Exception {
        l.ajoutContenant(c);
        l.ajoutContenant(c);
        assertEquals(l.getLesContenants().size(), 1);
    }

}