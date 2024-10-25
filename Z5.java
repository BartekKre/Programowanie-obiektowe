import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Z5 {
    public static void zad1(){
        ArrayList<Integer>tab1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer>tab2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>(tab1);
        result.addAll(tab2);
        System.out.println(result);
    }

    public static void zad2(){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> tab2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>();
        int size1 = tab1.size();
        int size2 = tab2.size();
        int i = 0, j = 0;
        while (i < size1 && j < size2){
            result.add(tab1.get(i++));
            result.add(tab2.get(j++));
        }
        while (i < size1){
            result.add(tab1.get(i++));
        }
        while (j < size2){
            result.add(tab2.get(j++));
        }
        System.out.println(result);
    }

    public static void zad3(){
        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> tab2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>(tab1);
        result.addAll(tab2);
        Collections.sort(result);
        System.out.println(result);
    }

    public static void zad4(){
        int liczba = 54321;
        String liczbaString = String.valueOf(liczba);
        ArrayList<Integer> result = new ArrayList<>();
        for(char c : liczbaString.toCharArray()){
            result.add(Character.getNumericValue(c));
        }
        result.sort(Integer::compareTo);
        System.out.println(result);
    }

    public static void zad5a(){
        ArrayList<String> charList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        char znak = 'c';
        boolean result = charList.contains(String.valueOf(znak));
        System.out.println(result);
    }

    public static void zad5b(){
        ArrayList<Integer> digitList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int cyfra = 3;
        boolean result = digitList.contains(cyfra);
        System.out.println(result);
    }

    public static void zad6(){
        ArrayList<String> charList = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "a"));
        char znak = 'a';
        long countChar = charList.stream().filter(c -> c.equals(String.valueOf(znak))).count();
        System.out.println(countChar);

        ArrayList<Integer> digitList = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1));
        int cyfra = 1;
        long countDigit = digitList.stream().filter(c -> c == cyfra).count();
        System.out.println(countDigit);
    }

    public static void zad7(){
        ArrayList<String> charList = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "a"));
        ArrayList<ArrayList<String>> resultChar = new ArrayList<>();
        charList.stream().distinct().forEach(c -> resultChar.add(new ArrayList<>(Arrays.asList(c, "0"))));
        System.out.println(resultChar);

        ArrayList<Integer> digitList = new ArrayList<>(Arrays.asList(1, 4, 5, 5, 7, 7));
        ArrayList<ArrayList<Integer>> resultDigit = new ArrayList<>();
        digitList.stream().distinct().forEach(d -> resultDigit.add(new ArrayList<>(Arrays.asList(d, 0))));
        System.out.println(resultDigit);
    }

    public static void zad8(){
        ArrayList<String> charList = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "a"));
        ArrayList<ArrayList<Object>> resultChar = new ArrayList<>();
        charList.stream().distinct().forEach(c -> {
            long count = charList.stream().filter(e -> c.equals(e)).count();
            resultChar.add(new ArrayList<>(Arrays.asList(c, count)));
        });
        System.out.println(resultChar);

        ArrayList<Integer> digitList = new ArrayList<>(Arrays.asList(1, 4, 5, 5, 7, 7));
        ArrayList<ArrayList<Object>> resultDigit = new ArrayList<>();
        digitList.stream().distinct().forEach(d -> {
            long count = digitList.stream().filter(e -> e == d).count();
            resultDigit.add(new ArrayList<>(Arrays.asList(d, count)));
        });
        System.out.println(resultDigit);
    }

    public static void main(String[] args){
        System.out.println("Zadanie 1:");
        zad1();
        System.out.println("\nZadanie 2:");
        zad2();
        System.out.println("\nZadanie 3:");
        zad3();
        System.out.println("\nZadanie 4:");
        zad4();
        System.out.println("\nZadanie 5a:");
        zad5a();
        System.out.println("\nZadanie 5b:");
        zad5b();
        System.out.println("\nZadanie 6:");
        zad6();
        System.out.println("\nZadanie 7:");
        zad7();
        System.out.println("\nZadanie 8:");
        zad8();
    }
}