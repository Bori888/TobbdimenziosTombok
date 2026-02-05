import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class GenerikusMapTest {
    private GenerikusMap gm;
    @BeforeEach
    void setUp() {
        gm = new GenerikusMap();
    }

    @Test
    void testKonstruktorFeltoltes() {


        ByteArrayOutputStream kimenet = new ByteArrayOutputStream();
        System.setOut(new PrintStream(kimenet));

        gm.egyediMegjelenites();

        String output = kimenet.toString();

        assertTrue(output.contains("[SQL] = 5"));
        assertTrue(output.contains("[Prog] = 4"));
        assertTrue(output.contains("[Matek] = 3"));
    }

    @Test
    void testEgyediMegjelenitesFormatum() {
        ByteArrayOutputStream kimenet = new ByteArrayOutputStream();
        System.setOut(new PrintStream(kimenet));

        gm.egyediMegjelenites();

        String output = kimenet.toString();
        String[] sorok = output.split("\n");
        assertEquals(3, sorok.length, "nem pontosan 3 sor íródott ki");

        for (String sor : sorok) {
            assertTrue(sor.matches("\\[.+] = \\d+"),
                    "hibás formátum: " + sor);
        }
    }
}