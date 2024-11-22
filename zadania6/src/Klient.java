import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private List<Zamowienie>listaZamowien;

    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowiene(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamowienie do historii zamowien klienta");
    }

    public void wyswietlHistorieZamowien(){
        System.out.println("Historia zamowien kienta: " + imie + " " + nazwisko);
        if (listaZamowien.isEmpty()){
            System.out.println("Brak zamowien");
        }
        else{
            for(int i = 0; i < listaZamowien.size(); i++){
                Zamowienie zamowienie = listaZamowien.get(i);
                System.out.println("Zamowienie " + (i + 1) + ":");
                zamowienie.wyswietlZamowienie();
                System.out.println();
            }
        }
    }

    public double obliczLacznyKosztZamowien(){
        double suma = 0;
        for (Zamowienie zamowienie: listaZamowien){
            suma += zamowienie.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return suma;
    }
}
