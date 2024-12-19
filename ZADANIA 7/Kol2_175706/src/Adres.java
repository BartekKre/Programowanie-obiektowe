class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        this(ulica, numerDomu, miasto, kodPocztowy);
        this.numerMieszkania = numerMieszkania;
    }

    public void pokaz() {
        if (numerMieszkania == null) {
            System.out.println(kodPocztowy + ", " + miasto);
        } else {
            System.out.println(kodPocztowy + ", " + miasto + ", mieszkanie: " + numerMieszkania);
        }
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", numerMieszkania='" + numerMieszkania + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}