import java.util.ArrayList;
import java.util.List;

class Sklep {
    private List<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferte() {
        for (Produkt produkt : produkty) {
            produkt.wyswietlInformacje();
        }
    }
}