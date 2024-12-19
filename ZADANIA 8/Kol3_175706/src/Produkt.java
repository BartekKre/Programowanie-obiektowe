class Produkt implements DostepneMetody {
    protected String nazwa;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Produkt: " + nazwa);
    }
}
