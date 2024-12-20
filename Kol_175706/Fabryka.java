import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> elfy = new ArrayList<>();
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlGeo, double szGeo) {
        setDlGeo(dlGeo);
        setSzGeo(szGeo);
    }

    public void dodajPracowanika(Elf elf){
        elfy.add(elf);
    }

    public void usunPracownika(Elf elf){
        elfy.remove(elf);
    }

    public Elf najstarszyPracownik(){
        return elfy.stream().max((e1, e2) -> Integer.compare(e1.getWiek(), e2.getWiek())).orElse(null);
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "elfy=" + elfy +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabryka)) return false;
        Fabryka fabryka = (Fabryka) o;
        return Double.compare(fabryka.dlGeo, dlGeo) == 0 &&
                Double.compare(fabryka.szGeo, szGeo) == 0 &&
                Objects.equals(elfy, fabryka.elfy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elfy, dlGeo, szGeo);
    }
    public double getDlGeo() {
        return dlGeo;
    }
    public void setDlGeo(double dlGeo) {
        if (dlGeo < -180 || dlGeo > 180) {
            throw new IllegalArgumentException("Wartosc dlGeo musi być w przedziale -180 do 180");
        }
        this.dlGeo = dlGeo;
    }
    public double getSzGeo() {
        return szGeo;
    }
    public void setSzGeo(double szGeo) {
        if (szGeo < -90 || szGeo > 90) {
            throw new IllegalArgumentException("Wartosc szGeo musi być w przedziale -90 do 90");
        }
        this.szGeo = szGeo;
    }
}
