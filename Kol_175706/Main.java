public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Janek", 120, "produkcja zabawek");

        Fabryka fabryka = new Fabryka(45.0, 90.0);

        fabryka.dodajPracowanika(elf1);

        System.out.println("Najstarszy pracownik: " + fabryka.najstarszyPracownik());
        elf1.przedstawSie();

        System.out.println();

        Renifer renifer1 = new Renifer("Rudolf", 30);
        renifer1.nakarmRenifera();
        System.out.println(renifer1);

        Sanie sanie = new Sanie();
        sanie.dodajRenifera(renifer1);
        System.out.println("Suma predkosci reniferow: " + sanie.sumaPredkosci());
    }
}