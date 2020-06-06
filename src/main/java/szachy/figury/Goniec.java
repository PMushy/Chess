package szachy.figury;

import szachy.Figura;
import szachy.Kolor;
import szachy.Pozycja;

public class Goniec extends Figura {

    public Goniec() {
    }

    public Goniec(String name, Kolor color, Pozycja pozycja) {
        super(name, color, pozycja);
    }

    @Override
    public boolean czyDozRuch(Pozycja start, Pozycja end) {
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return x == y;
    }
}
