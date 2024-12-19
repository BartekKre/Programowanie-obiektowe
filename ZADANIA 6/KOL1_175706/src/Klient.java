import java.util.ArrayList;
import java.util.List;

class Klient {
    private String imie;
    private String nazwisko;
    private List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien() {
        for (Zamowienie zamowienie : listaZamowien) {
            zamowienie.wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma = 0.0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.obliczCalkowitaWartosc();
        }
        return suma;
    }
}