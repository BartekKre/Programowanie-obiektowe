import java.util.ArrayList;
import java.util.List;

public class Sklep {
    private List<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        System.out.println("Dodano produkt do sklepu: " + produkt.getNazwa());
    }

    public void wyswietlOferte(){
        System.out.println("Oferta sklepu: ");
        for (Produkt produkt : produkty) {
            System.out.println("- " + produkt.getNazwa() + " | Cena: "
                    + produkt.getCena() + "zł | Ilosc: " + produkt.getiloscNaMagazynie());
        }
    }

    public Produkt wyszukajProdukt(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase(nazwa)) {
                return produkt;
            }
        }
        return null;
    }

    public void zakupy(Klient klient, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if (produkt != null) {
            KoszykZakupowy koszyk = new KoszykZakupowy();

            koszyk.dodajProdukt(produkt, ilosc);
            Zamowienie zamowienie = new Zamowienie(koszyk);

            klient.dodajZamowiene(zamowienie);
        }
        else{
            System.out.println("Produkt o nazwie " + nazwaProduktu + " nie zostal znaleziony");
        }
    }
}
