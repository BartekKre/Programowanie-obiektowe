public class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Laptop", 3500.0, 10);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        produkt.wyswietlInformacje();
        koszyk.dodajProdukt(produkt, 3);

        Zamowienie zamowienie = new Zamowienie(koszyk, "W realizacji");
        zamowienie.wyswietlZamowienie();

        Klient klient = new Klient("Jan", "Kowalski");
        klient.dodajZamowienie(zamowienie);
        klient.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamówień: " + klient.obliczLacznyKosztZamowien());

        Sklep sklep = new Sklep();
        sklep.dodajProdukt(new Produkt("Telefon", 1500.0, 20));
        sklep.dodajProdukt(produkt);
        sklep.wyswietlOferte();

        Platnosc platnosc = new Platnosc(0);
        platnosc.zaplac(zamowienie.obliczCalkowitaWartosc());
        zamowienie.finalizujZamowienie(platnosc);
        zamowienie.wyswietlZamowienie();
    }
}