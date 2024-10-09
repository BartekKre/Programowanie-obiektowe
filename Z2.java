import java.util.Scanner;
import java.lang.Math;

public class Z2 {
    public static void zad1() {
        System.out.println("23.0+76: " + (23.0 + 76) + " -> typ: double");
        System.out.println("41*2.0+3: " + (41*2.0+3) + " -> typ: double");
        System.out.println("5-33: " + (5-33) + " -> typ: int");
        System.out.println("109%3: " + (109%3) + " -> typ: int");
        System.out.println("50/2: " + (50/2) + " -> typ: int");
        System.out.println("4|2: " + (4|2) + " -> typ: int");
        System.out.println("3^5: " + (3^5) + " -> typ: int");
        System.out.println("7&9: " + (7&9) + " -> typ: int");
    }

    public static void zad2() {
        System.out.println("\nZadanie 2: Obliczenia");

        // 1. Pierwsze działanie
        double result1 = (Math.sqrt(7 - 1) / 2) + (3 % 2);
        int intResult1 = (int) result1;
        System.out.println("Wynik 1: " + intResult1);

        // 2. Operacja na dacie urodzenia
        int rokUrodzenia = 2003;
        int dzienUrodzenia = 30;
        int miesiacUrodzenia = 5;
        int wynik2 = rokUrodzenia / (dzienUrodzenia * miesiacUrodzenia);
        System.out.println("Wynik 2: " + wynik2);

        // 3. Trzecie działanie
        double result3 = (3 + Math.sqrt(3)) / (Math.sqrt(5.0 / 2) / 3) + 1;
        int intResult3 = (int) result3;
        System.out.println("Wynik 3: " + intResult3);

        // 4. Operacja a % b % c (wybór wartości)
        int a = 10, b1 = 3, c = 2;
        int result4 = a % b1 % c;
        System.out.println("Wynik 4: " + result4);

        // 5. Operacja na długościach nazwiska i imienia
        String nazwisko = "Kowalski";
        String imie = "Jan";
        int nazwiskoLength = nazwisko.length();
        int imieLength = imie.length();
        int result5 = (nazwiskoLength % imieLength) + 1;
        System.out.println("Wynik 5: " + result5);

        // 6. Obliczenie 4/√2
        double result6 = 4 / Math.sqrt(2);
        int intResult6 = (int) result6;
        System.out.println("Wynik 6: " + intResult6);
    }

    public static void zad3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nZadanie 3: Pobieranie dwóch słów");
        System.out.println("Podaj pierwsze słowo:");
        String word1 = scanner.nextLine();
        System.out.println("Podaj drugie słowo:");
        String word2 = scanner.nextLine();
        System.out.println("Wprowadziłeś: " + word1 + " i " + word2);
    }

    public static void zad4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nZadanie 4: Pobieranie dwóch liczb");
        System.out.println("Podaj pierwszą liczbę:");
        int num1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int num2 = scanner.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Różnica: " + (num1 - num2));
        System.out.println("Iloczyn: " + (num1 * num2));
        System.out.println("Iloraz: " + (num1 / num2));
    }

    public static void zad5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nZadanie 5: Operacje na liczbie x");
        System.out.println("Podaj liczbę x:");
        int x = scanner.nextInt();
        System.out.println("Zwiększona o 140: " + (x + 140));
        System.out.println("Pomniejszona o 31: " + (x - 31));
        System.out.println("Zwiększona 7 razy: " + (x * 7));
        System.out.println("Pomniejszona 13 razy: " + (x / 13));
        System.out.println("Modulo 7: " + (x % 7));
        System.out.println("Część całkowita z dzielenia przez 4: " + (x / 4));
        System.out.println("Podniesiona do potęgi 45: " + (int) Math.pow(x, 45));
        System.out.println("Bitowy OR z 6: " + (x | 6));
        System.out.println("Suma bitowa z 59: " + (x ^ 59));
        System.out.println("XOR z 23: " + (x ^ 23));
        System.out.println("Przesunięcie o 3 bity w lewo: " + (x << 3));
        System.out.println("Przesunięcie o 6 bitów w prawo: " + (x >> 6));
    }

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }
}
