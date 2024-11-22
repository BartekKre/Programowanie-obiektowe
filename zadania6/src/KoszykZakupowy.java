import java.util.ArrayList;
import java.util.List;

public class KoszykZakupowy {
    private List<Produkt> produkty;

    public KoszykZakupowy() {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt != null && produkt.getiloscNaMagazynie() >= ilosc){
            produkt.usunZMagazynu(ilosc);
            Produkt nowyProdukt = new Produkt(produkt.getNazwa(), produkt.getCena(), ilosc);
            produkty.add(nowyProdukt);
            System.out.println("Dodano produkt: " + nowyProdukt.getNazwa() + " w ilosci: " + ilosc);
        }
        else {
            System.out.println("Nie można dodać produktu. Niewystarczająca ilosc w magazynie");
        }
    }

    public void wyswietlZawartoscKoszyka(){
        System.out.println("Zawartosc koszyka: ");
        for (Produkt produkt : produkty) {
            System.out.println("- " + produkt.getNazwa() + " | Cena: "
                    + produkt.getCena() + "zł | Ilosc: " + produkt.getiloscNaMagazynie());
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for (Produkt produkt : produkty) {
            suma += produkt.getCena() * produkt.getiloscNaMagazynie();
        }
        return suma;
    }
    public List<Produkt> getProdukty() {
        return produkty;
    }
}
