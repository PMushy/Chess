package szachy;

import szachy.figury.*;

public class Szachownica {
    public Figura[][] szachownica = new Figura[8][8];

    public Szachownica() {
        nowaSzachownica();
    }

    public void ustawianiePozycji(Figura f, int x, int y) {
        szachownica[x][y] = f;
        if (f.czyDozRuch(f.getPozycja(), new Pozycja(x, y))) {
            f.setPozycja(new Pozycja(x, y));
        } else {
            System.out.println("Niedozwolony ruch");
        } ;
    }

    public void wypiszWszystko() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (null != szachownica[i][j])
                    System.out.println(szachownica[i][j]);
            }
        }
    }

    public void nowaSzachownica() {
        //Białe
        szachownica[0][0] = new Wieza("Wieża L", Kolor.BIALY, new Pozycja(0, 0));
        szachownica[0][1] = new Skoczek("Skoczek L", Kolor.BIALY, new Pozycja(0, 1));
        szachownica[0][2] = new Goniec("Goniec L", Kolor.BIALY, new Pozycja(0, 2));
        szachownica[0][3] = new Krol("Krol L", Kolor.BIALY, new Pozycja(0, 3));
        szachownica[0][4] = new Hetman("Hetman L", Kolor.BIALY, new Pozycja(0, 4));
        szachownica[0][5] = new Goniec("Goniec L", Kolor.BIALY, new Pozycja(0, 5));
        szachownica[0][6] = new Skoczek("Skoczek L", Kolor.BIALY, new Pozycja(0, 6));
        szachownica[0][7] = new Wieza("Wieża P", Kolor.BIALY, new Pozycja(0, 7));

        szachownica[1][0] = new Pionek("Pionek 1", Kolor.BIALY, new Pozycja(1, 0));
        szachownica[1][1] = new Pionek("Pionek 2", Kolor.BIALY, new Pozycja(1, 1));
        szachownica[1][2] = new Pionek("Pionek 3", Kolor.BIALY, new Pozycja(1, 2));
        szachownica[1][3] = new Pionek("Pionek 4", Kolor.BIALY, new Pozycja(1, 3));
        szachownica[1][4] = new Pionek("Pionek 5", Kolor.BIALY, new Pozycja(1, 4));
        szachownica[1][5] = new Pionek("Pionek 6", Kolor.BIALY, new Pozycja(1, 5));
        szachownica[1][6] = new Pionek("Pionek 7", Kolor.BIALY, new Pozycja(1, 6));
        szachownica[1][7] = new Pionek("Pionek 8", Kolor.BIALY, new Pozycja(1, 7));
        //Czarne
        szachownica[7][0] = new Wieza("Wieża L", Kolor.CZARNY, new Pozycja(7, 0));
        szachownica[7][1] = new Skoczek("Skoczek L", Kolor.CZARNY, new Pozycja(7, 1));
        szachownica[7][2] = new Goniec("Goniec L", Kolor.CZARNY, new Pozycja(7, 2));
        szachownica[7][3] = new Krol("Krol", Kolor.CZARNY, new Pozycja(7, 3));
        szachownica[7][4] = new Hetman("Hetman", Kolor.CZARNY, new Pozycja(7, 4));
        szachownica[7][5] = new Goniec("Goniec P", Kolor.CZARNY, new Pozycja(7, 5));
        szachownica[7][6] = new Skoczek("Skoczek P", Kolor.CZARNY, new Pozycja(7, 6));
        szachownica[7][7] = new Wieza("Wieża P", Kolor.CZARNY, new Pozycja(7, 7));

        szachownica[6][0] = new Pionek("Pionek 1", Kolor.CZARNY, new Pozycja(6, 0));
        szachownica[6][1] = new Pionek("Pionek 2", Kolor.CZARNY, new Pozycja(6, 1));
        szachownica[6][2] = new Pionek("Pionek 3", Kolor.CZARNY, new Pozycja(6, 2));
        szachownica[6][3] = new Pionek("Pionek 4", Kolor.CZARNY, new Pozycja(6, 3));
        szachownica[6][4] = new Pionek("Pionek 5", Kolor.CZARNY, new Pozycja(6, 4));
        szachownica[6][5] = new Pionek("Pionek 6", Kolor.CZARNY, new Pozycja(6, 5));
        szachownica[6][6] = new Pionek("Pionek 7", Kolor.CZARNY, new Pozycja(6, 6));
        szachownica[6][7] = new Pionek("Pionek 8", Kolor.CZARNY, new Pozycja(6, 7));
    }

    public void wyczyscSzachownice() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                szachownica[i][j] = null;
            }
        }
    }
}
