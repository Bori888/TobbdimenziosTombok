import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenerikusHalmazTest {

    private GenerikusHalmaz gh;

    @BeforeEach
    void setUp() {
        gh = new GenerikusHalmaz();
    }

    @Test
    void testMindenSzam1Es90KozottVan() {
        for (int szam : gh.getHalmaz()) {
            assertTrue(szam >= 1 && szam <= 90,
                    "Nem 1 és 90 közötti szám van a halmazban: " + szam);
        }
    }

    @Test
    void testLegfeljebb10ElemVan() {
        assertTrue(gh.getHalmaz().size() <= 10,
                "Több mint 10 elem van a halmazban!");
    }
}