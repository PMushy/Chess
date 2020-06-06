package program;

import figury.*;

public class Szachownica {
    private Pole[][] pola = new Pole[8][8];

    public Szachownica() {
        this.nowaSzachownica();
    }

    public Pole getPole(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
        return pola[x][y];
    }

    public void nowaSzachownica() {
        //Białe
        pola[0][0] = new Pole(0, 0, new Wieza("Wieża L", true));
        pola[0][1] = new Pole(0, 1, new Skoczek("Skoczek L", true));
        pola[0][2] = new Pole(0, 2, new Goniec("Goniec L", true));
        pola[0][3] = new Pole(0, 3, new Krolowa("Królowa", true));
        pola[0][4] = new Pole(0, 4, new Krol("Król", true));
        pola[0][5] = new Pole(0, 5, new Goniec("Goniec P", true));
        pola[0][6] = new Pole(0, 6, new Skoczek("Skoczek P", true));
        pola[0][7] = new Pole(0, 7, new Wieza("Wieża P", true));

        pola[1][0] = new Pole(1, 0, new Pionek("Pionek 1", true));
        pola[1][1] = new Pole(1, 1, new Pionek("Pionek 2", true));
        pola[1][2] = new Pole(1, 2, new Pionek("Pionek 3", true));
        pola[1][3] = new Pole(1, 3, new Pionek("Pionek 4", true));
        pola[1][4] = new Pole(1, 4, new Pionek("Pionek 5", true));
        pola[1][5] = new Pole(1, 5, new Pionek("Pionek 6", true));
        pola[1][6] = new Pole(1, 6, new Pionek("Pionek 7", true));
        pola[1][7] = new Pole(1, 7, new Pionek("Pionek 8", true));
        //Czarne
        pola[7][0] = new Pole(7, 0, new Wieza("Wieża L", false));
        pola[7][1] = new Pole(7, 1, new Skoczek("Skoczek L", false));
        pola[7][2] = new Pole(7, 2, new Goniec("Goniec L", false));
        pola[7][3] = new Pole(7, 3, new Krolowa("Królowa", false));
        pola[7][4] = new Pole(7, 4, new Krol("Król", false));
        pola[7][5] = new Pole(7, 5, new Goniec("Goniec P", false));
        pola[7][6] = new Pole(7, 6, new Skoczek("Skoczek P", false));
        pola[7][7] = new Pole(7, 7, new Wieza("Wieża P", false));

        pola[6][0] = new Pole(6, 0, new Pionek("Pionek 1", false));
        pola[6][1] = new Pole(6, 1, new Pionek("Pionek 2", false));
        pola[6][2] = new Pole(6, 2, new Pionek("Pionek 3", false));
        pola[6][3] = new Pole(6, 3, new Pionek("Pionek 4", false));
        pola[6][4] = new Pole(6, 4, new Pionek("Pionek 5", false));
        pola[6][5] = new Pole(6, 5, new Pionek("Pionek 6", false));
        pola[6][6] = new Pole(6, 6, new Pionek("Pionek 7", false));
        pola[6][7] = new Pole(6, 7, new Pionek("Pionek 8", false));

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                pola[i][j] = new Pole(i, j, null);
            }
        }
    }

    public void wypiszWszystko() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
            try {
                System.out.println(pola[i][j].getFigura().getNazwa());
            } catch (Exception e){
                System.out.println("Puste pole");
            }
        }
    }
}
