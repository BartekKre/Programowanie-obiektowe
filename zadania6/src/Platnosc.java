public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieoplacone";
    }

    public void zaplac(){
        this.statusPlatnosci = "Oplacone";
        System.out.println("Platnosc w kwocie " + kwota + " zł zostala dokonana");
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
