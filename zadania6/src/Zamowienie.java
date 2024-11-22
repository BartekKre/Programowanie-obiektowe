public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Nowe";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void ustawStatusZamowienia(String status){
        this.statusZamowienia = status;
    }

    public void wyswietlZamowienie(){
        System.out.println("Zamówienie: ");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
        System.out.println("Status platnosci: " + platnosc.getStatusPlatnosci());
    }

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("oplacone")){
            this.statusZamowienia = "Gotowe do wysyłki";

            System.out.println("Zamowienie zostalo zfinalizowane i jest gotowe do wysylki");
        }
        else{
            System.out.println("Zamowienie nie moze zostac zrealizowane, poniewaz platnosc nie zostala dokonana");
        }
    }
    public void zwrocProdukt(String nazwaProduktu, int ilosc){
        for (Produkt produkt: koszykZakupowy.getProdukty()){
            if(produkt.getNazwa().equalsIgnoreCase(nazwaProduktu)){
                if(ilosc <= produkt.getiloscNaMagazynie()){
                    produkt.dodajDoMagazynu(ilosc);
                    double zwroconaKwota = produkt.getCena()*ilosc;

                    platnosc.setKwota(platnosc.getKwota() - zwroconaKwota);

                    System.out.println("Zwrot produktu "+ nazwaProduktu + " w ilosci "+ ilosc + " zostal zwrocony");
                    return;
                }
                else{
                    System.out.println("Nie można zwrocic wiecej niz jest w koszyku");
                }
            }
        }
        System.out.println("Produkt o nazwie "+ nazwaProduktu + " nie znajduje sie w zamowieniu");
    }
}
