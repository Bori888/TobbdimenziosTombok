import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenerikusMap {
    private HashMap<String, Integer> kulcsaErtek;

    public static void main(String[] args) {
        System.out.println(new GenerikusMap().kulcsaErtek);
    }

    public GenerikusMap() {
        kulcsaErtek = new HashMap<>();
        kulcsaErtek.put("SQL", 5);
        kulcsaErtek.put("Prog", 4);
        kulcsaErtek.put("Matek", 3);
    }

    public void egyediMegjelenites() {
        for (Map.Entry<String, Integer> elem : kulcsaErtek.entrySet()) {
            String kulcs = elem.getKey();
            int ertek = elem.getValue();
            System.out.printf("[%s] = %d\n", kulcs, ertek);
        }
    }
}
