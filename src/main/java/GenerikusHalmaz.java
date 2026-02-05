import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class GenerikusHalmaz {
    private Set<Integer> halmaz;
    private Random rnd = new Random();

    public static void main(String[] args) {
        new GenerikusHalmaz();
    }

    public GenerikusHalmaz() {
        halmaz = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int szam = rnd.nextInt(90) + 1;
            halmaz.add(szam);
        }

        kiirHalmaz();
    }

    void kiirHalmaz() {
        for (int i : halmaz) {
            System.out.println(i);
        }
    }

    public Set<Integer> getHalmaz() {
        return halmaz;
    }
}
