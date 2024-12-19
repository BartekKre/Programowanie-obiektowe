import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Testowanie implementacji
        Jablko jablko = new Jablko();
        jablko.smak();
        jablko.umyj();
        jablko.zjedz();

        Ziemniak ziemniak = new Ziemniak();
        ziemniak.smak();
        ziemniak.umyj();
        ziemniak.zjedz();
    }
}