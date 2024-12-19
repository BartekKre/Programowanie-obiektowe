class Klient extends Osoba implements DostepneMetody {
    public Klient(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Klient: " + imie + " " + nazwisko);
    }
}
