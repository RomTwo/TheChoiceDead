import Sortie.Verrouille;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerrouilleTest {

    Verrouille v = new Verrouille("v", null);

    @Test
    public void deverouiller() throws Exception {

        String str = v.getCodeSecret();

        v.deverouiller("knkldqslqs");
        assertEquals(v.isVerrou(), true);

        v.deverouiller(str);
        assertEquals(v.isVerrou(), false);


        v.deverouiller("knkldqslqs");
        assertEquals(v.isVerrou(), false);

    }

}