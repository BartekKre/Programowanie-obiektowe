public class Z6 {
    public static void zad1(){
    }

    public static void main(String[] args) {
        //PRODUKTY
        Produkt laptop = new Produkt("Laptop", 5799.99, 10);
        Produkt myszka = new Produkt("Myszka", 289.99, 50);

        //SKLEP
        Sklep sklep = new Sklep();
        sklep.dodajProdukt(laptop);
        sklep.dodajProdukt(myszka);

        sklep.wyswietl1Oferte();

        //KLIENT
        Klient klient = new Klient("Konstanty", "Mącipałka");
        sklep.zakupy(klient, "Laptop", 2);
        sklep.zakupy(klient, "Myszka", 5);

        klient.wyswietlHistorieZamowien();

        System.out.println("Laczny koszt zamowien: " + klient.obliczLacznyKosztZamowien() + "zł");
    }
}