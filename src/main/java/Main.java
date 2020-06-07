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

//        //Porównywanie figur
//        Figura pionek = new Pionek("Heniek", Kolor.CZARNY, new Pozycja(0,1));
//        Figura pionek1 = new Pionek("heniek", Kolor.BIALY, new Pozycja(1,0));
//        Figura.PorownajFigury(pionek1, pionek);


//        //Wzorzec projektowy
//        Figura goniecFactory = Figura.FiguraFactory(TypFigury.GONIEC);

//        //Gra w szachy

        System.out.println("NOWA GRA\n");
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
