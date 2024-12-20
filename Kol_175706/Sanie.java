import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> renifery = new ArrayList<>();

    public void dodajRenifera(Renifer renifer) {
        renifery.add(renifer);
    }

    public int sumaPredkosci() {
        return renifery.stream().mapToInt(Renifer::getPredkosc).sum();
    }

    public Renifer najwolniejszyRenifer() {
        return renifery.stream().min((r1, r2) -> Integer.compare(r1.getPredkosc(),
                r2.getPredkosc())).orElse(null);
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "renifery=" + renifery + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sanie)) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(renifery, sanie.renifery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(renifery);
    }
}
