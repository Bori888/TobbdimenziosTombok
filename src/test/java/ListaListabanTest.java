import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListaListabanTest {
    private ListaListaban ll;

    @BeforeEach
    void setUp() {
        ll = new ListaListaban();
    }

    @Test
    void testMindenElem1_5kozotti() {
        for (int i = 0; i < ll.getTargyak().size(); i++) {
            for (int szam : ll.getMulti().get(i)) {
                assertTrue(szam >= 1 && szam <= 5,
                        "Találtunk nem 1 és 5 közötti számot: " + szam);
            }
        }
    }

    @Test
    void testMindenTargyMin3jeggyel() {
        for (int i = 0; i < ll.getTargyak().size(); i++) {
            assertTrue(ll.getMulti().get(i).size() >= 3,
                    "A(z) " + ll.getTargyak().get(i) + " tárgyhoz kevesebb mint 3 szám tartozik!");
        }
    }
}