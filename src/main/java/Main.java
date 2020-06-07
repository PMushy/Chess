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
        szachownica.wypiszWszystko();
        System.out.println("Nowa gra\n");
        do {
            System.out.println("Wybierz figurę:");
            System.out.print("X:");
            x = scanner.nextInt();
            System.out.print("Y:");
            y = scanner.nextInt();
            f = szachownica.zabierzPionek(x, y);
            if (null != f) {
                System.out.println("Wybierz gdzie chcesz przesunąć " + f.getName() + ":");
                System.out.print("X:");
                x = scanner.nextInt();
                System.out.print("Y:");
                y = scanner.nextInt();
                szachownica.ustawianiePozycji(f, x, y);
            }
        } while (true);

    }
}
