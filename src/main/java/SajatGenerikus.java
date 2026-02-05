import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SajatGenerikus {
    public static void main(String[] args) {
        List<String> nevek = new ArrayList<>(List.of("Ede", "Pál"));
        List<Double> atlagok = new ArrayList<>(List.of(3.14, 2.65));

        listatKiir(nevek);
        listatKiir(atlagok);

        atir(nevek, "Pisti");
        atir(atlagok, 4.56);

        listatKiir(nevek);
        listatKiir(atlagok);

        hozzaad(nevek, "Anna");
        hozzaad(atlagok, 5.00);

        listatKiir(nevek);
        listatKiir(atlagok);

        listaKiirMetodusReferenciaval(nevek);
        listaKiirMetodusReferenciaval(atlagok);
    }

    static <T> void atir(List<T> lista, T ujErtek) {
        lista.set(0, ujErtek);
    }

    static <T> void hozzaad(List<T> lista, T elem) {
        lista.add(elem);
    }

    static void listatKiir(List<?> lista) {
        for (Object elem : lista) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    static <T> void listaKiirMetodusReferenciaval(List<T> lista) {
//        for (T elem : lista) {
//            System.out.println(elem);
//        }

        lista.forEach(System.out::println);
    }
}