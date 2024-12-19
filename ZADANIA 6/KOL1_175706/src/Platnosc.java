class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieoplacone";
    }

    public void zaplac(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Oplacone";
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}