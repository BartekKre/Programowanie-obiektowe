import java.util.HashMap;
import java.util.Map;

class KoszykZakupowy {
    private Map<Produkt, Integer> produkty;

    public KoszykZakupowy() {
        produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.usunZMagazynu(ilosc)) {
            produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka() {
        for (Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey().getNazwa() + " - " + entry.getValue());
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0.0;
        for (Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
            suma += entry.getKey().getCena() * entry.getValue();
        }
        return suma;
    }
}