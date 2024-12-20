import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Cześć nazywam sie " + imie + ", mam " + wiek +
                " lat, a moje stanowisko pracy to " + stanowisko);
    }

    @Override
    public String toString() {
        return "Elf{" + "imie=' " +imie+'\'' + ", wiek=" +
                wiek + ", stanowisko='" + stanowisko + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Elf)) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek &&
                Objects.equals(imie, elf.imie) &&
                Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);

    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
