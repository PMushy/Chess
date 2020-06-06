package figury;

import program.Figura;
import program.Pole;
import program.Szachownica;

public class Pionek extends Figura {
    private String nazwa = "Pionek";

    public Pionek(String nazwa, Boolean bialy) {
        super(nazwa, bialy);
    }

    public boolean czyDozRuch(Szachownica board, Pole start, Pole end) {
        if (end.getFigura().isBialy() == this.isBialy()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return (x == 0) && (y == 1);
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Pionek{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
