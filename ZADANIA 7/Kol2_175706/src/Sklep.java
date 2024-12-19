import java.util.Date;

class Sklep {
    private String nazwaSklepu;
    private Date dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, Date dataPowstania, Magazyn magazynSklepu) {
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }
}