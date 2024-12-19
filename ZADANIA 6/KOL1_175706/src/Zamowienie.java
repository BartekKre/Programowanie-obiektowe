class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
    }

    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }

    public void wyswietlZamowienie() {
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
    }

    public double obliczCalkowitaWartosc() {
        return koszykZakupowy.obliczCalkowitaWartosc();
    }

    public void finalizujZamowienie(Platnosc platnosc) {
        if (platnosc.getStatusPlatnosci().equals("Oplacone")) {
            ustawStatusZamowienia("Gotowe do wysylki");
        }
    }
}