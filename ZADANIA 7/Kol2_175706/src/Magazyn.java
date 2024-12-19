import java.util.List;

class Magazyn {
    private List<Produkt> produkty;
    private int ilosc;

    public Magazyn(List<Produkt> produkty, int ilosc) {
        this.produkty = produkty;
        this.ilosc = ilosc;
    }

    public void wyswietlAsortyment() {
        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }
    }
}