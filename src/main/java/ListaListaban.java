import java.util.ArrayList;

public class ListaListaban {
    private ArrayList<String> targyak;
    private ArrayList<ArrayList<Integer>> multi;

    public static void main(String[] args) {
        new  ListaListaban();
    }

    public ListaListaban() {
        targyak = new ArrayList<>();
        targyak.add("SQL");
        targyak.add("Prog");

        multi = new ArrayList<>();
        multi.add(new ArrayList<>());
        multi.add(new ArrayList<>());
        multi.add(new ArrayList<>());

        multi.set(0, getSzamok(3, 5));
        multi.set(1, getSzamok(1, 2));
        multi.set(2, getSzamok(5, 2));
    }

    public ArrayList<String> getTargyak() {
        return targyak;
    }

    public ArrayList<ArrayList<Integer>> getMulti() {
        return multi;
    }

    public ArrayList<Integer> getSzamok(int tol, int ig) {
        ArrayList<Integer> szamok = new ArrayList<>();
        if (tol < ig) {
            for (int i = tol; i <= ig; i++) {
                szamok.add(i);
            }
        }else {
            for (int i = tol; i >= ig; i++) {
                szamok.add(i);
            }
        }

        return szamok;
    }

    public Object getMulti() {
        return null;
    }
}
