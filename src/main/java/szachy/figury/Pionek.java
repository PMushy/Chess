package szachy.figury;

import szachy.Figura;
import szachy.Kolor;
import szachy.Pozycja;

public class Pionek extends Figura {

    public Pionek() {
    }

    public Pionek(String name, Kolor color, Pozycja pozycja) {
        super(name, color, pozycja);
    }

    @Override
    public boolean czyDozRuch(Pozycja start, Pozycja end) {
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return (x == 1) && (y == 0);
    }
}
