import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Z1 {

    public static void zad1() {
        System.out.println("Bartłomiej Krejer");
    }

    public static void zad2() {
        String imie = "Bartłomiej Krejer";
        System.out.println(imie.length());
    }

    public static void zad3() {
        String kot = "Ala";
        String ala = "ma";
        String ma = "kota";
        String alamakota = kot + " " + ala + " " + ma;
        System.out.println(alamakota);
    }

    public static void zad4() {
        int i;
        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("*\n");

        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("* *\n");

        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("* * *\n");

        for(i = 0; i < 14; ++i) {
            System.out.print("* ");
        }

        System.out.print("\n");

        for(i = 0; i < 15; ++i) {
            System.out.print("* ");
        }

        System.out.print("\n");

        for(i = 0; i < 14; ++i) {
            System.out.print("* ");
        }

        System.out.print("\n");

        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("* * *\n");

        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("* *\n");

        for(i = 0; i < 20; ++i) {
            System.out.print(" ");
        }

        System.out.print("*\n");
    }

    public static void zad4_b() {
        int odstepy = 15;
        int gwiazdki = 1;

        int i;
        int k;
        for(i = 0; i < 6; ++i) {
            for(k = 0; k < odstepy; ++k) {
                System.out.print(" ");
            }

            for(k = 0; k < gwiazdki; ++k) {
                System.out.print("* ");
            }

            System.out.println();
            --odstepy;
            ++gwiazdki;
        }

        ++odstepy;
        --gwiazdki;

        for(i = 0; i < 5; ++i) {
            ++odstepy;
            --gwiazdki;

            for(k = 0; k < odstepy; ++k) {
                System.out.print(" ");
            }

            for(k = 0; k < gwiazdki; ++k) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void zad5() {
        String zdanie = "Ala ma kota";
        String noweZdanie = zdanie.replace('a', 'e');
        System.out.println(noweZdanie);
    }

    public static void zad6() {
        String zdanie = "Ala ma kota";
        StringBuilder noweZdanie = new StringBuilder();
        char[] var2 = zdanie.toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char c = var2[var4];
            if (Character.isUpperCase(c)) {
                noweZdanie.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                noweZdanie.append(Character.toUpperCase(c));
            } else {
                noweZdanie.append(c);
            }
        }
        System.out.println(noweZdanie);
    }

    public static void zad7() {
        System.out.println("A: " + (int) 'A');
        System.out.println("!: " + (int) '!');
        System.out.println("@: " + (int) '@');
        System.out.println(">: " + (int) '>');
        System.out.println("~: " + (int) '~');
        System.out.println("\\n: " + (int) '\n');
        System.out.println("\\b: " + (int) '\b');
    }

    public static void zad8() {
        System.out.print("Przedziały: \n");
        System.out.println("Małe litery: " + (int)'a' + " - " + (int)'z');
        System.out.println("Małe litery: " + (int)'A' + " - " + (int)'Z');
        System.out.println("Małe litery: " + (int)'0' + " - " + (int)'9');
    }

    public static void zad9() {
        String zdanie = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.";
        String slowo1 = "kot";
        String slowo2 = "zwierzęciem";
        String slowo3 = "wygląd";
        String wynik = zdanie.substring(0, 31) + slowo1 + zdanie.substring(34, 55) + slowo2 + zdanie.substring(58, 73) + slowo3 + zdanie.substring(76);
        System.out.println(wynik);
    }

    public static void zad10() {
        String zdanie = "... to najlepsza książka napisana przez ...";
        String tytul = "Hobbit";
        String autor = "J.R.R. Tolkiena";
        String wynik = tytul + zdanie.substring(3, 40) + autor;
        System.out.println(wynik);
    }

    public static void zad11() {
        for(int i = 0; i < 5; ++i) {
            System.out.print("wodrze");
        }

        System.out.print("\n");
    }

    public static void zad12() {
        LocalDateTime teraz = LocalDateTime.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatGodzina = DateTimeFormatter.ofPattern("HH:mm:ss");
        String data = teraz.format(formatData);
        String godzina = teraz.format(formatGodzina);
        String wynik = "Dzisiaj jest (" + data + ") godzina(" + godzina + ")";
        System.out.println(wynik);
    }

    public static void zad13() {
        System.out.println((char) 56);
        System.out.println((char) 103);
        System.out.println((char) 241);
        System.out.println((char) 67);
        System.out.println((char) 9999);
        String imie = "Bartłomiej Krejer";
        String newimie = imie.replaceAll("\\s", "");
        System.out.println((char) newimie.length());
        System.out.println((char) 175706);
    }

    public static void main(String[] args) {
        System.out.print("Zad1\n");
        zad1();
        System.out.print("\nZad2\n");
        zad2();
        System.out.print("\nZad3\n");
        zad3();
        System.out.print("\nZad4_a\n");
        zad4();
        System.out.print("\nZad4_b\n");
        zad4_b();
        System.out.print("\nZad5\n");
        zad5();
        System.out.print("\nZad6\n");
        zad6();
        System.out.print("\nZad7\n");
        zad7();
        System.out.print("\nZad8\n");
        zad8();
        System.out.print("\nZad9\n");
        zad9();
        System.out.print("\nZad10\n");
        zad10();
        System.out.print("\nZad11\n");
        zad11();
        System.out.print("\nZad12\n");
        zad12();
        System.out.print("\nZad13\n");
        zad13();
    }
}