import java.util.Date;
import java.util.List;

class KoszykZakupowy {
    private List<Produkt> produkty;
    private int ilosc;

    public KoszykZakupowy(List<Produkt> produkty, int ilosc) {
        this.produkty = produkty;
        this.ilosc = ilosc;
    }
}
