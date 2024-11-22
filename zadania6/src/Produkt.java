public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + "zł");
        System.out.println("Ilosc na Magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        if (ilosc >0){
            iloscNaMagazynie += ilosc;
            System.out.println(ilosc + " sztuk dodano do magazynu");
        }
        else{
            System.out.println("Ilosc do dodania musi być większa niż 0");
        }
    }

    public void usunZMagazynu(int ilosc){
        if (ilosc > 0 && ilosc <= iloscNaMagazynie){
            iloscNaMagazynie -= ilosc;
            System.out.println(ilosc + " sztuk usunieto z magazynu");
        }
        else if(ilosc > iloscNaMagazynie) {
            System.out.println("Nie wolno usunac wiecej niz jest na magazynie");
        }
        else{
            System.out.println("Ilosc do usuniecia musi byc wieksza niz 0");
        }
    }

    // DO KLASY KoszykZakupowy
    public int getiloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}
