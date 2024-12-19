public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + " zł");
        System.out.println("Ilość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        if (ilosc > 0) {
            iloscNaMagazynie += ilosc;
        }
    }

    public boolean usunZMagazynu(int ilosc) {
        if (ilosc > 0 && ilosc <= iloscNaMagazynie) {
            iloscNaMagazynie -= ilosc;
            return true;
        }
        return false;
    }
}