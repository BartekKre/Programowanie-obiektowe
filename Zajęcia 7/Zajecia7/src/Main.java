import java.time.LocalDate;
import java.util.*;

// Klasa Magazyn
class Magazyn {
    private Map<String, Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(String nazwa, int ilosc) {
        produkty.put(nazwa, produkty.getOrDefault(nazwa, 0) + ilosc);
    }

    public void wyswietlAsortyment() {
        System.out.println("Asortyment magazynu:");
        for (Map.Entry<String, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Magazyn: " + produkty.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(produkty);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Magazyn magazyn = (Magazyn) obj;
        return Objects.equals(produkty, magazyn.produkty);
    }
}

// Klasa Adres
class Adres {
    private String ulica;
    private int numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerMieszkania = null;
    }

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this(ulica, numerDomu, miasto, kodPocztowy);
        this.numerMieszkania = numerMieszkania;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu +
                (numerMieszkania != null ? "/" + numerMieszkania : ""));
    }

    public boolean przed(Adres innyAdres) {
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }

    @Override
    public String toString() {
        return "Adres: " + ulica + " " + numerDomu +
                (numerMieszkania != null ? "/" + numerMieszkania : "") +
                ", " + miasto + " " + kodPocztowy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ulica, numerDomu, numerMieszkania, miasto, kodPocztowy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Adres adres = (Adres) obj;
        return numerDomu == adres.numerDomu &&
                Objects.equals(ulica, adres.ulica) &&
                Objects.equals(numerMieszkania, adres.numerMieszkania) &&
                Objects.equals(miasto, adres.miasto) &&
                Objects.equals(kodPocztowy, adres.kodPocztowy);
    }
}

// Klasa KoszykZakupowy
class KoszykZakupowy {
    private Map<String, Integer> produkty;
    private String nazwaSklepu;
    private LocalDate dataPowstania;

    public KoszykZakupowy(String nazwaSklepu) {
        this.produkty = new HashMap<>();
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = LocalDate.now();
    }

    public void dodajProdukt(String nazwa, int ilosc) {
        produkty.put(nazwa, produkty.getOrDefault(nazwa, 0) + ilosc);
    }

    public void wyswietlKoszyk() {
        System.out.println("Koszyk zakupowy w sklepie " + nazwaSklepu + ":");
        for (Map.Entry<String, Integer> entry : produkty.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "KoszykZakupowy: sklep = " + nazwaSklepu +
                ", data powstania = " + dataPowstania +
                ", produkty = " + produkty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaSklepu, dataPowstania, produkty);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        KoszykZakupowy koszyk = (KoszykZakupowy) obj;
        return Objects.equals(nazwaSklepu, koszyk.nazwaSklepu) &&
                Objects.equals(dataPowstania, koszyk.dataPowstania) &&
                Objects.equals(produkty, koszyk.produkty);
    }
}

// Klasa Klient
class Klient {
    private String imie;
    private String nazwisko;
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Klient: " + imie + " " + nazwisko + ", adres = " + adres;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Klient klient = (Klient) obj;
        return Objects.equals(imie, klient.imie) &&
                Objects.equals(nazwisko, klient.nazwisko) &&
                Objects.equals(adres, klient.adres);
    }
}

// Główna klasa do testowania
public class Main {
    public static void main(String[] args) {
        // Testowanie Magazynu
        Magazyn magazyn = new Magazyn();
        magazyn.dodajProdukt("Mleko", 20);
        magazyn.dodajProdukt("Chleb", 15);
        magazyn.wyswietlAsortyment();
        System.out.println(magazyn);

        // Testowanie Adresu
        Adres adres1 = new Adres("Kwiatowa", 10, "Warszawa", "00-001");
        Adres adres2 = new Adres("Różana", 5, 2, "Kraków", "30-002");
        adres1.pokaz();
        System.out.println(adres1.przed(adres2));
        System.out.println(adres1);

        // Testowanie KoszykaZakupowego
        KoszykZakupowy koszyk = new KoszykZakupowy("SuperMarket");
        koszyk.dodajProdukt("Jabłka", 10);
        koszyk.dodajProdukt("Banany", 5);
        koszyk.wyswietlKoszyk();
        System.out.println(koszyk);

        // Testowanie Klienta
        Klient klient = new Klient("Jan", "Kowalski", adres1);
        System.out.println(klient);
    }
}
