package szachy;

import szachy.figury.*;

import java.util.ArrayList;
import java.util.List;

public class Szachownica {
    public Figura[][] szachownica = new Figura[8][8];
    public List<Figura> zbite = new ArrayList<>();

    public Szachownica() {
        nowaSzachownica();
    }

    public Figura zabierzPionek(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Pole poza szachownicą!");
        }
        if (null == szachownica[x][y]) {
            System.out.println("Puste pole");
            return null;
        } else {
            return szachownica[x][y];
        }
    }

    public void ustawianiePozycji(Figura f, int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Pole poza szachownicą!");
        }
        Pozycja p = f.getPozycja();

        if (f.czyDozRuch(f.getPozycja(), new Pozycja(x, y))) {
            if (null != szachownica[x][y]) {
                if (szachownica[x][y].getColor() == f.getColor()) {
                    System.out.println("Chcesz zbić swój pionek! (" + szachownica[x][y].getName() + ")");
                } else {

                    System.out.println("Udało Ci się zbić pionek: " + szachownica[x][y]);
                    szachownica[x][y].kill();
                    zbite.add(szachownica[x][y]);

                    if (czyGrac(szachownica[x][y])) {
                        System.exit(0);
                    }

                    szachownica[p.getX()][p.getY()] = null;
                    szachownica[x][y] = f;

                    f.setPozycja(new Pozycja(x, y));

                    if (f.getTypFigury() == TypFigury.PIONEK) {
                        if (f.czyAwansuj((Pionek) f.Awansuj(f))) ;
                    }

                    System.out.println("Przesunięto " + f.getName() + " na " + x + ", " + y);
                    return;
                }
            }
            f.setPozycja(new Pozycja(x, y));
            szachownica[p.getX()][p.getY()] = null;
            szachownica[x][y] = f;
            System.out.println("Przesunięto " + f.getName() + " na " + x + ", " + y);
        } else {
            System.out.println("Niedozwolony ruch");
        }
    }

    public boolean czyGrac(Figura figura) {
        if (!figura.getName().equals("Król")) return false;
        if (zbite.contains(figura)) {
            Kolor kolor = figura.getColor() == Kolor.BIALY ? Kolor.BIALY : Kolor.CZARNY;
            System.out.println("Wygrywa " + kolor);
            return true;
        }
        return false;
    }

    public void nowaSzachownica() {
        //Białe
        szachownica[0][0] = new Wieza("Wieża_L", Kolor.BIALY, new Pozycja(0, 0));
        szachownica[0][1] = new Skoczek("Skoczek_L", Kolor.BIALY, new Pozycja(0, 1));
        szachownica[0][2] = new Goniec("Goniec_L", Kolor.BIALY, new Pozycja(0, 2));
        szachownica[0][3] = new Krol("Król", Kolor.BIALY, new Pozycja(0, 3));
        szachownica[0][4] = new Hetman("Hetman", Kolor.BIALY, new Pozycja(0, 4));
        szachownica[0][5] = new Goniec("Goniec_P", Kolor.BIALY, new Pozycja(0, 5));
        szachownica[0][6] = new Skoczek("Skoczek_P", Kolor.BIALY, new Pozycja(0, 6));
        szachownica[0][7] = new Wieza("Wieża_P", Kolor.BIALY, new Pozycja(0, 7));

        szachownica[1][0] = new Pionek("Pionek_1", Kolor.BIALY, new Pozycja(1, 0));
        szachownica[1][1] = new Pionek("Pionek_2", Kolor.BIALY, new Pozycja(1, 1));
        szachownica[1][2] = new Pionek("Pionek_3", Kolor.BIALY, new Pozycja(1, 2));
        szachownica[1][3] = new Pionek("Pionek_4", Kolor.BIALY, new Pozycja(1, 3));
        szachownica[1][4] = new Pionek("Pionek_5", Kolor.BIALY, new Pozycja(1, 4));
        szachownica[1][5] = new Pionek("Pionek_6", Kolor.BIALY, new Pozycja(1, 5));
        szachownica[1][6] = new Pionek("Pionek_7", Kolor.BIALY, new Pozycja(1, 6));
        szachownica[1][7] = new Pionek("Pionek_8", Kolor.BIALY, new Pozycja(1, 7));
        //Czarne
        szachownica[7][0] = new Wieza("Wieża_L", Kolor.CZARNY, new Pozycja(7, 0));
        szachownica[7][1] = new Skoczek("Skoczek_L", Kolor.CZARNY, new Pozycja(7, 1));
        szachownica[7][2] = new Goniec("Goniec_L", Kolor.CZARNY, new Pozycja(7, 2));
        szachownica[7][3] = new Krol("Król", Kolor.CZARNY, new Pozycja(7, 3));
        szachownica[7][4] = new Hetman("Hetman", Kolor.CZARNY, new Pozycja(7, 4));
        szachownica[7][5] = new Goniec("Goniec_P", Kolor.CZARNY, new Pozycja(7, 5));
        szachownica[7][6] = new Skoczek("Skoczek_P", Kolor.CZARNY, new Pozycja(7, 6));
        szachownica[7][7] = new Wieza("Wieża_P", Kolor.CZARNY, new Pozycja(7, 7));

        szachownica[6][0] = new Pionek("Pionek_1", Kolor.CZARNY, new Pozycja(6, 0));
        szachownica[6][1] = new Pionek("Pionek_2", Kolor.CZARNY, new Pozycja(6, 1));
        szachownica[6][2] = new Pionek("Pionek_3", Kolor.CZARNY, new Pozycja(6, 2));
        szachownica[6][3] = new Pionek("Pionek_4", Kolor.CZARNY, new Pozycja(6, 3));
        szachownica[6][4] = new Pionek("Pionek_5", Kolor.CZARNY, new Pozycja(6, 4));
        szachownica[6][5] = new Pionek("Pionek_6", Kolor.CZARNY, new Pozycja(6, 5));
        szachownica[6][6] = new Pionek("Pionek_7", Kolor.CZARNY, new Pozycja(6, 6));
        szachownica[6][7] = new Pionek("Pionek_8", Kolor.CZARNY, new Pozycja(6, 7));
    }

    public void wyczyscSzachownice() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                szachownica[i][j] = null;
            }
        }
    }

    public void wypiszWszystko() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (null != szachownica[i][j])
                    System.out.println(szachownica[i][j]);
            }
        }
    }
}

