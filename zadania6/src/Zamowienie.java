public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Nowe";
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
    }
}
