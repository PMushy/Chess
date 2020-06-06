import szachy.Figura;
import szachy.Szachownica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Szachownica szachownica = new Szachownica();
        String val = "";
        int x, y;
        Figura f;
        System.out.println("Nowa gra\n");
        do {
            System.out.println("Wybierz figurę:");
            x = scanner.nextInt();
            y = scanner.nextInt();
            f = szachownica.zabierzPionek(x, y);
            if (null != f) {
                System.out.println("Wybierz gdzie chcesz ją przesunąć:");
                x = scanner.nextInt();
                y = scanner.nextInt();
                szachownica.ustawianiePozycji(f, x, y);
            }

        } while (!val.contains("stop"));

    }
}
