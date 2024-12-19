public class Main {
    public static void main(String[] args) {
        Adres adres = new Adres("Ul. Kwiatowa", "10A", "Warszawa", "00-123");
        Klient klient = new Klient("Jan", "Kowalski", adres);
        Produkt produkt = new Produkt("Chleb", 3.50);

        System.out.println(klient);
        System.out.println(produkt);
    }
}