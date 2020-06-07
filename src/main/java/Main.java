import szachy.Figura;
import szachy.Szachownica;
import szachy.figury.Hetman;
import szachy.figury.Pionek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Szachownica szachownica = new Szachownica();

        String val = "";
        int x, y;
        Figura f;

        Figura pionek = new Pionek();
        Figura pionek1 = new Pionek();
        Figura hetman = new Hetman();

        boolean prawda = pionek.equals(pionek1);
        System.out.println(prawda);

//        //Wzorzec projektowy
//        Figura goniecFactory = Figura.FiguraFactory(TypFigury.GONIEC);

//        //Gra w szachy
//        szachownica.wypiszWszystko();
//        System.out.println("NOWA GRA\n");
//        do {
//            System.out.println("Wybierz figurę:");
//            System.out.print("X:");
//            x = scanner.nextInt();
//            System.out.print("Y:");
//            y = scanner.nextInt();
//            f = szachownica.zabierzPionek(x, y);
//            if (null != f) {
//                System.out.println("Wybierz gdzie chcesz przesunąć " + f.getName() + ":");
//                System.out.print("X:");
//                x = scanner.nextInt();
//                System.out.print("Y:");
//                y = scanner.nextInt();
//                szachownica.ustawianiePozycji(f, x, y);
//            }
//        } while (true);
    }
}
