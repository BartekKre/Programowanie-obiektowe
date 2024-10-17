import java.util.Scanner;

public class Main {

    public static void trojkiPitagorejskie(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                for (int c = b + 1; c <= n; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n1) {
        for (int a = -n1; a <= n1; a++) {
            if (a == 0) continue;
            for (int b = -n1; b <= n1; b++) {
                for (int c = -n1; c <= n1; c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> delta = " + delta);
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n) {
        for (int a = -n; a <= n; a++) {
            if (a == 0) continue;
            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    int sqrtDelta = (int) Math.sqrt(delta);
                    if (delta >= 0 && sqrtDelta * sqrtDelta == delta) {
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> delta = " + delta);
                    }
                }
            }
        }
    }

    public static void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void liczbyPodzielne(int m, int n) {
        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;

        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    public static void piramida(int n, int variant) {
        if (variant == 1) {
            // Wariant 1 - klasyczna piramida
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (variant == 2) {
            // Wariant 2 - odwrócona piramida
            for (int i = n; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static long silnia(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long silniaPodwojna(int n) {
        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static long silnia(int n, int m) {
        long result = 1;
        for (int i = m; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ZADANIE 10
    public static long silnia2(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long dwumianNewtona(int n, int k) {
        return silnia2(n) / (silnia2(k) * silnia2(n - k));
    }
    //

    public static void ciagFibonacciego(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static int sumaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int sumaParzystych(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaNieparzystych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaKwaNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    public static int sumaSzeNaturalnych(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i * i;
        }
        return suma;
    }

    public static double sumaOdwNaturalnych(int n) {
        double suma = 0.0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        return suma;
    }

    public static boolean czyPalindrom(String wyraz) {
        String reverse = new StringBuilder(wyraz).reverse().toString();
        return wyraz.equals(reverse);
    }

    public static void trojkatPascala(int n) {
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean czyPalindrom(int n) {
        String liczba = String.valueOf(n);
        String reverse = new StringBuilder(liczba).reverse().toString();
        return liczba.equals(reverse);
    }

    public static boolean czyDoskonala(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;
    }

    public static boolean czyPierwsza(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] wczytajTablice(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[n];
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    public static void podzbiory(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        int n = 30;
        trojkiPitagorejskie(n);
        System.out.println("\nZadanie 2");
        int n1 = 2;
        funKwaRozwiazania(n1);
        System.out.println("\nZadanie 3");
        funKwaDelta(10);
        System.out.println("\nZadanie 4");
        liczbyPierwsze(50);
        System.out.println("\nZadanie 5");
        liczbyPodzielne(3, 5);
        System.out.println("\nZadanie 6");
        piramida(5, 1);
        System.out.println("\nZadanie 7");
        System.out.println(silnia(5));
        System.out.println("\nZadanie 8");
        System.out.println(silniaPodwojna(5));
        System.out.println("\nZadanie 9");
        System.out.println(silnia(10, 5));
        System.out.println("\nZadanie 10");
        System.out.println(dwumianNewtona(5, 2));
        System.out.println("\nZadanie 11");
        ciagFibonacciego(10);
        System.out.println("\nZadanie 12");
        System.out.println("Suma liczb naturalnych: " + sumaNaturalnych(10));
        System.out.println("Suma liczb parzystych: " + sumaParzystych(10));
        System.out.println("Suma liczb nieparzystych: " + sumaNieparzystych(10));
        System.out.println("Suma kwadratów liczb naturalnych: " + sumaKwaNaturalnych(10));
        System.out.println("Suma sześcianów liczb naturalnych: " + sumaSzeNaturalnych(10));
        System.out.println("Suma odwrotności liczb naturalnych: " + sumaOdwNaturalnych(10));
        System.out.println("\nZadanie 13");
        System.out.println(czyPalindrom("kajak"));
        System.out.println("\nZadanie 14");
        trojkatPascala(5);
        System.out.println("\nZadanie 15");
        System.out.println(czyPalindrom(12321));
        System.out.println("\nZadanie 16");
        System.out.println(czyDoskonala(6));
        System.out.println("\nZadanie 17");
        System.out.println(czyPierwsza(11));
        System.out.println("\nZadanie 18");
        System.out.println(NWD(48, 18));
        System.out.println("\nZadanie 19");
        int[] tablica = wczytajTablice(5);
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println("\nZadanie 20");
        int[] tablica2 = {1, 2, 3};
        podzbiory(tablica2);
    }
}